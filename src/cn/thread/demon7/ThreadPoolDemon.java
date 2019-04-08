package cn.thread.demon7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
使用多线程技术，求和
两个线程，1个线程计算1+100，另一个线程计算1+200的和
 */
public class ThreadPoolDemon {
    public static void main(String[] args) throws Exception{
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(new ThreadPoolCallable(100));
        Future f2 = es.submit(new ThreadPoolCallable(200));
        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }
}
