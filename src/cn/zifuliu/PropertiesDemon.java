package cn.zifuliu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
集合对象Properties类，继承Hashtable，实现Map接口
可以和IO对象结合使用，实现数据的持久存储
 */
public class PropertiesDemon {
    public static void main(String[] args) throws IOException {
//        function();
        function3();

    }
    /*
    Properties集合的特有方法store
    store（OutputStream out）
    store(Write w)
    接收所有的字节或者字符的输出流，将集合中的键值对，写回到文件中保存
     */
    public static void function3()throws IOException{
        Properties pro = new Properties();
        pro.setProperty("name","李四");
        pro.setProperty("age","30");
        pro.setProperty("email","456@qq.com");
        FileWriter fr = new FileWriter("c:\\pro.properties");
        pro.store(fr,"yyb");
        fr.close();
    }
    /*
    集合的特有方法load
    load（InputStream in）
    load(Reader r)
    传递任意的字节或者字符输入流
    流对象读取文件中的键值对，保存到集合
     */
    public static void funnction2()throws IOException {
        Properties pro = new Properties();
        FileReader fr = new FileReader("c:\\pro.properties");
        pro.load(fr);
        fr.close();
        System.out.println(pro);
    }
    /*
    使用Properties集合，存储键值对
    setProperty等同与Map接口中的put
    setProperty（String kay, String value）
    通过键获取值，getProperty(String key)
     */
    public static void function(){
        Properties p = new Properties();
        p.setProperty("001","张三");
        p.setProperty("002","李四");
        p.setProperty("003","王五");
        System.out.println(p.getProperty("002"));
        System.out.println(p);

        //方法stringPropertyNames,将集合中的键存储到Set集合，类似于Map接口的方法keySet
        Set<String> set = p.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+" "+p.getProperty(key));
        }
    }
}
