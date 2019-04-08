package cn.itcast.demon_12;
/*
测试抽象类
创建它的子类的对象，使用子类的对象调用方法
 */
public class Test {
    public static void main(String[] args) {
        JavaEE je = new JavaEE();
        je.work();
        Android and = new Android();
        and.work();
    }
}
