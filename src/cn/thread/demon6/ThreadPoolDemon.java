package cn.thread.demon6;
/*
实现线程的第三个方式，实现Callable接口方式
实现步骤；
    工厂类Executors静态方法newFixedThreadPool方法，创建线程池对象
    线程池对象ExecutorService接口实现类，调用方法submit提交线程任务
    submit(Callable c)
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemon {
    public static void main(String[] args) throws Exception{
        ExecutorService es = Executors.newFixedThreadPool(2);
        //提交线程任务的方法submit方法返回Feature接口的实现类
        Future submit = es.submit(new ThreadPoolCallable());
        System.out.println(submit.get());
    }
}
