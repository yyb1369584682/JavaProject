package test.constructor.demon;
/*
描述学生和工人这两个类，将他们的共性name和age抽取出来存放在父类中，
并提供相应的get和set方法，同时需要在创建学生和工人对象就必须明确姓名和年龄
 */
public class Test {
	public static void main(String[] args) {
		Student s = new Student("李四",23);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		Worker w = new Worker("张三",26);
		System.out.println(w.getName());
		System.out.println(w.getAge());
	}
}
