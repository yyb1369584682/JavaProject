package cn.arraylist.demon;

import java.util.ArrayList;
/*
集合体系
    目标：集合本身是一个存储的容器
        必须要会使用集合存储对象
        遍历集合，取出对象
        知道集合自己的特性
 */
public class ArrayListDemon {
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        /*
        集合ArrayList，存储int类型整数
        集合本身不接受基本类，自动装箱存储
         */
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(111);
        arr.add(222);
        arr.add(333);
        arr.add(444);
        arr.add(555);
        arr.add(666);
        System.out.println(arr);
        /*
        集合存储自定义的Person类的对象
         */
        ArrayList<Person> arrayPer = new ArrayList<>();
        arrayPer.add(new Person("张三",20));
        arrayPer.add(new Person("李四",21));
        arrayPer.add(new Person("王五",22));
//        for (Person person : arrayPer) {
//            System.out.println(person);
//        }
        for(int i=0 ;i < arrayPer.size();i++){
            System.out.println(arrayPer.get(i));
        }
    }
}
