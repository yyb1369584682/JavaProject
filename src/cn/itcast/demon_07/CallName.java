package cn.itcast.demon_07;

import java.util.ArrayList;
import java.util.Random;

public class CallName {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        addStudent(arr);
        printStudent(arr);
        ranStudent(arr);
    }

    public static void addStudent( ArrayList<Student> arr){
        Student s1 = new Student();
        s1.setName("李四1");
        s1.setAge(11);

        Student s2 = new Student();
        s2.setName("李四2");
        s2.setAge(12);

        Student s3 = new Student();
        s3.setName("李四3");
        s3.setAge(13);

        Student s4 = new Student();
        s4.setName("李四4");
        s4.setAge(14);

        Student s5 = new Student();
        s5.setName("李四5");
        s5.setAge(15);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);
    }

    public static void printStudent(ArrayList<Student> arr){
        for (Student student : arr) {
            System.out.println(student.getName()+"  "+ student.getAge());
        }
    }

    public static void ranStudent(ArrayList<Student> arr){
        Random random = new Random();
        int i = random.nextInt(arr.size());
        Student student = arr.get(i);
        System.out.println("----------");
        System.out.println(student.getName()+"  "+ student.getAge());
    }
}
