package cn.file.demon1;

import java.io.File;

//File的判断功能
public class FileDemon5 {
    public static void main(String[] args) {
        function1();
    }
    /*
    File判断功能
    boolean isDirectory()
    判断File构造方法中封装的路径是不是文件夹
    如果是文件夹，则返回true，否则返回false

    //boolean isFile()
    判断File构造方法中封装的路径是不是文件
     */
    public static void function1(){
        File file = new File("d:\\eclipse\\eclipse");
        if(file.exists()){
            boolean directory = file.isDirectory();
            System.out.println(directory);
        }


    }
    /*
    File判断功能
    boolean exist()
    判断File构造方法中封装路径是否存在
    存在返回true，不存在返回false
     */
    public static void function(){
        File file = new File("abc");
        boolean exists = file.exists();
        System.out.println(exists);
    }
}
