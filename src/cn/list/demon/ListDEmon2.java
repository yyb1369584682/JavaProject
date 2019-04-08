package cn.list.demon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
迭代器的并发修改异常java.util.ConcurrentModificationException
就是在遍历的过程中，使用了集合方法修改了集合的长度，这是不允许的
 */
public class ListDEmon2 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<String>();
        array.add("abc1");
        array.add("abc2");
        array.add("abc3");
        array.add("abc4");
        array.add("abc5");
        //对集合还有迭代器，获取时候判断集合中是否存在"abc3"对象
        //如果有，则添加一个元素"ABC3"

        Iterator<String> it = array.iterator();
        while(it.hasNext()){
            String next = it.next();
            if(next.equals("abc3")){
                array.add("ABC3");
            }
            System.out.println(next);
        }
    }
}
