package cn.jiekou.demon_02;

public class Test {
    public static void main(String[] args) {
        //使用接口中定义的变量
        //常量被静态修饰，可以被类名直接调用，被接口的名字直接调用
        System.out.println(Inter.x);
        InterImpl inter = new InterImpl();
        int sum = inter.getSum(2, 3);
        System.out.println(sum);


    }
}
