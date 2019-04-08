package cn.fanshe.demon1;
/*
反射获取构造方法并运行，有快捷点的方式
有前提：
    1、被放射的类，必须具有空参构造方法
    2、构造方法权限必须为public
 */

public class ReflectDemon4 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("cn.fanshe.demon1.Person");
        //Class类中定义方法，T newInstance（）直接创建反射类的对象实例
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
