package cn.jiekou.demon_04;
/*
实现接口C，重写C接口的全部抽象方法
而且接口C，继承A，B
D实现类，重写A，B，C三个接口全部抽象方法
问：Java中有多继承吗？
    类没有多继承
    接口之间有多继承
 */
public class D implements C{
    @Override
    public void c() {

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
