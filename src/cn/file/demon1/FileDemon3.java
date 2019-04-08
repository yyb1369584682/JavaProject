package cn.file.demon1;

import java.io.File;
import java.io.IOException;

/*
File类的创建和删除功能
是指对文件或者是目录
 */
public class FileDemon3 {
    public static void main(String[] args) throws IOException {
        function4();

    }
    /*
    File类的删除功能
    Boolean delete()
    删除的文件或文件夹在File构造方法中给出
    删除成功返回true，删除失败返回false
    删除方法，不走回收站，直接从硬盘中删除
    删除有风险，运行需谨慎
     */
    public static void function4(){
        File file = new File("D:\\abc.docx");
        boolean delete = file.delete();
        System.out.println(delete);
    }
    /*
    File创建文件夹
    boolean mkdir() 创建单层目录
    boolean mkdirs() 创建单层或多层目录
    创建的路径也在File构造方法中给出
    文件夹已经存在的话，不再创建
     */
    public static void function3(){
        File file = new File("D:\\a\\b\\c\\d");
        boolean mkdir = file.mkdirs();
        System.out.println(mkdir);
    }
    /*
    File创建文件的功能
    boolean createNewFile()
    创建的文件路径和文件名，在File构造方法中给出
    如果指定的文件已经存在的话，将不再创建
     */
    public static void function() throws IOException {
        File file = new File("D:abc.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}
