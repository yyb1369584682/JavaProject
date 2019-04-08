package cn.fanshe.demon1;

import java.lang.reflect.Constructor;

/*
反射获取私有的构造方法运行
不推荐使用，破坏了程序的封装性，安全性
暴力反射
 */
public class ReflectDemon5 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("cn.fanshe.demon1.Person");
        //getDeclaredConstructors()获取所有的构造方法，包括私有的
        Constructor[] cons = c.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
        //Constructor getDeclaredConstructor(Class...c)获取指定参数列表的构造方法
        Constructor con = c.getDeclaredConstructor(int.class, String.class);

        //Constructor类，父类AccessibleObject，定义方法setAccessible（boolean b）
        con.setAccessible(true); //取消运行时的权限检查

        Object obj = con.newInstance(18, "李四");
        System.out.println(obj);
    }
}
