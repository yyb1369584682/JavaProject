package cn.zifuliu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
字符输入流缓冲流
    java.io.BufferedReader继承Reader
    读取功能read() 单个字节，字符数组
    构造方法：
        BufferedReader（Reader r）
        可以任意的字符输入流
            FileReader InputStreamReader
        BufferedReader自己的功能
        String readLine（）读取文本行\r\n(一次读取一行)

        方法读取到流末尾，返回null
        小特点：
        获取内容的方法一般都有返回值
        int 没有的话返回值为负数
        引用类型 没有的话发挥null
        Boolean 找不到返回的是false
        String s = null;
        String s = "null";
        readLine()方法返回行的有效字符，没有\r\n

 */
public class BufferedReaderDemon {
    public static void main(String[] args) throws IOException {
        //创建字符输入流缓冲流对象，构造方法传递字符字符输入流，包装数据源文件
        BufferedReader br = new BufferedReader(new FileReader("c:\\a.txt"));
        //调用缓冲流的方法readLine（）读取文本行
//        String line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);
        String line = null;
        int lineNum = 0;  //行号
        while((line = br.readLine())!= null){
//            System.out.println(line);
            lineNum++;
            System.out.print(lineNum+"  "+line+"\r\n");
        }
        //关闭资源
        br.close();

    }
}
