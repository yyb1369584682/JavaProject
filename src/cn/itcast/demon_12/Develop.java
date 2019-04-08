package cn.itcast.demon_12;
/*
定义类开发工程师
    EE开发工程师
    Android开发工程师

    根据共性进行抽取，然后形成一个父类Develop
    定义方法，工作

    抽象类，不能实例化对象，不能new
    不能创建对象的原因：如果真让你new了，对象.调用抽象方法，抽象方法没有主体，根本就不能运行
    抽象类使用：定义类继承抽象类，并将抽象方法进行重写，创建子类的对象。
 */

public abstract class Develop {
    /*定义工作方法，但是怎么工作，说不明白，说不清楚
    说不清楚就不说，方法没有主体的方法，必须使用关键字abstract修饰
    抽象的方法，必须存在于抽象的类中，类必须用abstract修饰。
     */


    public abstract void work();
}
