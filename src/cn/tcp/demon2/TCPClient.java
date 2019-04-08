package cn.tcp.demon2;

import java.io.*;
import java.net.Socket;

/*
实现TCP图片上传客户端
实现步骤：
    1、Socket套接字连接服务器
    2、通过Socket获取字节输出流，写图片
    3、使用自己的流对象，读取图片数据源
        FileInputStream
    4、读取图片，使用字节输出流，将图片写到服务器
       采用字节数组进行缓冲
    5、通过Socket套接字获取字节输入流
       读取服务器发回来的上传成功
    6、关闭资源
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建Socket对象连接服务器
        Socket socket = new Socket("127.0.0.1",8888);
        //获取字节输出流，把图片作为输出上传至服务器
        OutputStream out = socket.getOutputStream();
        //创建字节输入流，把本地图片作为输入进行上传
        FileInputStream fis = new FileInputStream(new File("c:\\1.psd"));
        //创建字节数组
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            out.write(bytes,0,len);
        }
        //给服务器写终止序列(不写的话服务器将不能返回上传成功信息给客户端，
        // 且服务器和客户端将永久等待)
        socket.shutdownOutput();
        //获取字节输入流，接收服务器返回的完成信息
        InputStream in = socket.getInputStream();
        len = in.read(bytes);
        System.out.println(new String(bytes,0,len));
        //关闭资源
        fis.close();
        socket.close();
    }
}
