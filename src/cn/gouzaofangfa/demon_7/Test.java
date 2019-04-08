package cn.gouzaofangfa.demon_7;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("小强",30);
        System.out.println(worker.getName());
        System.out.println(worker.getAge());

        Student s = new Student("李四", 50);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }


}
