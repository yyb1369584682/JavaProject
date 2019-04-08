package cn.fanshe.demon1;

import java.lang.reflect.Method;

/*
反射获取有参数的成员方法并执行
public void sleep(String ,int,double){}
 */
public class ReflectDemon8 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("cn.fanshe.demon1.Person");
        Object obj = c.newInstance();
        //调用Class类的方法getMethod获取获取指定的方法sleep
        Method method = c.getMethod("sleep", String.class, int.class, double.class);
        //调用Method类的方法invoke运行sleep方法
        method.invoke(obj,"休眠",100,56.2);
    }
}
