package cn.test.demon_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenerialTest {
    public static void main(String[] args) {
        //创建集合
        ArrayList<chuShi> cs = new ArrayList<chuShi>();
        ArrayList<fuWuyuan> fwy = new ArrayList<fuWuyuan>();
        ArrayList<jingLi> jl = new ArrayList<jingLi>();
        //为集合添加元素
        cs.add(new chuShi("番茄","200"));
        cs.add(new chuShi("土豆","201"));

        fwy.add(new fuWuyuan("翠花","300"));
        fwy.add(new fuWuyuan("小翠","301"));

        jl.add(new jingLi("张三","100",1000.2));
        jl.add(new jingLi("李四","101",1000.3));
        iterator(cs);
        iterator(fwy);
        iterator(jl);
    }
    //遍历集合
    /*
    定义方法，可以同时遍历3个集合，并调用工作方法work
    ? 泛型通配符，迭代器it.next()方法取出来的是Object类型，怎么调用work方法
    强制转换：it.next() = Object o ==>Employee
    方法参数：控制，可以传递Employee对象，也可以传递Employee的子类对象
    泛型的限定 本案例，父类固定Employee，但是子类可以无限？
    ？ extends Employee 限制的是父类，上限限定 可以传递Employee，传递他的子类对象
    ？ super Employee 限制的是子类，下限限定，可以传递Employee，传递他的父类对象
     */
    public static void iterator(ArrayList<? extends Employee> array){
        Iterator<? extends Employee> iterator = array.iterator();
        while(iterator.hasNext()){
            Employee next = iterator.next();
            System.out.println(next);
            next.work();
        }
    }


}
