package cn.tcp.demon2;
/*
多线程上传图片到服务器
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTheradServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while(true){
            //获取到一个客户端，必须开启一个新线程
            Socket socket = server.accept();
            new Thread(new Upload(socket)).start();

        }

    }
}
