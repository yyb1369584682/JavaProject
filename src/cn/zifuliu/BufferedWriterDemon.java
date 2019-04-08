package cn.zifuliu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
字符输出流缓冲区流
    java.io.BufferedWriter继承Writer
    写入方法write()可以写入单个字符，字符数组，字符串

    构造方法：
    BufferedWriter(Writer w)传递任意字符输出流
    传递谁，就高效谁
    能传递的字符输出流FileWriter，OutputStreamWriter

    BufferedWriter具有自己特有的方法
    void newLine()
    newLine()文本中换行，\r\n也是文本换行
    newLine()方法具有平台无关性
    Windows \r\n
    Linux \n
    newLine（）运行结果，和操作系统是相互关系
    JVM：安装的是Windows版本，newLine（）写的就是\r\n
        安装的就是Linux版本，newLine（）写的就是\n
 */
public class BufferedWriterDemon {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("c:\\a.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        //写一个字符
        bw.write(97);
        bw.flush();
        //写一个字符数组
        bw.write("helloworld".toCharArray());
        bw.flush();
        //写一个字符串
        bw.write("hello");
        bw.flush();
        bw.close();
    }


}
