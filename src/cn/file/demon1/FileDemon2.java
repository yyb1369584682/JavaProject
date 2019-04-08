package cn.file.demon1;

import java.io.File;

/*
File类的构造方法
三种重载形式
 */
public class FileDemon2 {
    public static void main(String[] args) {
        function2();

    }
    /*
    File(File parent，String child)
    传递路径，传递File类型父路径，字符串子路径
    好处：父路径是File类型，可以直接调用File的类方法
     */
    public static void function2(){
        File parent = new File("d:");
        File file = new File(parent, "eclipse");
        System.out.println(file);
    }
    /*
    File(String parent, String child)
    传递路径（字符串父路径，字符串子路径）
    好处:可以单独操作父路径和子路径
     */
    public static void function1(){
        File file = new File("C:", "windows");
        System.out.println(file);
    }
    /*
    File(String pathname)
    传递路径名：可以写到一个文件夹，也可以写到一个文件
    c:\\abc   c:\\abc\\Demon.java
    将路径封装File类型对象
     */
    public static void function(){
        File file = new File("d:\\eclipse");  //windows不区分大小写
        System.out.println(file);
    }
}
