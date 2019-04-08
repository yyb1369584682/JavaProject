package rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 消息生成者
 */
public class Producer {
	public final static String QUEUE_NAME="test02";

	public static void main(String[] args) throws IOException, TimeoutException {
		//创建连接工厂
		ConnectionFactory factory = new ConnectionFactory();
		//设置RabbitMQ相关信息
		factory.setHost("localhost");
		//factory.setUsername("lp");
		//factory.setPassword("");
		// factory.setPort(2088);
		//创建一个新的连接
		Connection connection = factory.newConnection();
		//创建一个通道
		Channel channel = connection.createChannel();
		//  声明一个队列        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		String message = "Hello RabbitMQ";
		//发送消息到队列中
		/**basicPublish
		 * 第一个参数为交换机名称
		 * 第二个参数为队列映射的路由key
		 * 第三个参数为消息的其他属性
		 * 第四个参数为发送信息的主体
		 */
		channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
		System.out.println("Producer Send +'" + message + "'");
		//关闭通道和连接
		channel.close();
		connection.close();
	}
}
