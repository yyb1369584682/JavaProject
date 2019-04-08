package cn.map.demon5;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
MAp集合的嵌套，Map中存储的还是Map集合
要求：
 */
public class MapMapDemon {
    public static void main(String[] args) {
        //定义基础班、就业班容器
        HashMap<String, String> javaee = new HashMap<String,String>();
        HashMap<String, String> javase = new HashMap<String,String>();
        javaee.put("001","张三");
        javaee.put("002","李四");

        javase.put("001","王五");
        javase.put("002","赵六");
        //定义传智播客容器，值是两个班级容器
        HashMap<String, HashMap<String, String>> cbzk = new HashMap<String, HashMap<String, String>>();
        cbzk.put("基础班",javaee);
        cbzk.put("就业班",javase);
//        keySet(cbzk);
        enteySet(cbzk);
    }
    public static void enteySet(HashMap<String, HashMap<String, String>> cbzk){
        //调用cbzk集合方法entrySet方法，将cbzk集合的键值关系对象，存储到Set集合
        Set<Map.Entry<String, HashMap<String, String>>> classNameSet = cbzk.entrySet();
        //迭代器迭代Set集合
        Iterator<Map.Entry<String, HashMap<String, String>>> classNameIt = classNameSet.iterator();
        while(classNameIt.hasNext()){
            //classNameIt.next方法，取出的是cbzk集合的键值对关系对象
            Map.Entry<String, HashMap<String, String>> classNameMap = classNameIt.next();
            //classNameMap使用方法getKey，getValue获取键和值
            String classNamekey = classNameMap.getKey();
            //获取值，值是一个Map集合
            HashMap<String, String> classNameMapvalue = classNameMap.getValue();
            //调用班级集合classNameMapValue方法entrySet
            Set<Map.Entry<String, String>> set = classNameMapvalue.entrySet();
            //迭代Set集合
            Iterator<Map.Entry<String, String>> it = set.iterator();
            while(it.hasNext()){
                //it方法next获取出的是班级集合的键值对关系
                Map.Entry<String, String> map = it.next();
                //map方法getKey,getValue
                String key = map.getKey();
                String value = map.getValue();
                System.out.println(classNamekey+"  "+key+"  "+value);
            }
        }
    }
    public static void keySet(HashMap<String, HashMap<String, String>> cbzk){
        //调用czbk集合方法keySet将存储到Set集合
        Set<String> classNameSet = cbzk.keySet();
        //迭代Set集合
        Iterator<String> classNameIt = classNameSet.iterator();
        while(classNameIt.hasNext()){
            //classNameIt.next获取出来的是Set集合，cbzk的键
            String classNameKey = classNameIt.next();
            //cbzk集合的方法get获取值，值是一个HashMap集合
            HashMap<String, String> classNameValue = cbzk.get(classNameKey);
            //调用classNameValue方法keySet,键存储到Set集合
            Set<String> set = classNameValue.keySet();
            Iterator<String> it = set.iterator();
            while(it.hasNext()){
                //it.next获取出来的是classNameValue的键，学号
                String key = it.next();
                //调用classNameValue集合中的get方法获取值
                String value = classNameValue.get(key);
                System.out.println(classNameKey+"  "+key+"  "+value);
            }
        }
    }

}
