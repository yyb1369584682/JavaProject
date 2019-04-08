package cn.object.demon_01;

public class TestToString {
    public static void main(String[] args) {
        //调用Person类的方法toString()
        //输出语句中，写的是一个对象时，是默认调用对象的toString方法
        Person p = new Person("张三", 20);
        System.out.println(p);
        String s = p.toString();
        System.out.println(s);
        /*
        System.out.println(p.toString());
        System.out.println(p);
        这两种方法一样
         */
    }
    
}
