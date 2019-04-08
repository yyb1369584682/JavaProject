package cn.fianldemon_01;
/*
在类的定义上，加上修饰符final后
这个类是最终类，该类不能有子类，不可以被继承
但是使用方式没有变化
 */
public final class Fu {
    public void show(){
        System.out.println("最终类的方法");
    }
}
