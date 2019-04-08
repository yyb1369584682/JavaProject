package cn.thread.lockdemon;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
trylock方法是有返回值的，他表示用来尝试获取锁，
如果获取成功，则返回true，如果获取失败（即锁被其他线程获取），则返回false
也就是说这个方法无论如何都会立即返回，在拿不到锁时不会一直等待
 */
public class MyTryLock {
	private static ArrayList<Integer> arr = new ArrayList<Integer>();
	private static Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		new Thread(){
			public void run(){
				Thread thread = Thread.currentThread();
				boolean trylock = lock.tryLock();
				System.out.println(thread.getName()+trylock);
				if(trylock){
					try{
						System.out.println(thread.getName()+"获得锁");
						for (int i = 0; i < 50; i++) {
							arr.add(i);
						}
					}catch (Exception ex){

					}finally {
						System.out.println(thread.getName()+"释放锁");
						lock.unlock();
					}
				}
			}
		}.start();
		new Thread(){
			public void run(){
				Thread thread = Thread.currentThread();
				boolean trylock = lock.tryLock();
				System.out.println(thread.getName()+trylock);
				if (trylock){
					try{
						System.out.println(thread.getName()+"获得锁");
						for (int i = 0; i < 50; i++) {
							arr.add(i);
						}
					}catch (Exception ex){

					}finally {
						System.out.println(thread.getName()+"释放锁");
						lock.unlock();
					}
				}
			}
		}.start();
	}

}
