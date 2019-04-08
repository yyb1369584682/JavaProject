package cn.shejimoshi.singleton;
/*
单例模式之懒汉模式，对象的延迟加载
会出现线程不安全现象
加入同步保证安全性，双重if保证效率

 */
public class Single {
	private Single(){}
	private static  Single s = null;
	public static Single getInstance(){
		if(s == null) {
			synchronized (Single.class) {
				if (s == null)
					s = new Single();
			}
		}
		return s;
	}

	/*
单例模式之饿汉

	private Single(){}
	private static final Single s = new Single();
	public static Single getInstance(){
		return s;
	}
	*/
}
