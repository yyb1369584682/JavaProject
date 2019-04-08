package cn.itcast.demon_05;
/*this关键字：本类对象引用
哪个对象调用的。this就表示哪一个对象
p对象，调用方法say（），调用者就是p对象
say()方法中的调用者p对象
*/
public class Person {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;  //局部变量赋值给成员变量
    }
    public String  getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;  //局部变量赋值给成员变量
    }
    public int  getAge(){
        return age;
    }

    public void say(){
        String name = "小王";
        int age = 33;
        System.out.println("人在说话"+ this.name +"  "+ this.age);
    }

}
