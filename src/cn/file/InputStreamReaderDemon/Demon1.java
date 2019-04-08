package cn.file.InputStreamReaderDemon;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
转换流
java.io.InputStreamReader继承Reader
字符输出流，读取文本文件
字节流向字符的桥梁，将字节流转换成字符流
读取方法：
      read()读取一个字符，读取字符数组
技巧：OutputStreamWriter写文件
      InputStreamReader读取文件

      OutputStreamWriter（OutputStream out）所有字节输出流
      InputStreamReader（InputStream in）接收所有的字节输入流
      InputStreamReader（InputStream in,String charsetName）接收所有的字节输入流，传递编码表的名字
 */
public class Demon1 {
    public static void main(String[] args) throws IOException {
        readGBK();
        readUTF();
    }
    /*
        转换流，InputStreamReader读取文件
        采用UTF-8编码表，读取utf文件
         */
    public static void readUTF() throws IOException{
        //创建自己输入流，传递文本文件
        FileInputStream fis = new FileInputStream("c:\\utf.txt");
        //创建转换流对象，构造方法中，包装字节输入流，同时写编码表名
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        char[] ch = new char[1024];
        int len = 0;
        while((len = isr.read(ch))!= -1){
            System.out.println(new String(ch,0,len));
        }
        isr.close();
    }

    /*
    转换流，InputStreamReader读取文件
    采用系统默认的编码表，读取GBK文件
     */
    public static void readGBK()throws IOException{
        //创建字节输入流，读取文本文件
        FileInputStream fis = new FileInputStream("c:\\gbk.txt");
        //创建转换流对象，构造方法，包装字节输入流
        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        char[] ch = new char[1024];
        int len = 0;
        while((len = isr.read(ch))!= -1){
            System.out.println(new String(ch,0,len));
        }
        isr.close();
    }

}
