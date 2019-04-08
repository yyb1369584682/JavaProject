package cn.dayinliu;

import java.io.*;
/*
打印流
    PrintStream 字节流
    PrintWriter 字符流
打印流的特点：
1、此流不负责数据源，只负责数据目的
2、为其他输出流添加功能
3、永远不会抛出IOException，但是可能会抛出其他的异常

两个打印流的方法，完全一致
唯一的区别是构造方法，就是打印流的输出目的端
PrintStream
    构造方法，接收File类型，接收字符串文件名，接收字节输出流OutputStream
PrintWriter
    构造方法，接收File类型，接收字符串文件名，接收字符输出流
    OutputStream，接收字符输出流Writer
 */
public class PrintWriterDemon {
    public static void main(String[] args) throws IOException{
        function4();

    }
    /*
    打印流可以开启自动刷新功能
    满足两个条件：
        1、输出的数据目的必须是流对象
        OutputStream Writer
        2、必须调用println,print,format三个方法中的一个，才会启用自动刷新
     */
    public static void function4()throws FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("c:\\4.txt");
        PrintWriter pw = new PrintWriter(fos,true);  //true开启自动刷新功能
        pw.println("i");
        pw.println("love");
        pw.println("java");
        //不需要刷新，关流，即可写入数据
        pw.close();
    }
    /*
    打印流，输出目的，是流对象
    可以是字节输出流，也可以是字符输出流
    OutputStream Writer
     */
    public static void function3()throws IOException{
        FileOutputStream fos = new FileOutputStream("c:\\2.txt");
        FileWriter fw = new FileWriter("c:3.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println("打印流");
        pw.close();

    }
    /*
    打印流，输出目的，String文件名
     */
    public static void function2() throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("c:\\1.txt");
        pw.println(3.5);
        pw.close();
    }
    /*
    打印流，向File对象的数据目的写入数据
    方法print不换行输出 println换行输出 均是原样输出
    writer走编码表
     */
    public static void function()throws FileNotFoundException {
        File file = new File("c:\\p.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(100);
        pw.write(100);
        //字符流写数据要刷写
        pw.close();
    }
}
