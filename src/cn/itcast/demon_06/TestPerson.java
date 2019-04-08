package cn.itcast.demon_06;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setAge(16);
        p2.setAge(16);

        boolean compare = p1.compare(p2);
        System.out.println(compare);
    }
}
