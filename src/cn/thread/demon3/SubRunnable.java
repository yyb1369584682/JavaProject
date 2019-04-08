package cn.thread.demon3;
/*
实现线程的另一种方式，接口实现
实现Runnable，重写run方法
 */
public class SubRunnable implements Runnable{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("run...."+i);
        }
    }
}
