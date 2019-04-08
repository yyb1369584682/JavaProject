package cn.regex.demon_01;

public class SplitDemon {
    public static void main(String[] args) {
//        split_1();
//        split_2();
        split_3();
    }
    /*
    String类方法split对字符串进行切割
    172.28.170.81按照点进行切分
     */
    public static void split_3(){
        String str = "172.28.170.81";
        String[] s = str.split("\\.+");
        for(int i = 0;i < s.length;i++){
            System.out.println(s[i]);
        }
    }
    /*
    String类方法split对字符串进行切割
    12-25-365-98按照空格进行切分
     */
    public static void split_2(){
        String str = "12   25  365   98";
        String[] s = str.split(" +");
        for(int i = 0;i < s.length;i++){
            System.out.println(s[i]);
        }
    }
    /*
    String类方法split对字符串进行切割
    12-25-365-98
     */
    public static void split_1(){
        String str = "12-25-365-98";
        //按照-对字符串进行切割，String类方法split
        String[] split = str.split("-");
        for(int i = 0;i< split.length;i++){
            System.out.println(split[i]);
        }
        System.out.println("-------");
    }
}
