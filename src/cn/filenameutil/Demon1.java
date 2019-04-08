package cn.filenameutil;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

public class Demon1 {
    public static void main(String[] args) throws IOException{
        function7();
    }
    /*
    FileUtils工具类的方法
    static void copyDirectoryToDirectory（File src,File desc）
    复制文件夹
     */
    public static void function7()throws IOException{
        FileUtils.copyDirectoryToDirectory(new
                File("d:\\demon"),new File("c:\\"));
    }
    /*
    FileUtils工具类的方法
    static void copyFile（File src,File desc）
    复制文件
     */
    public static void function6()throws IOException{
        FileUtils.copyFile(new
                File("c:\\1.psd"),new File("d:\\1.psd"));

    }
    /*
     FileUtils工具类的方法
     static void writeStringToFile(File src，String date)
     将字符串直接写到文件中
     */
    public static void function5()throws IOException{
        FileUtils.writeStringToFile(new File("c:\\a.txt"),"java编程");
    }
    /*
    FileUtils工具类的方法
    static String readFileToString（File src）读取文本，返回字符串
     */
    public static void function4()throws IOException {
        String s = FileUtils.readFileToString(new File("c:\\a.txt"));
        System.out.println(s);
    }
    /*
    FilenameUtils类的方法
    static boolean isExtension(String Filename,String extension)
    判断文件名的后缀是不是extension
     */
    public static void function3(){
        boolean b = FilenameUtils.isExtension("c:a.txt","ava");
        System.out.println(b);
    }
    /*
    FilenameUtils类的方法
    static String getName（）
    获取文件名
     */
    public static void function2(){
        String name = FilenameUtils.getName("c:\\a.txt");
        System.out.println(name);
    }
    /*
    FilenameUtils类的方法
    static String getExtension(String filename)
    获取文件名的扩展名
     */
    public static void function(){
        String ex = FilenameUtils.getExtension("c:\\a.java");
        System.out.println(ex);
    }
}
