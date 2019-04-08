package cn.thread.lockdemon;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLockTest {
	private static ArrayList<Integer> arr = new ArrayList<>();
	static Lock lock = new ReentrantLock();
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				Thread thread = Thread.currentThread();
				lock.lock();
				try{
					System.out.println(thread.getName()+"得到锁");
					for (int i =0;i<5;i++){
						arr.add(i);
					}
				}catch(Exception ex){

				}finally {
					System.out.println(thread.getName()+"释放锁");
					lock.unlock();
				}
			}

		}.start();
		new Thread(){
			public void run(){
				Thread thread = Thread.currentThread();
				lock.lock();
				try{
					System.out.println(thread.getName()+"得到锁");
					for (int i =0;i<5;i++){
						arr.add(i);
					}
				}catch(Exception ex){

				}finally {
					System.out.println(thread.getName()+"释放锁");
					lock.unlock();
				}
			}

		}.start();

	}

}
