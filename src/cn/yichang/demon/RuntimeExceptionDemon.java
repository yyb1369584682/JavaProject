package cn.yichang.demon;
/*
异常分为编译异常和运行时期异常
    编译异常：调用了抛出异常的方法，不处理编译失败（try throws）
    运行异常：抛出的异常是RuntimeException类，或者是他的子类
运行异常的特点：
    方法内部抛出的异常是运行异常，new XXXException
    方法的声明上，不需要throws语句，而且调用者也不需要处理
    设计原因：运行异常一般不能发生，但是如果发生了，需要程序
    人员停止程序修改代码
 */
public class RuntimeExceptionDemon {
    public static void main(String[] args) {
//        function();
        System.out.println(getArea(-1));
    }
    //计算圆的面积
    //传递参数0，或者负数，计算的时候没有问题
    //但是违反了真实情况，所以放参数小于等于0
    // 的时候，不要再计算了
    public static double getArea(double r){
        if(r <= 0){
            throw new RuntimeException("圆不存在");
        }
        return r*r*Math.PI;
    }
    //程序运行时异常ArrayIndexOutOfBoundsException
    public static void function(){
        int[] arr = {1,2,3};
        //对数组的5索引进行判断，如果5索引大于100，请将5索引上的数据/2，否则/3
        //索引根本没有
        if(arr[5] > 100){
            arr[2] = arr[5]/2;
        }else {
            arr[5] = arr[5]/3;
        }
    }
}
