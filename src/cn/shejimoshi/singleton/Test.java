package cn.shejimoshi.singleton;
/*
设计模式：实际的软件开发，对问题的处理总结经验，设计模式
23种设计模式
	分类：创建型、关系型、功能型
	单例设计模式：保证一个类的对象的唯一性
	私有构造方法
	在本类的成员位置，创建出自己类对象
	提供公共方法，返回创建的对象

 */
public class Test {
	public static void main(String[] args) {
		Run r = new Run();
		new Thread(r).start();
		new Thread(r).start();

	}
}
