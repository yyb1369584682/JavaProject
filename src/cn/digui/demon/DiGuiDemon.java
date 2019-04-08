package cn.digui.demon;
/*
方法的递归调用
    方法自己调用自己
    适合于方法中运算的主体不变，但是运行的时候，参与运行的方法参数会变化
注意：
    递归一定要有出口，必须可以让程序停下
    递归次数不能过多
    构造方法，禁止递归
 */
public class DiGuiDemon {
    public static void main(String[] args) {
//        int sum = getSum(100);
        int function = function(5);
        System.out.println(function);
    }
    /*
    计算阶乘5！
     */
    public static int function(int n){
        if(n==1)
            return 1;
        return n*function(n-1);
    }
    /*
    计算1+2+3+...+100的和，等于5050
    计算规律：
        n+(n-1)+(n-2)+....+1
        100+(100-1)(99-1)+...+1
     */
    public static int getSum(int n){
        if(n == 1)
            return 1;
        return n+getSum(n-1);
    }
}
