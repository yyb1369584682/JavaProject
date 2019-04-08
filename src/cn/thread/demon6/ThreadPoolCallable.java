package cn.thread.demon6;

import java.util.concurrent.Callable;

/*
Callable接口实现类，作为线程提交任务的出现
使用方法返回值。
 */
public class ThreadPoolCallable implements Callable {

    @Override
    public String call(){
        return "abc";
    }
}
