package cn.file;
/*
字节流复制文件(可以复制文本、图片)
采用数组缓冲来提高效率
字节数组
FileInputStream读取字节数组
FileOutputStream写字节数组
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy2 {
    public static void main(String[] args) {
        //定义流对象
        long l1 = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            //创建输入、输出流，绑定输入输出流目录
            fis = new FileInputStream("d:\\p.PNG");
            fos = new FileOutputStream("c:\\p.PNG");
            //定义字节数组，缓冲
            byte[] b = new byte[1024*100];
            int read = 0;
            while((read=fis.read(b)) != -1){
                fos.write(b,0,read);
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
