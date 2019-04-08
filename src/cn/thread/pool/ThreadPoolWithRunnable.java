package cn.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Cached Thread Pool:线程池里有很多线程需要同时执行，老的可用线程将被新的任务触发重新执行
 * ，如果线程超过60秒内没执行，那么将被终止并从池中删除。
 */
public class ThreadPoolWithRunnable {
	public static void main(String[] args) {
		final ExecutorService pool = Executors.newCachedThreadPool();
		pool.execute(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i < 5; i++) {
					System.out.println("thread name: "+Thread.currentThread().getName());
					try{
						Thread.sleep(1000);
					}catch (Exception ex){
						ex.printStackTrace();
					}finally {

					}
				}
				pool.shutdown();
			}
		});
	}
}
