package cn.thread.demon5;

public class ThreadPoolRunnable implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName()+"提交线程任务");
    }
}
