package cn.tcp.demon1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
实现TCP服务器程序
表示服务器程序的类Java.net.ServerSocket
构造方法：
    ServerSocket(int port)传递端口号

 很重要的事情：必须要获取客户端的套接字对象Socket
    Socket accept()
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        //调用服务器套接字对象中的方法accept（）获取客户端套接字对象
        Socket socket = server.accept();
        //通过客户端套接字对象，socket获取字节输入流，读取的是客户端送来的数据

        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = in.read(bytes);
        System.out.println(new String(bytes,0,len));

        //服务器向客户端返回数据，字节输出流，通过客户端套接字对象获取字节输出流
        OutputStream out = socket.getOutputStream();
        out.write("收到，谢谢！".getBytes());

        //关闭资源
        socket.close();
        server.close();
    }
}
