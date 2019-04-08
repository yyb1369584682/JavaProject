package cn.gouzaofangfa.demon_7;
/*
Student类和Worker类有相同的成员变量name，age
继承思想，共性抽取，形成父类Person
成员变量，私有修饰
同时需要在创建学生和工人的时候,为对象赋值
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
