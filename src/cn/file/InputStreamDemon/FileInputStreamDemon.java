package cn.file.InputStreamDemon;

import java.io.FileInputStream;
import java.io.IOException;

/*
构造方法：为这个流对象绑定数据源
参数：
    File 类型对象
    String 对象
输入流读取文件的步骤
    1、创建字节输入流的子类对象
    2、调用读取方法read读取
    3、关闭资源
read()方法
    read()执行一次，就会自动读取下一个字节
    返回的是读取到的字节
 */
public class FileInputStreamDemon {
    //读取文件内容
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\demon\\a\\a.txt");
        //读取一个字节，调用方法read，返回int
        //使用循环方式读取文件，循环结束的条件：read()方法返回-1
        int read = 0;
        while((read =fis.read()) != -1){
            System.out.print((char)read);
        }
        fis.close();
    }
}
