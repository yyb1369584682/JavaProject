package cn.neibulei.demon_01;
/*
内部类的定义
    将内部类，定义在了外部的成员位置
    类名Outer，内部类Inner
    成员内部类，可以使用成员修饰符public,static
    也是个类，可以继承，可以实现接口

    调用规则：内部类，可以使用外部类成员，包括私有
    外部类要使用内部类的成员，必须建立内部类对象

 */
public class Outer {
    int i = 1;
    //外部类成员位置，定义内部类
    class Inner{
        int i = 2;
        public void inner(){
            int i = 3;
            System.out.println("内部类方法inner "+i);  //3
            System.out.println("内部类方法inner "+this.i);  //2
            System.out.println("内部类方法inner "+Outer.this.i);  //1
        }

    }
}
