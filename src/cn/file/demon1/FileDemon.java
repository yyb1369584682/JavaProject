package cn.file.demon1;

import java.io.File;

/*
java.io.File
    将操作系统中的，文件，目录（文件夹），路径，封装何曾File对象
    提供方法，操作系统中的内容
    File是个与系统无关的类
    文件file  目录directory 路径path
 */
public class FileDemon {
    public static void main(String[] args) {
        //File类静态成员变量，与系统有关的路径分隔符
        String separtor = File.pathSeparator;
        System.out.println(separtor); //输出结果为分号；windows中的目录分隔符，Linux 中为冒号：
        //与系统有关的默认名称分隔符
        String separator = File.separator;
        System.out.println(separator);      //输出为向右斜线\目录名称分割，Linux为/

    }


}
