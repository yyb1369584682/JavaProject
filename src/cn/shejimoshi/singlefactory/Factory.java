package cn.shejimoshi.singlefactory;

public class Factory {
	public static Animal createAnimal(String name){
		if(name.equals("cat")){
			Cat cat = new Cat();
			return cat;
		}else if(name.equals("dog")){
			Dog dog = new Dog();
			return dog;
		}else {
			return null;
		}
	}
}
