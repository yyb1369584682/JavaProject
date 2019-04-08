package cn.shejimoshi.methodfactory;
/*
工厂方法设计模式：
	将每个对象，交给各自工厂去创建
	有猫工厂，狗工厂，作用就是建立对象
 */

public class Test {
	public static void main(String[] args) {
		DogFactory dogFactory = new DogFactory();
		Animal dog = dogFactory.createAnimal();
		dog.eat();
		CatFactory catFactory = new CatFactory();
		Animal cat = catFactory.createAnimal();
		cat.eat();

	}
}
