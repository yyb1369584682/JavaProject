package cn.mathdemon1;

public class MathDemon {
    public static void main(String[] args) {
        function();
        function2();
        function3();
        function4();
        function5();
    }
    /*
    static double random()返回随机数0.0-1.0之间
    来源，也是随机数
     */
    public static void function5(){
        for (int i = 0; i < 10; i++) {
            double random = Math.random();
            System.out.println(random);
        }
    }
    /*
    static double pow(double a,double b)
    a的b次方
     */
    public static void function4(){
        double pow = Math.pow(2, 2);
        System.out.println(pow);
    }
    /*
    static double floor(double d)
    返回小于或者等于参数d的最大整数
     */
    public static void function3(){
        double floor = Math.floor(9.2);
        System.out.println(floor);
    }
    /*
    static double ceil(double d)
    返回大于或者等于参数d的最小整数
     */
    public static void function2(){
        double ceil = Math.ceil(9.2);
        System.out.println(ceil);
    }
    /*
    static int abs(int i)
    获取参数的绝对值
     */
    public static void function(){
        int abs = Math.abs(-6);
        System.out.println(abs);
    }
}
