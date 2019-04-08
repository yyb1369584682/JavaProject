package cn.test.demon_03;

public class TestReturn {
    public static void main(String[] args) {
        Person p = run();
        p.run();

    }

    public static Person run(){
        return new Person();
    }
}
