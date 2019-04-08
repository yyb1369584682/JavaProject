package cn.arraylist.demon;

import java.util.ArrayList;

/*
JDK1.5新特性，增强for循环
JDK1.5版本后，出现新的接口java.lang.Iterable
    Collection是继承Iterator
    Iterator作用，实现增强for循环
格式：
for（数据类型 变量名：数组或者集合）{
    System.out.println(变量名);
    }
 */
public class ForEachDemon {
    public static void main(String[] args) {
        function();
    }
    /*
    实现for循环，遍历数组
    好处：代码少了，方便对容器遍历
    弊端：没有索引，不能操作容器里面的元素
     */
    public static void function(){
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(new Person("张三",20));
        arr.add(new Person("李四",21));
        for (Person person : arr) {
            System.out.println(person);
        }

    }

}
