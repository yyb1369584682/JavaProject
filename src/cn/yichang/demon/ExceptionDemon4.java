package cn.yichang.demon;
/*
异常的处理方式
try....catch.....finally
格式：
    try{
       被检测的代码
       可能出现异常的代码
    }catch(异常类名 变量){
        异常处理的方式
        循环，判断，调用方式，变量
     }finally{
     必须要执行的代码
     }

     finally，无论程序是否有异常出现，程序必须执行
     用于释放资源
 */
public class ExceptionDemon4 {
    public static void main(String[] args) {
        try{
            get(0);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("这里的代码必须执行");
        }
    }
    public static void get(int a)throws Exception{
        if(a == 0)
            throw new Exception();
        System.out.println(a);
    }
}
