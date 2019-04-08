package cn.thread.pool;

import java.util.concurrent.*;

/**
 * Fixed Thread Pool:拥有固定线程数的线程池，
 * 如果没有任务执行，那么线程会一直等待
 *
 * callable跟runnable的区别：
 * runnable的run方法不会有任何返回结果，
 * 所以主线程无法获得任务线程的返回值
 *
 * callable的call方法可以返回结果，
 * 但是主线程在获取时被阻塞，需要等待任务线程返回才能拿到结果
 */

public class ThreadPoolWithcallable {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(6);
		for (int i = 0; i < 10; i++) {
			Future<String> submit = pool.submit(new Callable<String>() {
				public String call(){
					return "b--"+Thread.currentThread().getName();
				}
			});
			System.out.println(submit.get());
		}
		pool.shutdown();
	}
}
