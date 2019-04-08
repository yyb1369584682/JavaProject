package cn.itcast.demon_04;
/*
描述现实生活中的人的事物
属性：姓名，年龄
功能：说话

出现安全问题：age问题，可能出现值为负数的情况
负数不会导致程序问题，但违反生活中的真实情况

提高安全问题：让外面的类，不允许直接调用我们的成员变量
新的关键字private（私有），属于成员修饰符，不能修饰局部变量
被private修饰的成员，只能在自己的本类中被使用。

this关键字
区分成员变量与局部变量同名情况
方法中，使用方法变量，用this.的形式
 */
public class Person {
    //人的姓名，成员变量
    String name;
    //人的年龄，成员变量
    private int age;
    //变量age被私有化后，需要提供方法，让外面的类使用
    //定义方法，对age变量进行赋值，方法名字必须以set开头
    public void setAge(int a){
        //对变量参数a进行范围限制
        if(a <0 || a > 100){
            //如果a超过范围，手动将age赋值为20
            age = 20;
        }else {
            //如果a没有超过范围，直接对age赋值
            age = a;
        }
    }
    //定义方法，对age获取值进行使用，方法名字get
    public int getAge(){
        return age;
    }

    //定义人说话功能，方法中要求说出自己的姓名和年龄
    public void spark(){
        System.out.println(name +"  "+age);
    }
}
