package cn.test.demon_01;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        method(s);
    }

    public static void method(Smoking s){
        System.out.println(Smoking.A);
        s.smoking();
    }
}
