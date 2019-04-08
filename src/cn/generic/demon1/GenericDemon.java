package cn.generic.demon1;

import cn.jiekou.demon_02.Inter;

import java.util.ArrayList;

/*
JDK1.5出现新的安全机制，保证程序的安全性
    泛型：指明了集合中存储数据的类型<数据类型>
 */
public class GenericDemon {
    /*
    带有泛型的类ArrayList<E>
    E：Element元素，实际思想就是一个变量而已
    ArrayList<Integer>， E 表示接收类型,就是Integer类型
    public boolean add(Integer){}
     */
    public static void main(String[] args) {
        //集合变为数组
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(123);
        array.add(456);
        Integer[] i = new Integer[array.size()];
        Integer[] integers = array.toArray(i);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
