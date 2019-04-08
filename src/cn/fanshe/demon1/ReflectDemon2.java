package cn.fanshe.demon1;
/*
通过反射获取class文件中的构造方法，运行构造方法
运行构造方法，创建对象
    获取class文件对象
    从文件对象中，获取需要的成员
 */
import java.lang.reflect.Constructor;

public class ReflectDemon2 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("cn.fanshe.demon1.Person");
        //使用class文件对象，获取类中的构造方法
        //Constructor[] getConstructors()获取class文件对象中的所有的公共的构造方法
//        Constructor[] cons = c.getConstructors();
//        for (Constructor con : cons) {
//            System.out.println(con);
//        }
        //获取指定的构造方法，空参数的构造方法
        Constructor con = c.getConstructor();
//        System.out.println(con); //public cn.fanshe.Demon1.Person()
        //运行空参数构造方法，Constructor类方法newInstance（）运行获取到的构造方法
        Object obj = con.newInstance();
        Person p = (Person) obj;
        p.eat();
        System.out.println(obj);
    }
}
