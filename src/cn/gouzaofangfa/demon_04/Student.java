package cn.gouzaofangfa.demon_04;
/*
  子类中，super()的方式，调用父类的构造方法
   super()调用的是父类的空参数构造
   super（参数）调用的是父类的有参数构造方法

    子类的构造方法，有一个默认添加的构造方法
    注意：子类构造方法的第一行，有一个隐式代码super()，
    目的的调用父类构造方法
    public Student(){
        super();
     }
*/
public class Student extends Person {
    public Student(){
        super();
    }
}
