package cn.staticdemon_01;
/*
定义Person类
定义对象的特有数据和对象的共享数据
对象的特有数据（非静态修饰）调用者只能是new对象
对象的共享数据（静态修饰）调用者可以是new对象，也可以是类名

被静态修饰的成员，可以被类名直接调用
 */
public class Person {
    String name;
    static String className;
}
