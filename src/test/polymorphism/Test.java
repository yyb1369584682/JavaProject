package test.polymorphism;

public class Test {
	public static void main(String[] args) {
		//多态的定义，父类的引用变量指向子类对象
		Person p = new Student();  //向上转型
		Student s = (Student)p;   //向下转型
	}
}
