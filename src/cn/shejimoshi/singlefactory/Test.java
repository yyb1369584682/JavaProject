package cn.shejimoshi.singlefactory;
/*
简单工厂设计模式
 */
public class Test {
	public static void main(String[] args) {
		Animal a = Factory.createAnimal("cat");
		a.eat();
		a = Factory.createAnimal("dog");
		a.eat();

	}
}
