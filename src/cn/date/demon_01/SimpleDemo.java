package cn.date.demon_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
对日期进行格式化（自定义）
    对日期格式化的类java.text.DateFormat抽象类，普通方法，也有抽象的方法
    实际使用的是子类java.text.SimpleDateFormat可以使用父类普通方法，重写抽象方法
 */
public class SimpleDemo {
    public static void main(String[] args) throws ParseException {
//        function();
        function2();

    }
    /*
    如何对日期进行格式化
    步骤：
        1、创建SimpleDateFormat对象
        在类构造方法中，写入字符串的日期格式（自己定义）
        2、SimpleDateFormat调用方法format对日期进行格式化
        String format（Date date）传递日期对象，返回字符串
        日期格式：
        yyyy 年份
        MM   月份
        dd   月中的天数
        HH   0-23小时
        mm   小时中的分钟数
        ss   秒
        yyyy年MM月dd日HH点m分ss秒  其中的汉字可以随便写，但其中表示的字母字段不能修改
     */
    public static void function(){
        SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日HH点m分ss秒");
        String format = date.format(new Date());
        System.out.println(format);
    }
    /*
    DateFormat类方法parse
    将字符串解析成日期对象
    Date parse(String s)将字符串变成日期对象
    String 转成Date 用parse
    Date 转成 String用 format
     */
    /*
    将字符串转成Date对象
    DateFormat类方法parse
    步骤：
    1、创建SimpleDateFormat的对象
    构造方法中，指定日期模式
    2、子类对象，调用方法parse传递String返回Date
     */
    public static void function2() throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd-HH-m-ss");
        Date parse = date.parse("2018-12-12-10-17-56");
        System.out.println(parse);
    }
}
