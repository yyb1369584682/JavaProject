package cn.huanchongliu;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
字节输出流的缓冲流
java.io.BufferedOutputStream作用：提高原有输出流的写入效率
BufferedOutputStream(OutputStream)
方法，写入write字节，字节数组
构造方法：BufferedOutputStream(OutputStream out)
可以传递任意的字节输出流，传递的是哪个字节流，就对哪个字节流提高效率。
 */
public class BufferedOutputStreamDemon {
    public static void main(String[] args)throws IOException {
        //创建字节输出流，绑定文件
        FileOutputStream fos = new FileOutputStream("c:\\buffer.txt");
        //创建字节输出流缓冲流的对象，构造方法中，传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //写一个字节
        bos.write(55);

        byte[] b = "helloworld".getBytes();
        //写一个字节数组
        bos.write(b);
        //写数组的一部分
        bos.write(b,0,2);
        bos.close();
    }
}
