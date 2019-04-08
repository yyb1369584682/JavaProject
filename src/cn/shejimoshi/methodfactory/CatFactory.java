package cn.shejimoshi.methodfactory;

public class CatFactory implements Factory {
	public Animal createAnimal(){
		Cat cat = new Cat();
		return cat;
	}
}
