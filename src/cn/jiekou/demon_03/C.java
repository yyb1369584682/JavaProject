package cn.jiekou.demon_03;
/*
类C同时去实现两个接口，接口A,B
作为实现类，C必须全部重写两个接口所有的抽象方法，才能建立C类的实例对象
C类在继承一个类的同时，可以实现多个接口
 */
public class C extends D implements A,B {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void d() {

    }
}
