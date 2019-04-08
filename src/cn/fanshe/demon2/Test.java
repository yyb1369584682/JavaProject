package cn.fanshe.demon2;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/*
调用Person方法，调用Student方法，调用Work方法
类不清楚，方法也不清楚
通过配置文件实现此功能
    运行的类和方法名字，以键值对的形式，写在文本中
    运行那个类，读取配置文件即可
实现步骤：
    1、准备配置文件，键值对
    2、IO流读取配置文件Reader
    3、文件中的键值对存储到集合中Properties
        集合保存的键值对就是类名和方法名
    4、反射获取指定类的class文件对象
    5、class文件对象，获取指定的方法
    6、运行方法
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //IO流读取配置文件
        FileReader fr = new FileReader("config.properties"); //文件要放在项目根目录下，跟src目录同级
        //创建集合对象
        Properties pro = new Properties();
        //调用集合load方法，传递流对象
        pro.load(fr);
        fr.close();
        //通过键获取值
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //反射获取指定类的class文件对象
        Class c = Class.forName(className);
        Object obj =c.newInstance();
        //获取方法名
        Method method = c.getMethod(methodName);
        method.invoke(obj);
    }
}
