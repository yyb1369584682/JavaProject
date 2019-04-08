package cn.file.demon2;

import java.io.File;

/*
对一个目录下的所有内容，进行完全遍历
 */
public class FileDemon {
    public static void main(String[] args) {
        File dir = new File("d:\\eclipse");
        get(dir);

    }
    /*
    定义方法，实现目录的全遍历
     */
    public static void get(File dir){
        System.out.println(dir);
        //调用listFiles()对目录dir进行遍历
        File[] list = dir.listFiles();
        for (File file : list) {
            //判断file是不是文件夹，若是，则继续遍历
            if(file.isDirectory()){
                //递归调用
                get(file);
            }else{
                System.out.println(file);
            }
        }
    }
}
