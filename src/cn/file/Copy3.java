package cn.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
字符流复制文本文件，必须是文本文件，不能复制图片
字符流查询本机默认的编码表，简体中文GBK
FileReader读取数据源
FileWriter写入发到数据目的
 */
public class Copy3 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("d:\\p.PNG");
            fw = new FileWriter("c:\\p.PNG");
            char[] ch = new char[1024];
            int len = 0;
            while((len = fr.read(ch)) != -1){
                fw.write(ch,0,len);
                fw.flush();
            }
        }catch (IOException ex){
            System.out.println(ex);
            throw new RuntimeException("复制失败");
        }finally {
            try{
                fw.close();
            }catch(IOException ex){
                throw new RuntimeException("释放资源失败");
            }finally {
                try{
                    fr.close();
                }catch(IOException ex){
                    throw new RuntimeException("释放资源失败");
                }
            }

        }
    }
}
