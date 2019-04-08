package cn.dayinliu;

import org.apache.commons.io.FilenameUtils;

import java.io.*;

/*
打印流实现文本复制
    读取数据源 BufferedReader+File读取文本行
    写入数组目的PrintWriter+println自动刷新
 */
public class PrintWriterDemon1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:\\a.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("d:\\a.txt") );
        String len = null;
        while((len = br.readLine())!= null){
            pw.println(len);
        }
        pw.close();
        br.close();
    }
}
