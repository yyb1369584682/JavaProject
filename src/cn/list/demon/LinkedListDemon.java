package cn.list.demon;

import java.util.LinkedList;

/*
LinkedList链表集合的特有功能
    自身特点：链表底层实现，查询慢，增删快
子类的特有功能，不能多态调用
 */
public class LinkedListDemon {
    public static void main(String[] args) {
//        function();
        function2();
    }
    /*
    E getFirst()获取链表的开头
    E getLast()获取链表的结尾
     */
    public static void function2(){
        LinkedList<String> link = new LinkedList<>();
        link.add("abc");
        link.add("def");
        link.add("123");
        link.add("456");
        String first = link.getFirst();
        String last = link.getLast();
        System.out.println(link);
        System.out.println(first);
        System.out.println(last);
    }
    /*
    addFirst(E)添加到链表的开头
    addLast(E)添加到链表的结尾
     */
    public static void function(){
        LinkedList<String> link = new LinkedList<>();
        link.add("abc");
        link.add("def");
        link.addFirst("gree");
        System.out.println(link);
    }
}
