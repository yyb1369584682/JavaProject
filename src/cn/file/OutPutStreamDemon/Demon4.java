package cn.file.OutPutStreamDemon;


import java.io.FileOutputStream;
import java.io.IOException;


/*
IO流异常处理
try catch finally
细节：
    1、保证流对象变量，作用域足够
    2、catch里面，怎么处理异常
        输出异常信息，目的是看哪出现了问题
        停止程序，重新尝试
    3、如果流对象建立失败了，需要关闭资源吗
        new对象建立失败的时候。不占用系统资源，不需要关闭
        释放资源的时候，对流对象判断null
        变量不是null，需要关闭资源
 */
public class Demon4 {
    public static void main(String[] args) {
        //try外面声明变量，try里面建立对象
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("d:\\demon\\a\\a.txt");
            fos.write(100);
        }catch(IOException ex){
            System.out.println(ex);
            throw new RuntimeException("文件写入失败，请重试");
        }finally{
            try{
                if(fos != null)
                    fos.close();
            }catch(IOException ex){
                System.out.println(ex.getMessage());
                throw new RuntimeException("关闭资源失败");
            }
        }


    }
}
