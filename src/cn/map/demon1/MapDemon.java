package cn.map.demon1;

import java.util.HashMap;
import java.util.Map;

public class MapDemon {
    public static void main(String[] args) {
        function2();
    }
    /*
    通过键对象，获取值对象
    get(K)
    如果集合中没有这个键，则返回空
     */
    public static void function2(){
        //创建集合对象HashMap，存储的对象，键是字符串，值是整数
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println(map);
        Integer a = map.get("d");
        System.out.println(a);
        //移除集合中的键值对，返回被移除之前的值
        Integer b = map.remove("b");
        System.out.println(b);
        System.out.println(map);

    }
    /*
    将键值对存储到集合中
    put(K,V) K作为键的对象，V作为值的对象
    当存储重复的键的时候，会将原有值给覆盖掉
    put()方法的返回值一般情况下为null
    存储重复键的时候，返回值为覆盖之前的值。
     */
    public static void function(){
        //创建集合对象HashMap，存储的对象，键是字符串，值是整数
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println(map);
    }
}
