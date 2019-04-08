package cn.map.demon4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
Collections
 */
public class CollectionsDemon {
    public static void main(String[] args) {
        function2();

    }
    /*
    Collections.shuffle方法
    对于List集合中的元素，进行随机排列
     */
    public static void function2(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(12);
        list.add(45);
        list.add(67);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

    }
    /*
    Collections.binarySearch静态方法
    对于List集合，进行二分搜索法排列
    方法参数，传递List集合，传递被查找的元素
     */
    public static void function1(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(12);
        list.add(45);
        list.add(67);
        int i = Collections.binarySearch(list, 13);
        System.out.println(i);
    }
    /*
    Collections.sort静态方法
    对于List集合，进行升序排列
     */
    public static void function(){
        //创建List集合
        List<String> list = new ArrayList<>();
        list.add("avd");
        list.add("cdf");
        list.add("ASA");
        list.add("weqfgr");
        list.add("dww");
        list.add("RDFD");
        System.out.println(list);
        //调用集合工具类的方法sort
        Collections.sort(list);
        System.out.println(list);

    }
}
