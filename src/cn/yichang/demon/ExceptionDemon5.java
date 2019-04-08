package cn.yichang.demon;

import java.text.ParseException;

/*
继承后，在子类重写父类方法的时候，异常处理
结论：父类的方法，如果抛出异常，子类重写后可以不抛出异常
       也可以抛出异常
       但是，如果子类要抛异常，抛出的异常不能大于父类抛出的异常
       也不能等于父类抛出的异常
       父类没有抛出异常的时候，子类重写后，也不能抛出异常
       如果子类中调用了抛出异常的方法，则只能用try...catch处理。
 */
public class ExceptionDemon5 {
    public static void main(String[] args) {
        Fu f = new Zi();
        f.function();

    }
}
class Fu{
    public void function(){

    }
}
class Zi extends Fu {
    public void function() {
        try {
            method();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void method()throws Exception{}

}
