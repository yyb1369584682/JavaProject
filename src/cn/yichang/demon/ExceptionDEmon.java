package cn.yichang.demon;
/*
异常中的关键字
    throw，在方法内部，抛出异常
    throw后面，必须写new对象，必须是异常的对象，必须是Exception
方法中声明异常关键字
    throws用于在方法的声明上，标明此方法可能出现异常
    请调用者处理
    throws后面必须写异常类的类名

    调用了一个抛出异常的方法，调用者就必须处理
    不处理，则编译失败
 */
public class ExceptionDEmon {
    public static void main(String[] args) throws Exception{
        int[] arr = null;
        int i = getArray(arr);
        System.out.println(i);
    }
    //对数组最后一个索引*2返回
    public static int getArray(int[] arr) throws Exception{
        //对方法参数进行合法性的判断，判断是不是null
        if(arr == null){
            //抛出异常的形式，告诉调用者
            //关键字throw
            throw new Exception("传递数组不存在");
        }
        //对数组进行判断，判断数组中是不是有元素
        if(arr.length == 0){
            throw new Exception("数组中没有任何元素");
        }
        int i = arr[arr.length-1];
        return i*2;
    }
}
