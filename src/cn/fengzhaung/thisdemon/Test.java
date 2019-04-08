package cn.fengzhaung.thisdemon;

public class Test {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.spark();
		//子类的对象调用成员变量，子类自己有的话，就用子类的，子类没有就调用父类的。
		System.out.println(stu.name);

	}
}
