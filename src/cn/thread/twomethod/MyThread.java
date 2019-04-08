package cn.thread.twomethod;
//继承Thread类
public class MyThread extends Thread {
	//把线程执行的方法，放到run()方法中
	public void run(){
		for (int i = 0; i < 20 ; i++) {
			System.out.println(Thread.currentThread()+"....."+i);
		}

	}
}
