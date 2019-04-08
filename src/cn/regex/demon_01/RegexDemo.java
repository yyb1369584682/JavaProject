package cn.regex.demon_01;
/*
实现正则规则和字符串进行匹配，使用到字符串类的方法
String类的三个和正则表达式相关的方法
    1、匹配
    boolean matches(String 正则的规则)
    "abc".matches("[a]") 匹配成功返回true
    2、分割
    String[] split(String 正则的规则)
    "abc".split("a")使用规则将字符串进行切割

    3、替换
    String replaceAll()(String 正则规则，String 字符串)
    "abc0123".replaceAll("[\\d]","#")
    按照正则的规则，替换字符串
 */
public class RegexDemo {
    public static void main(String[] args) {
        checkQQ();
        checkPhone();
    }
    /*
    检查QQ号码是否合法
    0不能开头，全数字，位数5-10
    \\d匹配是数字的 \\D匹配不是数字的
     */
    public static void checkQQ(){
        String qq = "12345678";
        boolean b = qq.matches("[1-9][\\d]{4,9}");
        System.out.println(b);
    }
    /*
    检查手机号
    1开头，第二位可以是34579，位数固定位11位
     */
    public static void checkPhone(){
        String num = "18578275949";
        boolean b = num.matches("1[3,4,5,7,8][\\d]{9}");
        System.out.println(b);

    }
}
