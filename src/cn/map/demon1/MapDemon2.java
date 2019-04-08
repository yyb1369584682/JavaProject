package cn.map.demon1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map集合的遍历
    利用键获取值
    Map接口中定义方法keySet
    所有的键，存储到Set集合
 */
public class MapDemon2 {
    public static void main(String[] args) {
        /*
        1、调用map集合的方法keySet，所有的键存储到Set集合中
        2、遍历Set集合，获取Set集合中的所有元素（Map中的键）
        3、调用map集合的方法，通过键获取到值
         */
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        //1、调用map集合的方法keySet，所有的键存储到Set集合中
        Set<Integer> set = map.keySet();
        //2、遍历Set集合，获取Set集合中的所有元素（Map中的键）
        //增强for循环遍历
        for (Integer key : set) {
            String value = map.get(key);
            System.out.println(key + "  "+value);
        }
        System.out.println("----------");
        //迭代器遍历
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "  "+value);
        }


    }
}
