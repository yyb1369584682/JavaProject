package cn.object.demon_01;
/*
定义Person类
    属性：姓名，年龄
 */
public class Person {
    //定义成员变量：姓名，年龄
    private String name;
    private int age;

    //定义无参构造器
    public Person(){}
    //定义有参构造器
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //重写toString方法
    public  String toString(){
        return name+age;
    }
    //重写equals方法
    public boolean equals(Object obj){
        //参数接收的是Person对象，才能转型
        if(obj instanceof Person){
            Person p = (Person)obj; //obj向下转型
            return this.age == p.age;
        }
        return false;

    }
    //定义name,age的set,get方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
