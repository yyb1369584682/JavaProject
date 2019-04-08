package cn.zijieliu;

import java.io.FileWriter;
import java.io.IOException;

/*
字符输出流
    java.io.Writer所有字符输出流的超类
    写文件，写文本文件
写的方法write
    write（int c）写一个字符
    write(char[] c)写字符数组
    write(char[] c,int,int)字符数组一部分，开始索引，写几个
    write（String s）写入字符串
 Writer类是抽象类，找到他的子类对象FileWriter
    构造方法：写入的数据目的
    可以接收的类型：File 类型
                    String 类型
字符输出流写数据的时候，必须要运行一个功能，刷新功能
flush（）
 */
public class WriterDemon {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:\\a.txt");
        //写一个字符
        fw.write(100);
        fw.flush();

        //写一个字符数组
        char[] c = {'a','b','c','d','e'};
        fw.write(c);
        fw.flush();

        //写入字符数组的一部分
        fw.write(c,0,2);
        fw.flush();

        //写入字符串
        fw.write("hello");
        fw.flush();

        fw.close();
        System.out.println(fw);
    }

}
