package cn.gouzaofangfa.demon_05;
/*
注意：子类中所有的构造方法，无论重载多少个，第一行必须是super（）
 */
public class Student extends Person {

    public Student() {
        super(0);
    }

    public Student(String s){
        super(2);
    }
}
