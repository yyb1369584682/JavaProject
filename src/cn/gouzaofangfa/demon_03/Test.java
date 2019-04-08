package cn.gouzaofangfa.demon_03;

public class Test {
    public static void main(String[] args) {
        //创建Person类，调用的是空参数的构造方法
        Person p = new Person();
//        Person p = new Person("张三",30);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
