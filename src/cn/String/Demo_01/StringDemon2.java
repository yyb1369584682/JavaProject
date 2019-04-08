package cn.String.Demo_01;

public class StringDemon2 {
    public static void main(String[] args) {
        //字符串定义方式有两种
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1);
        System.out.println(s2);
        //引用数据类型，比较的是对象的地址
        System.out.println(s1 == s2);  //false
        //String类继承Object，重写了父类的方法equals，
        // 建立了字符串自己的比较方式，字符串中每个字符是否相同
        System.out.println(s1.equals(s2));  //true

    }
}
