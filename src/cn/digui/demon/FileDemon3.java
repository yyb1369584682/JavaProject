package cn.digui.demon;

import java.io.File;

/*
遍历目录，获取目录下的所有.java文件
遍历多级目录，方法递归实现
遍历过程中，使用过滤器
 */
public class FileDemon3 {
    public static void main(String[] args) {
        File dir = new File("d:\\demon");
        getAllDir(dir);
    }
    /*

     */
    public static void getAllDir(File dir){
        File[] files = dir.listFiles(new MyFilter());
        for (File file : files) {
            if(file.isDirectory()){
                getAllDir(file);
            }else {
                System.out.println(file);
            }

        }

    }
}
