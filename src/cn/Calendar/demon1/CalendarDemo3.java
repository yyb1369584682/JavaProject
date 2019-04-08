package cn.Calendar.demon1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarDemo3 {
    public static void main(String[] args) throws ParseException {
//        function();
        function2();
    }
    /*
    闰年计算方法
    高级算法：日历设置到指定年份的3月1日，add向前偏移一天，获取天数，29则闰年
     */
    public static void function2(){
        Calendar c = Calendar.getInstance();
        c.set(1992,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int time = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(time);
    }
    /*
    计算活了多少天
    生日 今天的生日
    两个日期变成毫秒值，减法
     */
    public static void function() throws ParseException {
        //获取当前时间
        Date todayDate = new Date();
        //获取生日，键盘输入
        System.out.println("请输入你的生日：YYYY-MM-dd");
        String birthdayString = new Scanner(System.in).next();
        //将字符串日期转换成Date对象
        //创建SimpleDateFormat对象，写日期模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayString);
        //将两个日期转换成毫秒值，Date类的方法getTime
        long birthdayDateTime = birthdayDate.getTime();
        long todayDateTime = todayDate.getTime();
        //做减法
        long day = todayDateTime - birthdayDateTime;
        if(day < 0){
            System.out.println("还没有出生");
        }else{
            System.out.println(day/1000/60/60/24);
        }
    }
}
