package cn.file.OutputStreamWriterDemon;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/*
转换流
    java.io.OutputStreamWriter 继承Writer类
    本身就是一个字符输出流，写文本文件
    write()字符，字节数组，字符串
    字符通向字节的桥梁，将字符流转换成字节流
    OutputStreamWriter 使用方式
    构造方法：
        OutputStreamWriter（OutputStream out）接收所有的字节输出流
        但是，对于字节输出流只有FileOutputStream
        OutputStreamWriter（OutputStream out,String charsetName）
        String charsetName传递编码表名字GBK（一个字占两个字节），UTF-8（一个字占三个字节）
        OutputStreamWriter有个子类，FileWriter不能更改编码表，OutputStreamWriter可以更改编码表
 */
public class Demon1 {
    public static void main(String[] args) throws IOException{
        writeGBK();
        writeUTF();
    }
    /*
    转换流对象OutputStreamWriter写文本
    文本采用UTF-8形式写入
     */
    public static void writeUTF()throws IOException{
        //创建字节输出流对象，绑定输出文件
        FileOutputStream fos = new FileOutputStream("c:\\utf.txt");
        //创建转换流对象，构造方法保证字节输出流，指定编码表是UTF-8
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        //转换流写数据
        osw.write("你好");
        osw.close();
    }
    /*
    转换流对象OutputStreamWrite写文本
    文本采用GBK的形式写入
     */

    public static void writeGBK()throws IOException {
        //创建字节输出流，绑定数据文件
        FileOutputStream fos = new FileOutputStream("c:\\gbk.txt");
        //创建转换流对象，构造方法，绑定字节输出流，使用GBK编码表
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        //转换流写数据
        osw.write("你好");
        osw.close();

    }
}
