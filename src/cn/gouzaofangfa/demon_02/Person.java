package cn.gouzaofangfa.demon_02;

public class Person {
    private String name;
    private int age;
    //写空参数的构造方法
    public Person(){

    }
    //写带有两个参数的构造方法
    public Person(String name,int age){
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
