package cn.regex.demon_01;

public class RegexDemon2 {
    public static void main(String[] args) {
        checkEmail();
    }
    /*
    检查邮箱地址是否合法
    规则：
        123456@qq.com
        mymail@sina.com
        nimail@163.com
        wodemail@yahoo.com
        @前面：数字，字母，下划线 个数不能少于一个
        @后面.前面：数字，字母 个数不能少于一个
        .后面：字母
     */
    public static void checkEmail(){
        String str = "1369584682@qq.com.cn";
        boolean b = str.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
        System.out.println(b);
    }
}
