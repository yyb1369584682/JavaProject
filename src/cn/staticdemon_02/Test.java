package cn.staticdemon_02;
/*
多态中调用，编译看谁，运行看谁？
编译都看等号左边的父类，父类有则编译成功，父类没有则编译失败。
运行静态方法，则运行父类中的静态方法
运行非静态方法，则运行子类的重写方法
成员变量，编译和运行全是父类。
 */
public class Test {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.i);
        System.out.println(f.j);
        f.show();
        f.show2();
    }
}
