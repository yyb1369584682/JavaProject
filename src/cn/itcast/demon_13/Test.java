package cn.itcast.demon_13;
/*
抽象类，可以没有抽象方法，可以定义带有方法体的方法
让子类来继承，可以直接使用。
 */
public class Test {
    public static void main(String[] args) {
//        CatFactory cat = new CatFactory();
        new Cat().sleep();
    }
}
