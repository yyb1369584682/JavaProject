package cn.thread.synchronizeddemon;
/*
synchronized是Java中的一个关键字，也就是说是Java的内置特性
如果一个代码块被synchronized修饰了，当一个线程获取了对应的锁，
并执行该代码块时，其他线程便只能一直等，等待获取锁的线程释放锁
获取锁的线程只有两种情况释放锁：
1、获取锁的线程执行完了该代码块，然后释放对锁的占有
2、线程执行发生异常，JVM会让线程自动释放锁
 */
public class MySynchronized {
	public static void main(String[] args) {
		final MySynchronized mySynchronized1 = new MySynchronized();
		MySynchronized mySynchronized2 = new MySynchronized();
		//匿名内部类实现多线程程序
		new Thread("thread1"){
			public void run(){
				synchronized(mySynchronized1){
					try {
						System.out.println(this.getName()+" start");
//						int i = 1 / 0; //如果发生异常，JVM会将锁释放
						Thread.sleep(5000);
						System.out.println(this.getName()+" 醒了");
						System.out.println(this.getName()+" end");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread("thread2"){
			public void run(){
				synchronized (mySynchronized1){
					System.out.println(this.getName()+" start");
					System.out.println(this.getName()+" end");
				}

			}
		}.start();

	}

}
