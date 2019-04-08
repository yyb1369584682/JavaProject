package cn.generic.demon1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
泛型的通配符 *
 */
public class GenericDemon3 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        HashSet<Integer> set = new HashSet<Integer>();
        array.add("123");
        array.add("456");

        set.add(456);
        set.add(789);
        iterator(array);
        iterator(set);
    }
    /*
    定义方法，可以同时迭代2个集合
    参数：怎么实现，不能写ArrayList，也不能写HashSet
    参数：共同实现的接口
    泛型的通配符，匹配所有的数据类型 ？
     */
    public static void iterator(Collection<?> coll){
//        for (Object o : coll) {
//            System.out.println(o);
//        }
        Iterator<?> iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
