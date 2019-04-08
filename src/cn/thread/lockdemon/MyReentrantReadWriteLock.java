package cn.thread.lockdemon;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 使用读写锁，可以实现读写分别锁定，读操作并发执行，写操作锁定单个线程
 * 如果一个线程已经占用了读锁，则此时其他线程如果要申请写锁，申请写锁的线程会一直等待读锁的释放
 * 如果一个线程已经占用了写锁，则此时其他线程如果要申请读锁/写锁，都要等待写锁的释放，
 */
public class MyReentrantReadWriteLock {
	final static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		final MyReentrantReadWriteLock test = new MyReentrantReadWriteLock();
		new Thread(){
			public void run(){
				test.get(Thread.currentThread());
				test.write(Thread.currentThread());
			}
		}.start();
		new Thread(){
			public void run(){
				test.get(Thread.currentThread());
				test.write(Thread.currentThread());
			}
		}.start();

	}

	//读操作用读锁进行锁定
	public static void get(Thread thread){
		rwl.readLock().lock();
		try{
			long start = System.currentTimeMillis();
			while ((System.currentTimeMillis()-start) <= 1){
				System.out.println(thread.getName()+" 正在进行读操作");
			}
			System.out.println(thread.getName()+"  读操作完成");
		}catch (Exception ex){

		}finally {
			rwl.readLock().unlock();
		}
	}
	//写操作用写锁进行锁定
	public void write(Thread thread){
		rwl.writeLock().lock();
		try{
			long start = System.currentTimeMillis();
			while ((System.currentTimeMillis()-start) <= 1){
				System.out.println(thread.getName()+"正在进行写操作");
			}
			System.out.println(thread.getName()+"写操作完成");
		}catch (Exception ex){

		}finally {
			rwl.writeLock().unlock();

		}
	}
}
