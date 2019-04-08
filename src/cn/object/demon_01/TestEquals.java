package cn.object.demon_01;

import java.util.ArrayList;

public class TestEquals {
    public static void main(String[] args) {
        //Person类继承Object类，继承下来了父类的equals
        Person p1 = new Person("张三", 25);
        Person p2 = new Person("张三", 24);

//        ArrayList<String> arr = new ArrayList<>();

        //Person对象p1，调用父类的方法equals，进行对象的比较
        //方法equals比较两个对象的内存地址是否一样
        boolean b = p1.equals(p1);
        System.out.println(b);

    }
}
