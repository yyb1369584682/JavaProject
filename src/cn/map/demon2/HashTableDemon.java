package cn.map.demon2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
Map接口实现类Hashtable
底层数据结果哈希表，特点和HashMap是一样的
Hashtable是线程安全集合，运行速度慢
HashMap线程不完全集合，运行速度快

Hashtable命运和Vector是一样的，从JDK1.2开始，被更先进的HashMap取代
HashMap允许存储null键，null值
Hashtable不允许存储null键，null值
Hashtable他的孩子
 */
public class HashTableDemon {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new Hashtable<>();
        map.put(null,null);
        System.out.println(map);
    }

}
