package cn.map.demon2;

import java.util.HashMap;
import java.util.Set;

/*
使用HashMap集合，存储自定义的对象
自定义对象，作为值出现
 */
public class HashMapDemon {
    public static void main(String[] args) {
        function2();
    }
    /*
    自定义对象Person类作为键
     */
    public static void function2(){
        HashMap<Person,String> map = new HashMap<Person,String>();
        map.put(new Person("张三",11),"001");
        map.put(new Person("张三",11),"001");
        map.put(new Person("张四",12),"002");
        map.put(new Person("张五",13),"003");
        map.put(new Person("张六",14),"004");
        Set<Person> set = map.keySet();
        for (Person key : set) {
            String value = map.get(key);
            System.out.println(key + "   "+ value);
        }
    }
    /*
      HashMap存储自定义的对象Person,作为值出现
      键的对象，是字符串，可以保证唯一性
       */
    public static void function(){
        HashMap<String,Person> map = new HashMap<String,Person>();
        map.put("001",new Person("张三",11));
        map.put("002",new Person("张四",12));
        map.put("003",new Person("张五",13));
        map.put("004",new Person("张六",14));
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+ "  "+value);
        }
    }


}
