package cn.nimingduixiang_demon_01;

/*
有名对象，引用类型变量，可以反复使用
匿名对象，没有引用变量，只能使用一次

匿名对象，可以当做参数传递
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        new Person().eat();
        new Person().eat();


    }
}
