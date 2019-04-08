package cn.fanshe.demon1;
/*
获取一个类的class文件对象的三种方式
1、对象获取
2、类名获取
3、Class类的静态方法获取
 */
public class ReflectDemon1 {
    public static void main(String[] args) throws ClassNotFoundException{
        //1、对象获取
        Person p = new Person();
        Class c = p.getClass();
        System.out.println(c);

        //2、类名获取(类名直接获取其静态属性)
        //每个类型，包括基本和引用，都会赋予这个类型一个静态的属性，属性名字为class
        Class c1 = Person.class;
        System.out.println(c1);

        System.out.println(c==c1);//true（比较对象的内存地址）
        System.out.println(c.equals(c1));

        //3、Class类的静态方法获取 forName(字符串的类名)
        Class c2 = Class.forName("cn.fanshe.demon1.Person");
        System.out.println(c2);


    }
}
