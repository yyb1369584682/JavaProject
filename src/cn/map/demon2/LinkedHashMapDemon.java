package cn.map.demon2;

import java.util.LinkedHashMap;

/*
LinkedHashMap继承HashMap
保证了迭代的顺序，线程不安全，运行速度快
 */
public class LinkedHashMapDemon {
    public static void main(String[] args) {
        LinkedHashMap<String,String> link = new LinkedHashMap<String,String>();
        link.put("012","abc");
        link.put("013","bcd");
        link.put("014","cde");
        link.put("015","def");
        System.out.println(link);
    }
}
