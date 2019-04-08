package cn.map.demon1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合获取方式
entrySet方法，键值对映射方法获取
实现步骤：
    1、调用map集合方法entrySet()将集合中的映射关系对象，存储到Set集合
    Set<Entry <K,V>>
    2、迭代Set集合
    3、获取出的Set集合的元素，是映射关系对象
    4、通过映射关系对象方法getKey，getValue获取键值对

 */
public class MapDemon3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println("-----------");
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> next = it.next();
            System.out.println(next.getKey()+"   "+next.getValue());
        }

    }

}
