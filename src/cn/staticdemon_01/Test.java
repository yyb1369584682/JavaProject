package cn.staticdemon_01;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "李四";
        p2.name = "张三";
        System.out.println(p1.name);
        System.out.println(p2.name);

        //对象调用类的静态成员
        p1.className = "基础班";
        System.out.println(p2.className);
        System.out.println(Person.className);
    }
}
