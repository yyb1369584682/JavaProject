package cn.yichang.demon;
/*
自定义异常
    继承Exception，或者继承RuntimeException
    构造方法中，super将调用异常信息，传递给父类
 */
public class FuShuException extends RuntimeException{
    public FuShuException(String s){
        super(s);
    }
    //java编程规范中，空参构造器是必须提供的
    public FuShuException(){}
}
