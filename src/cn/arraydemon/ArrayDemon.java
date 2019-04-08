package cn.arraydemon;

import java.util.Arrays;

/*
数组的工具类，包含数组的操作
java.util.arrays
 */
public class ArrayDemon {
    public static void main(String[] args) {
//        function();
//        function2();
        int[] arr = {52,68,75,69,54,67,86,97,99,100};
//        function3();
        int[] ints = function4(arr);
        String s = Arrays.toString(ints);
        System.out.println(s);

    }
    /*
    定义方法，接收输入，存储的是10个人的考试成绩
    将最后三个人的成绩，存储到新的数组中，返回新的数组
     */
    public static int[] function4(int[] arr){
        //对数组进行排序
        Arrays.sort(arr);
        //将最后三个成绩存储到新的数组中
        int[] result = new int[3];
        System.arraycopy(arr,0,result,0,3);
        return result;
    }
    /*
    static String toString(数组)
    将数组变成字符串
     */
    public static void function3(){
        int[] arr = {1,3,5,7,8,10};
        String s = Arrays.toString(arr);
        System.out.println(s);

    }
    /*
    static int binarySearch（数组，被查找的元素）
    数组（有序）的二分搜索法
    返回元素在数组中出现的索引
    元素不存在，则返回的是-（插入点-1）
     */
    public static void function2(){
        int[] i = {1,3,5,7,8,10};
        int i1 = Arrays.binarySearch(i, 0);
        System.out.println(i1);
    }
    /*
    static void sort(数组)
    对数组升序排列
     */
    public static void function(){
        int[] arr = {5,2,6,4,8,3,1};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
