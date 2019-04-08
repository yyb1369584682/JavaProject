package cn.arraylist.demon;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
//        function();
        function2();
    }
    /*
    Collection接口方法
    boolean contains(Object o)判断对象是否存在于集合中
    方法参数是Object类型
     */
    public static void function2(){
        Collection<String> coll = new ArrayList<>();
        coll.add("abc");
        coll.add("def");
        boolean b = coll.contains("d");
        System.out.println(b);
    }

    /*
    Collection接口方法
    void clear（）清空集合中的所有元素
     */
    public static void function(){
        Collection<String> coll = new ArrayList<>();
        coll.add("abc");
        coll.add("def");
        System.out.println(coll);
        //请空集合中的元素，但集合还在
        coll.clear();
        System.out.println(coll);
    }
}
