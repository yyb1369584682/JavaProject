package cn.huanchongliu;

import java.io.*;

/*
文件复制方式，字节流，一共4个方式
1、字节流读写单个字节  445792ms
2、字节流读写单个数组  609ms
3、字节流缓冲区流读写单个字节
4、字节流缓冲区流读写字节数组 144ms
 */
public class Copy {
    public static void main(String[] args)throws IOException{
        long l1 = System.currentTimeMillis();
        function2(new File("c:\\YNote.exe"),new File("d:\\YNote.exe"));
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);
    }
    /*
    方法，实现文件复制
    1、字节读写单个字节
     */
    public static void function1(File src,File desc)throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len = 0;
        while((len = fis.read())!= -1){
            fos.write(len);
        }
        fos.close();
        fis.close();
    }
    /*
    方法，实现文件复制
    2、字节流缓冲区流读写单个字节
     */
    public static void function2(File src,File desc)throws IOException{
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }
       fos.close();
       fis.close();
    }
    /*
    方法，实现文件复制
    3、字节流缓冲区流读写单个字节
     */
    public static void function3(File src,File desc)throws IOException{
//        FileInputStream fis = new FileInputStream(src);
//        FileOutputStream fos = new FileOutputStream(desc);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0;
        while((len = bis.read())!= -1){
            bos.write(len);
        }
        bos.close();
        bis.close();
    }
    /*
    方法，实现文件复制
    4、字节流缓冲区流读写字节数组
     */
    public static void function4(File src, File desc)throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes))!= -1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
