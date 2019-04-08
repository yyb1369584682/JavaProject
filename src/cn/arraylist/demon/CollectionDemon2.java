package cn.arraylist.demon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemon2 {
    public static void main(String[] args) {
        //集合可以存储任意类型的对象
        //集合中，不指定存储的数据类型，集合什么都可以存
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add("dferr");
//        coll.add(123);
        Iterator it = coll.iterator();
        while(it.hasNext()){
//            System.out.println(it.next());
            String s = (String)it.next();
            System.out.println(s.length());
        }

    }
}
