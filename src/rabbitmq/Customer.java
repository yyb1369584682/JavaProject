package rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/**
 * 消息消费者
 */
public class Customer {
	private final static String QUEUE_NAME = "test02";
	private static Map<String, Object> arguments = new HashMap<String, Object>();

	public static void main(String[] args) throws IOException, TimeoutException {
		// 创建连接工厂
		ConnectionFactory factory = new ConnectionFactory();
		//设置RabbitMQ地址
		factory.setHost("localhost");
//		factory.setHost("rabbitHost");
		//设置RabbitMQ连接用户名
//		factory.setUsername("rabbitUser");
		//设置RabbitMQ连接密码
//		factory.setPassword("rabbitPassWd");
		//创建一个新的连接
		Connection connection = factory.newConnection();
		//创建一个通道
		Channel channel = connection.createChannel();
		//队列最大存储记录数
		arguments.put("x-message-ttl", 10000);
		/**声明要关注的队列
		 * 第一个参数表示队列名称
		 * 第二个参数为是否持久化（true表示是，队列将在服务器重启时生存）
		 * 第三个参数为是否是独占队列（创建者可以使用的私有队列，断开后自动删除）
		 * 第四个参数为当所有消费者客户端连接断开时是否自动删除队列
		 * 第五个参数为队列的其他参数
		 */
		channel.queueDeclare(QUEUE_NAME, true, false, true,arguments);
		System.out.println("Customer Waiting Received messages");
		//DefaultConsumer类实现了Consumer接口，通过传入一个频道，
		// 告诉服务器我们需要那个频道的消息，如果频道中有消息，就会执行回调函数handleDelivery
		Consumer consumer = new DefaultConsumer(channel) {

			public void handleDelivery(String consumerTag, Envelope envelope,
			                           AMQP.BasicProperties properties, byte[] body)
					throws IOException {
				String message = new String(body);
				System.out.println("Customer Received '" + message + "'");
			}
		};
		//自动回复队列应答 -- RabbitMQ中的消息确认机制

		channel.basicConsume(QUEUE_NAME, true, consumer);
	}
}
