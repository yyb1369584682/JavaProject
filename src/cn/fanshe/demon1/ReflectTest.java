package cn.fanshe.demon1;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
定义集合类，泛型String
要求向集合中添加Integer类型

反射方式，获取出集合ArrayList类的Class文件对象
通过class文件对象，调用add方法

对反射方法是否理解
 */
public class ReflectTest {
    public static void main(String[] args)throws Exception {
        ArrayList<String> array = new ArrayList<String>();
        array.add("a");
        //反射方式，获取出集合ArrayList类的class文件对象
        Class c = array.getClass();  //编译后的class文件中没有泛型
        //获取ArrayList文件中的add方法
        Method method = c.getMethod("add", Object.class);
        //使用invoke运行ArrayList方法add
        method.invoke(array,123);
        method.invoke(array,123.2);
        method.invoke(array,true);
        System.out.println(array);

    }

}
