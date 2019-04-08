package cn.file.demon1;

import java.io.File;

/*
File类的获取功能
 */
public class FileDemon4 {
    public static void main(String[] args) {
        function3();

    }
    /*
    File类的获取功能
    String getParent()返回String对象
    File getParentFile()返回File对象
    获取父路径
     */
    public static void function3(){
        File file = new File("d:\\eclipse\\eclipse");
        File parent = file.getParentFile().getParentFile();
        System.out.println(parent);

    }
    /*
    File类获取功能
    String getAbsolutePath() 返回String对象
    File getAbsoluteFile() 返回File对象
    获取绝对路径
    写一个相对路径，返回的绝对路径为工程根目录
     */
    public static void function2(){
        File file = new File("abc");
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);
    }
    /*
    File类获取功能
    long length()
    返回路径中表示的文件的字节数
     */
    public static void function1(){
        File file = new File("d:\\eclipse\\eclipse\\eclipse.exe");
        long length = file.length();
        System.out.println(length);
    }
    /*
    File类的获取功能
    String getName()
    返回路径中表示的文件或文件夹名
    获取路径整的最后部分的名字
     */
    public static void function(){
        File file = new File("d:\\qq\\abc");
        String name = file.getName();
        System.out.println(name);

        String path = file.getPath();
        System.out.println(path);
        System.out.println(file);
    }
}
