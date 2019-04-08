package cn.set.demon3;

import java.util.LinkedHashSet;

/*
LinkedHashSet基于链表的哈希表实现
继承自HashSet

LinkedHashSet自身的特性，具有顺序，存储和取出的顺序相同的,也不允许存储重复元素。
线程不安全的集合，运行速度快。
 */
public class LinkedHashSetDemon {
    public static void main(String[] args) {
        LinkedHashSet<Integer> link = new LinkedHashSet<>();
        link.add(12);
        link.add(13);
        link.add(14);
        link.add(14);
        link.add(15);
        link.add(16);
        System.out.println(link);
    }
}
