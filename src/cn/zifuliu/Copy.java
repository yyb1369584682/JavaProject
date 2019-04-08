package cn.zifuliu;

import java.io.*;

/*
使用缓冲区流对象，复制文本文件
数据源 BufferedReader+FileReader 读取
数据目的BufferedWriter+FileWriter 写入
读取文本行，读一行，写一行，写换行
 */
public class Copy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\a.txt"));
        String line = null;
        while((line = br.readLine())!= null){
//            bw.write(line+"\r\n");
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
