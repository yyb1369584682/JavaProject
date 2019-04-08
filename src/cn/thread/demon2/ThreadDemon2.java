package cn.thread.demon2;
/*
每个线程都有自己的名字
运行方法main的线程，名字就是“main”
其他新建的线程也有名字，默认“Thread-0”,"Thread-1"

JVM开启主线程，运行方法main,主线程也是线程，是线程必然就是Thread累对象
Thread类中，静态方法static Thread currentThread（）返回正在执行线程对象
 */
public class ThreadDemon2 {
    public static void main(String[] args) {
        NameThread nt = new NameThread();
        nt.setName("java");  //修改线程名称
//        nt.run();     //单线程Exception in thread "main" java.lang.ArithmeticException: / by zero
        nt.start(); //多线程Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero
        System.out.println();
//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
    }

}
