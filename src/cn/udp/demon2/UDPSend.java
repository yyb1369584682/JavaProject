package cn.udp.demon2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


/*
实现UDP发送，键盘输入的形式
输入完毕，发送给接收端
 */
public class UDPSend {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        //创建DatagramSocket对象，数组包的发送和接收对象
        DatagramSocket ds = new DatagramSocket();
        //创建InetAddress对象，封装自己的IP地址
        InetAddress localHost = InetAddress.getByName("127.0.0.1");
        while (true){
            String message = sc.nextLine();
            //创建数据包对象，封装要发送的数据，接收端IP，接口
            byte[] bytes = message.getBytes();

            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,localHost,8000);

            ds.send(dp);
//            ds.close();
        }


    }
}
