package cn.file;
//字节流复制文件
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
将数据源c:\\a.txt
复制到d:\\a.txt
字节输入流，绑定数据源
字节输出流，绑定数据输出源

输入，读取一个字节
输出，写一个字节
特点：效率较低
 */
public class Copy {
    public static void main(String[] args) {
        //定义两个流的对象变量
        long l1 = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            //字节输入流，绑定数据源
            fis = new FileInputStream("c:\\A.zip");
            //字节输出流，绑定数据输出源
            fos = new FileOutputStream("d:\\A.zip");
            //字节输入流，读取1个字节，输出流写一个字节
            int read = 0;
            while((read = fis.read()) != -1){
                    fos.write(read);
            }
        }catch (IOException ex){
            System.out.println(ex);
            throw new RuntimeException("文件复制失败");
        }finally {
            try{
                //关闭资源
                if(fos != null)
                    fos.close();
            }catch(IOException ex){
                throw new RuntimeException("释放资源失败");
            }finally {
                try{
                    if(fis != null)
                        fis.close();
                }catch(IOException ex){
                    throw new RuntimeException("释放资源失败");
                }finally {
                    long l2 = System.currentTimeMillis();
                    System.out.println(l2-l1);
                }
            }
        }

    }
}
