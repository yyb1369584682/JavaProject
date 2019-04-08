package cn.file.demon1;

import java.io.File;
/*
File类的获取功能
list
listFile
 */
public class FileDemon6 {
    public static void main(String[] args) {
        function4();
    }
    public static void function4(){
        //获取系统中的所有根目录
        File[] files = File.listRoots();
        for (File file : files) {
            System.out.println(file);
        }
    }
    /*
    File类的获取功能
    File[] listFiles()
    获取到File构造方法中封装的路径中的文件和文件夹名（遍历一个目录）
    返回的是目录或者文件的全路径
     */
    public static void function3(){
        File file = new File("d:\\eclipse\\eclipse");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

    }
    /*
    File类的获取功能
    String[]list()
    获取到File构造方法中封装的路径中的文件和文件夹名（遍历一个目录）
     */
    public static void function(){
        File file = new File("d:\\eclipse\\eclipse");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

    }
}
