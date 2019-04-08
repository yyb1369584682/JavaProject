package cn.shejimoshi.singleton;

public class Run implements Runnable{
	public void run(){
		Single s = Single.getInstance();
		for (int i = 0; i < 50; i++) {
			System.out.println(s);
		}
	}

}
