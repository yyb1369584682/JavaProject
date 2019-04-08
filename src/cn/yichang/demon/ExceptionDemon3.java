package cn.yichang.demon;

import java.util.NoSuchElementException;

/*
多个catch写在一起
细节：
    catch小括号，写的是异常类的类名
    有没有顺序的概念，有

    平级异常(抛出的异常类之间，没有继承关系):没有顺序
    NullPointerException extends RuntimeException
    NoSuchElementException extends RuntimeException
    ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException extends RuntimeException

    上下级关系的异常（有继承关系）：有顺序
    越高级的父类，要写在下面
    NullPointerException extends RuntimeException extends RuntimeException

 */
public class ExceptionDemon3 {
    public static void main(String args){

    }
}
