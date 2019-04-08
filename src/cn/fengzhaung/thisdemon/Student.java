package cn.fengzhaung.thisdemon;

public class Student extends Person {
	String name = "小明";
	@Override
	public void spark() {
		String name = "张三";
		int age = 25;
		//this表示调用者，用于区分同名的成员变量和局部变量
		//在子类中，调用父类的成员，关键字super.调用父类的成员
		System.out.println(name+"人在说话"+this.name+super.name);
	}
}
