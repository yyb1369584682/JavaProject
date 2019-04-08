package cn.xuliehua;

import java.io.*;
/*
IO流对象，实现对象Person序列化，和反序列化
ObjectOutputStream写对象，实现序列化
ObjectInputStream读取对象，实现反序列化
静态不能序列化
 */

public class ObjectStreamDemon {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        writeObject();
        readObject();
    }
    /*
    ObjectInputStream
    构造方法：ObjectInputStream（InputStream in）
    传递任意的字节输入流，输入流封装文件，必须是序列化的文件
    Object readObject（）读取对象
     */
    public static void readObject()throws IOException,ClassNotFoundException{
        FileInputStream fs = new FileInputStream("c:\\a.txt");
        //创建反序列化流，构造方法中，传递字节输入流
        ObjectInputStream os = new ObjectInputStream(fs);
        //调用反序列化流的方法readObject（）读取对象
        Object read = os.readObject();
        System.out.println(read);
        os.close();
    }
    /*
    ObjectOutputStream
    构造方法：ObjectOutputStream（OutputStream out）
    传递任意的字节输出流
    void writeObject(Object obj)写出对象的方法

     */
    public static void writeObject()throws IOException {
        //创建字节输出流，封装文件
        FileOutputStream os = new FileOutputStream("c:\\a.txt");
        //创建写出对象的序列化流的对象，构造方法传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(os);
        Person p = new Person("张三",25);
        //调用序列化流的方法writeObject，写出对象
        oos.writeObject(p);
        oos.close();
    }
}
