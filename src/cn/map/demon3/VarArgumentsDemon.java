package cn.map.demon3;
/*
JDK1.5新特性，方法的可变参数
前提：方法参数数据类型确定，参数个数任意
格式：数据类型...变量名
可变参数，本质就是一个数组
 */
public class VarArgumentsDemon {
    public static void main(String[] args) {
        //调用一个带有可变参数的方法，传递参数，参数个数任意
        int sum = getSum(1);
        System.out.println(sum);

    }
    /*
    可变参数的注意事项
    1、一个方法中，可变参数只能有一个
    可变参数，必须写在参数列表的最后一位
     */
    public static void function(int a){

    }
    public static int getSum(int b,int ...a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
