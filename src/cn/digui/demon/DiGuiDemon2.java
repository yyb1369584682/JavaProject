package cn.digui.demon;
/*
斐波那契数列
后一项是前两项之和
1 1 2 3 5 8
 */
public class DiGuiDemon2 {
    public static void main(String[] args) {
        System.out.println(function(12));

    }
    public static int function(int n){
        if (n == 1)
            return 1;
        if(n == 2)
            return 1;
        return function(n-1)+function(n-2);
    }
}
