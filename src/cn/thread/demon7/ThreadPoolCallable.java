package cn.thread.demon7;

import java.util.concurrent.Callable;

public class ThreadPoolCallable implements Callable {
    int a;
    public ThreadPoolCallable(int a){
        this.a = a;
    }
    public Integer call(){
        int sum = 0;
        for (int i = 0; i <= a ; i++) {
            sum+=i;
        }
        return sum;
    }
}
