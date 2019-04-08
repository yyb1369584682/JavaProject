package cn.gouzaofangfa.demon_06;
/*
构造方法第一行，写this()或者super()
二者不能同时存在，必须二者选一，
保证子类的所有构造方法调用到父类构造方法即可

小结论：无论如何，子类的所有构造方法，都必须直接或间接调用到父类构造方法
子类的构造方法，什么都不写，默认构造方法第一行为super（）；
 */

public class Student extends Person {
    public Student(){
        this("ac");
    }
    public Student(String s ){
        super("123");
    }
}
