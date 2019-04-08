package cn.biginteger.demon;

import java.math.BigInteger;

/*
超级大的整数运算
    超过long取值范围的整数，封装成BigInteger类型的对象
 */
public class BigIntegerDemon {
    public static void main(String[] args) {
        function();

    }
    /*
    BigInteger类的构造方法
    传递字符串，要求数字格式，没有长度限制
     */
    public static void function(){
        BigInteger b1 = new BigInteger("2543348453164863541512154152131531313");
        BigInteger b2 = new BigInteger("2543874674647564654845415343154634153121");
        System.out.println(b1);
        System.out.println(b2);
    }
}
