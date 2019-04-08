package cn.list.demon;

import java.util.ArrayList;
import java.util.List;

/*
List接口派系，继承Collection接口
    下面有很多实现类
List接口特点：有序，索引，可以有重复的元素
    实现类，ArrayList，LinkedList

List接口中的抽象方法，有一部分方法和他的父类接口Collection是一样
List接口的自己特有的方法，带有索引的功能
 */
public class ListDemon1 {
    public static void main(String[] args) {
//        function();
        function2();

    }
    /*
    E remove(int index)
    移除指定索引上的元素
    同时也可以返回删除之前的元素
     */
    public static void function2(){
        List<Double> list = new ArrayList<Double>();
        list.add(1.1);
        list.add(1.2);
        list.add(1.3);
        list.add(1.4);
        list.add(1.5);
        list.add(1.6);
        System.out.println(list);
        Double remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);

    }
    /*
    add(int index,E)
    将元素插入到列表的指定索引上
     */
    public static void function(){
        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        list.add("abc5");
        System.out.println(list);
        list.add(5,"abc6");
        System.out.println(list);

    }
}
