package cn.gouzaofangfa.demon_02;
//用两种方法调用构造函数
public class Test {
    public static void main(String[] args) {
        //创建Person类的对象就是在调用它的构造方法

        //1、调用空参数构造方法，创建对象
        Person p1 = new Person();
        p1.setName("旺财");
        p1.setAge(17);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        //2、调用两个参数的构造方法，创建对象
        Person p2 = new Person("张三", 23);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());

    }
}
