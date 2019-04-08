package cn.xuliehua;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    //静态不能序列化
//    private static int age;
    //transient阻止成员变量序列化
//    private transient int age;
    private int age;
    static final long serialVersionUID = 10L;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
