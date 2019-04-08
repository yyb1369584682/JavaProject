package cn.tcp.demon2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
实现图片上传服务器（单线程）
实现步骤：
    1、创建ServerSocket套接字对象，监听8888端口
    2、方法accept（）获取客户端的连接对象
    3、客户端连接对象获取字节输入流，读取客户端发送图片
    4、创建File对象，绑定上传文件夹
        判断文件夹是否存在，不存在，则创建文件夹
    5、创建字节输出流，数据目的File对象所在文件夹
    6、字节流读取图片，字节流将图片写入到文件夹中
    7、将上传成功回写到客户端
    8、关闭资源
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建连接客户端套接字Socket对象
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();

        //把上传图片作为输入，保存
        InputStream in = socket.getInputStream();

        //将目的文件夹封装到File对象
        File upload = new File("d:\\upload");
        if(!upload.exists())
            upload.mkdirs();

        //防止文件同名被覆盖，重新定义文件名字
        //规则：域名+毫秒值+6位随机数
        String filename = "gree"+System.currentTimeMillis()+new Random().nextInt(999999)+".psd";
        //创建字节输出流，把上传上来的图片保存到服务器文件夹中
        FileOutputStream fos = new FileOutputStream(upload+File.separator+filename);
        //创建字节数组
        byte[] data = new byte[1024];
        int len = 0;
        while((len = in.read(data)) != -1){
            fos.write(data,0,len);
        }
        //提示上传完成，并返回给客户端
        OutputStream outs = socket.getOutputStream();
        outs.write("上传完成".getBytes());

        //关闭资源
        fos.close();
        outs.close();
        socket.close();
        server.close();

    }
}
