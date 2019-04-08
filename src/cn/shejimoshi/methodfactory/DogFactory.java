package cn.shejimoshi.methodfactory;

public class DogFactory implements Factory {
	public Animal createAnimal(){
		Dog dog = new Dog();
		return dog;
	}
}
