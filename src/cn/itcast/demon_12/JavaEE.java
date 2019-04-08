package cn.itcast.demon_12;
/*
定义类，JavaEE的开发人员
继承抽象类Develop，重写抽象方法
 */
public class JavaEE  extends Develop{
    @Override
    /*
    重写父类的抽象方法
    去掉abstract修饰符，加上方法主体即可
     */
    public void work() {
        System.out.println("JavaEE工程师在开发B/S软件");

    }
}
