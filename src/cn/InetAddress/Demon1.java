package cn.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
表示互联网中的IP地址
    Java.net.InetAddress
静态方法
    static InetAddress getLocalHost() LocalHost本地主机
    返回本地主机，返回值InetAddress对象

    static InetAddress getByName(String hostName)传递主机名，获取IP地址对象
非静态方法
    String getHostAddress()获取主机IP地址
    String getHostName()获取主机名
 */
public class Demon1 {
    public static void main(String[] args)throws UnknownHostException {
//        function();
        function_1();
    }
    public static void function_1()throws UnknownHostException{
        InetAddress ip = InetAddress.getByName("W56-201741");
        System.out.println(ip);
    }
    public static void function()throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        //输出结果就是主机名和IP地址
        System.out.println(localHost);
        String s = localHost.toString();
        //切分主机名和IP
        String[] split = s.split("/");
        System.out.println("主机名 "+split[0]);
        System.out.println("IP "+split[1]);
        //直接利用getHostName()获取主机名，getHostAddress()获取IP地址
        String hostName = localHost.getHostName();
        String address = localHost.getHostAddress();
        System.out.println("主机名 "+hostName+" IP "+address);


    }
}
