package cn.gouzaofangfa.demon_03;
/*
this.的方式，区分局部变量和成员变量同名的情况
this在构造方法之间调用，语法this()
 */
public class Person {
    private String name;
    private int age;

//    public Person(){
//        name = "李四";
//        age = 24;
//    }
    public Person(){
        //调用了有参数构造方法，参数李四，20传递给了name,age
        this("李四",24);//this()必须放在构造器的第一行
    }

    /*
    构造方法，传递String，int
    在创建对象的同时为成员变量赋值
     */
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
