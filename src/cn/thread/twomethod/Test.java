package cn.thread.twomethod;
//实现线程的两种方法
public class Test {
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();

		//用start方法启动两个线程
		//如果使用run方法，则不是线程的启动，而是普通的方法调用
		myThread1.start();
		myThread2.start();


	}
}
