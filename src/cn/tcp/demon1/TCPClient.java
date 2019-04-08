package cn.tcp.demon1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
实现TCP客户端，连接服务器和服务器实现数据交换
实现TCP客户端程序的类java.net.Socket

构造方法：
    Socket（String host,int port）传递服务器IP和端口号
    注意：构造方法只要运行，就会和服务器进行连接，连接失败，抛出异常

    OutputStream getOutputStream()返回套接字的输出流
    作用：将数据输出，输出到服务器

    InputStream getInputStream()返回套接字的输入流
    作用：从服务器端读取数据

    客户端服务器数据交换，必须使用套接字对象Socket中的获取
    的IO流，自己new的流，不行。
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建Socket对象，连接服务器
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("服务器OK".getBytes());

        //读取服务器发回的数据，使用socket套接字对象中的字节输入流
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        //把字节变为字符串输出
        System.out.println(new String(data,0,len));
        os.close();
    }
}
