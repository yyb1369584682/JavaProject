package cn.neibulei.demon_04;
/*
静态代码块，只执行一次
构造代码块，new一次执行一次，优先于构造方法
构造方法，new一次，就执行一次。
 */
public class Person {
    private String name;
    private int age;
    public  void person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("我是构造方法");
    }
    //构造代码块
    {
        System.out.println("我是构造代码块");
    }
    //静态代码块
    static {
        System.out.println("我是静态代码块");
    }
}
