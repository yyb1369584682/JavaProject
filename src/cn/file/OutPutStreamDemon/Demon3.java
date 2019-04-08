package cn.file.OutPutStreamDemon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
FileOutPutStream文件的续写和换行问题
续写：FileOutPutStream构造方法的第二个参数中，加入true
在文件中，写入换行，符号换行\r\n
\r\n可以写在上一行的末尾，也可以写在下一行的开头
 */
public class Demon3 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\demon\\a\\a.txt");
        FileOutputStream fos = new FileOutputStream(file,true);
        fos.write("hello\r\n".getBytes());
        fos.write("world".getBytes());
        //关闭资源
        fos.close();
    }
}
