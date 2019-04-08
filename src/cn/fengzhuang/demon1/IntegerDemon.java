package cn.fengzhuang.demon1;
/*
Integer类，封装基本数据类型int，提供大量方法
将字符串转换成基本数据类型int
 */
public class IntegerDemon {
    public static void main(String[] args) {
//        function();
//        function2();
//        function3();
//        function4();
//        function5();
        function6();

    }
    /*
    Integer类的静态方法
    做进制的转换
    十进制转换成二进制 toBinarString(int)
    十进制转换成八进制 toOctalString(int)
    十进制转换成十六进制 toHexString(int)
    三个方法的返回值都是以String形式出现
     */
    public static void function6(){
        System.out.println(Integer.toBinaryString(99));
        System.out.println(Integer.toOctalString(99));
        System.out.println(Integer.toHexString(99));
    }
    /*
    Integer类的静态成员变量
    MAX_VALUE、MIN_VALUE
     */
    public static void function5(){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    /*
    Integer类的构造方法
    Integer（String s）
    将数字格式的字符串，传递到Integer类的构造方法中
    创建Integer对象，包装的是一个字符串
    将构造方法中的字符串，转成基本数据类型，调用方法，非静态的，intValue
    intValue以int类型返回该Integer的值
     */
    public static void function4(){
        Integer i = new Integer("100");
        int i1 = i.intValue();
        System.out.println(i1--);
    }
    /*
    如何把基本类型int，变成字符串String
    方法一：任何类型+" "，变成String类型
    方法二：Integer类中的静态方法toString（）
    toString(int , int 进制)，将int进制，转成指定进制数
     */
    public static void function3(){
        int i = 3;
        String s = i + "";
        System.out.println(s+1);

        String s1 = Integer.toString(5);
        System.out.println(s1+1);

        String s2 = Integer.toString(5,2);
        System.out.println(s2);

    }
    /*
    Integer类静态方法parseInt(String s,int int radix)
    radix基数,表示进制
    把其他进制数转换为十进制数int型
     */
    public static void function2(){
        int i = Integer.parseInt("110", 2);
        System.out.println(i);
    }
    /*
    Integer类中静态方法parseInt（String s）返回基本数据类型
    要求：字符串必须是数字格式的。
     */
    public static void function(){
        int i = Integer.parseInt("12");
        System.out.println(i/2);
    }
}
