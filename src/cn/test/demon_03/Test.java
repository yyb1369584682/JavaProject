package cn.test.demon_03;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        method(c);
        method(new Dog());
    }

    public static void method(Animal a){
        a.eat();
    }
}
