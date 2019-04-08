package cn.String.Demo_01;

public class StringDemon3 {
    public static void main(String[] args) {
       function();
    }
    /*
    定义方法，String类的构造方法
    String（byte[] bytes）传递字节数组
    通过使用平台的默认字符集解码指定的byte数组，构造一个新的String
    平台：机器操作系统
    默认字符集：操作系统中的默认编码表，默认编码表GBK
    将字符数组中的每个字节，查询了编码表，得到结果
    字节是负数，汉字的字节编码就是负数，默认编码表，一个汉字采用2个字节表示
     */
    public static void function(){
        byte[] b = {97,98,99,100};
        //调用String类的构造方法，传递字节数组
        String s = new String(b);
        System.out.println(s);
    }
}
