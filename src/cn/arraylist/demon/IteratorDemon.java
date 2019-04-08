package cn.arraylist.demon;

import java.util.ArrayList;
import java.util.Iterator;

/*
集合中的迭代器：
    获取集合中元素的方式
接口Iterator:两个抽象方法
    boolean hasNext()判断集合中还有没有可以被取出的元素，如果有则返回true
    next()取出集合中的下一个元素
Iterator接口，找实现类
    Collection接口定义方法
        Iterator iterator()
     ArrayList 重写方法iterator(),返回了Iterator接口的实现类的对象
     使用ArrayList集合的对象
     Iterator it = array.iterator()，运行结果就是Iterator接口的实现的对象
     it是接口的实现类的对象，调用方法hasNext和next集合元素迭代
 */
public class IteratorDemon {
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("abd");
        arr.add("fvg");
        arr.add("erf");
        arr.add("raf");
        Iterator<String> itera = arr.iterator();
        //迭代是反复内容，使用循环实现
        // 循环结束的条件，集合中没有元素，hasNexta()返回了false
        while (itera.hasNext()){
            System.out.println(itera.next());
        }
        for (Iterator<String> itera2 = arr.iterator();itera2.hasNext(); ){
            System.out.println(itera2.next());
        }
    }
}
