package cn.finaldemon_02;
/*
final修饰成员变量
成员变量，在堆内存，具有默认值
成员变量必须在初始化后才能被赋值。
成员变量的赋值，有两种实现方式
一是定义的时候直接赋值
另一种是采用构造方法赋值
保证：被final修饰的成员变量，只能被赋值一次。

final修饰的成员变量，需要在创建对象前赋值，否则报错
构造方法，是创建对象中的事情，可以为成员变量赋值
setXXX方法，创建对象之后的事情，不能为final修饰的成员赋值
 */
public class Person {
    final int age;

    public Person(int age){
        this.age = age;
    }
//    public void setAge(int age){
//        this.age = age;
//    }
}
