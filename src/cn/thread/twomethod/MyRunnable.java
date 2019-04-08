package cn.thread.twomethod;
//实现Runnable接口
public class MyRunnable implements Runnable {
	//把线程执行的方法，放到run()方法中
	public void run(){
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread()+"....."+i);
		}
	}
}
