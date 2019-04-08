package cn.biginteger.demon;

import java.math.BigDecimal;

public class BigDecimalDemon {
    public static void main(String[] args) {

        function();


    }
    /*
    BigDecimal实现除法运算
     */
    public static void function2(){
        BigDecimal b5 = new BigDecimal("1.301");
        BigDecimal b6 = new BigDecimal("100");
        //计算b1/b2的商，调用方法divide
        BigDecimal bigDiv = b5.divide(b6);
        System.out.println(bigDiv);
    }
    /*
        BigDecimal实现三则运算+ - *
         */
    public static void function1(){
        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.01");
        //计算b1+b2的和，调用方法add
        BigDecimal bigAdd = b1.add(b2);
        System.out.println(bigAdd);

        BigDecimal b3 = new BigDecimal("1");
        BigDecimal b4 = new BigDecimal("0.32");
        //计算b3+b4的和，调用方法subtract
        BigDecimal bigSub = b3.subtract(b4);
        System.out.println(bigSub);

        BigDecimal b5 = new BigDecimal("1.015");
        BigDecimal b6 = new BigDecimal("100");
        //计算b3+b4的和，调用方法subtract
        BigDecimal bigMul = b5.multiply(b6);
        System.out.println(bigMul);

    }
     /*
        计算结果，未知
        原因：计算机二进制中，表示浮点数不精确造成
        为解决超大型的浮点数据，提升高精度的浮点运算BigDecimal
         */
     public static void function(){
         System.out.println(0.09+0.01); //0.09999999999999999
         System.out.println(1-0.32); //0.6799999999999999
         System.out.println(1.015*100); //101.49999999999999
         System.out.println(1.301/100); //0.013009999999999999
     }

}
