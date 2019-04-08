package cn.file.InputStreamDemon;

import java.io.FileInputStream;
import java.io.IOException;

/*
FileInputStream读取文件
    读取方法 int read(byte[] b)读取字节数组
    数组作用：缓冲的作用，提高效率。
    read返回的int，表示读取到多少有效字节个数
 */
public class FileInputDemon2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\demon\\a\\a.txt");
        //创建字节数组
        byte[] b = new byte[1024];
        int read = 0;
        while((read = fis.read(b)) != -1){
            System.out.println(new String(b,0,read)); //String（）把数组转化成字符串
        }
        fis.close();
    }
}
