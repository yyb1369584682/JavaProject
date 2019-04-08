package cn.date.demon_01;

import java.util.Date;

/*
时间和日期类
毫秒：1000毫秒=1秒
毫秒的0点：
    System.currentTimeMillis()返回值为long类型的参数
    获取当前日期的毫秒值
    时间原点：公元1970年1月1日，午夜0:00:00 毫秒值就是0
重要：时间和日期的计算，必须依赖毫秒值
 */
public class DateDemon {
    public static void main(String[] args) {
        Date d = new Date();
        long millis = System.currentTimeMillis();
        System.out.println(millis);
        function();
        function2();
        function3();
        function4();
    }
    /*
    Date类方法setTime（long）传递毫秒值
    将日期对象，设置到指定毫秒值上
    毫秒值转成日期对象,也可以用构造方法
     */
    public static void function4(){
        Date date = new Date();
        System.out.println(date);
        date.setTime(0);
        System.out.println(date);
    }
    /*
    Date类方法的getTime（）返回值long
    返回的是毫秒值
    将Date表示的日期转换成毫秒值
    日期和毫秒值的转换
     */
    public static void function3(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
    /*
    Date类的long参数的构造方法
    Date(long)表示毫秒值
    传递毫秒值，将毫秒值转成对应的日期对象
     */
    public static void function2(){
        Date date = new Date(1544578380129l);
        System.out.println(date);
    }

    //Date类的空参构造方法
    //获取到的是当前操作系统的时间和日期
    public static void function(){
        Date date = new Date();
        System.out.println(date);
    }
}
