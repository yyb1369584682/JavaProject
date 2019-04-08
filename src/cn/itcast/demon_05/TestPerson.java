package cn.itcast.demon_05;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小李");
        System.out.println(person.getName());
        person.setAge(25);
        System.out.println(person.getAge());
        person.say();

    }
}
