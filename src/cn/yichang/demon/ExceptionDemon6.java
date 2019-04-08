package cn.yichang.demon;
/*
Throwable类中的方法
三个方法，都和异常的信息有关系
    String getMessage()对异常信息的具体描述 异常了
    String toString() 对异常信息的简短描述  java.lang.Exception: 异常了
    void printStackTrace()将异常信息追踪到标准的错误流 异常信息最详细，JVM默认调用异常显示方法的也是这个方法
 */
public class ExceptionDemon6 {
    public static void main(String[] args){
        try{
            function();}
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void function()throws Exception{
       throw new Exception("异常了");
    }
}
