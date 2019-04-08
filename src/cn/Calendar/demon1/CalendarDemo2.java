package cn.Calendar.demon1;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
    public static void main(String[] args) {
//        function();
//        function2();
//        function3();
        function4();
    }

    /*
    Calendar类方法getTime（）
    把日历对象转成Date日期对象
     */
    public static void function4(){
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }
    /*
    Calendar类方法add
    日历的偏移量，可以指定一个日历中的字段，进行整数的偏移
    add(int field,int value)
     */
    public static void function3(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR,20);
        //获取年份
        int year = c.get(Calendar.YEAR);
        //获取月份，月份要加1
        int month = c.get(Calendar.MONTH)+1;
        //获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+ "年"+month +"月"+day+"日");

    }
    /*
    Calendar类的set方法
    设置日历
    set(int filed,int value)
    filed 设置的是哪个日历字段
    value 设置后的具体数值
    set（int year,int month,int day）
    传递3个整数的年，月，日
     */
    public static void function2(){
        Calendar c = Calendar.getInstance();
        c.set(2018,11,25);
        //获取年份
        int year = c.get(Calendar.YEAR);
        //获取月份，月份要加1
        int month = c.get(Calendar.MONTH)+1;
        //获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+ "年"+month +"月"+day+"日");
    }
    /*
    Calendar类的get方法
    获取日历字段的值
    int get(int)
    参数int，获取的哪个日历字段
    返回值，就表示日历字段的具体对象
     */
    public static void function(){
        Calendar c = Calendar.getInstance();
        //获取年份
        int year = c.get(Calendar.YEAR);
        //获取月份，月份要加1
        int month = c.get(Calendar.MONTH)+1;
        //获取天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+ "年"+month +"月"+day+"日");
    }
}
