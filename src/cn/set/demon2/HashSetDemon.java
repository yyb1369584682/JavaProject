package cn.set.demon2;

import java.util.HashSet;

public class HashSetDemon {
    public static void main(String[] args) {
        HashSet<Person> setPeople = new HashSet<Person>();
        setPeople.add(new Person("a",22));
        setPeople.add(new Person("b",21));
        setPeople.add(new Person("c",22));
        setPeople.add(new Person("c",22));
        setPeople.add(new Person("d",23));
        setPeople.add(new Person("e",24));
        setPeople.add(new Person("f",25));

        System.out.println(setPeople);
    }
}
