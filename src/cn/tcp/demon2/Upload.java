package cn.tcp.demon2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class Upload implements Runnable{
    private Socket socket;
    public Upload(Socket socket){
        this.socket = socket;}
    public void run(){
        try{
        //把上传图片作为输入，保存
        InputStream in = socket.getInputStream();

        //将目的文件夹封装到File对象
        File upload = new File("d:\\upload");
        if(!upload.exists())
            upload.mkdirs();

        //防止文件同名被覆盖，重新定义文件名字
        //规则：域名+毫秒值+6位随机数
        String filename = "gree"+System.currentTimeMillis()+new Random().nextInt(999999)+".psd";
        //创建字节输出流，把上传上来的图片保存到服务器文件夹中
        FileOutputStream fos = new FileOutputStream(upload+File.separator+filename);
        //创建字节数组
        byte[] data = new byte[1024];
        int len = 0;
        while((len = in.read(data)) != -1){
            fos.write(data,0,len);
        }
        //提示上传完成，并返回给客户端
        OutputStream outs = socket.getOutputStream();
        outs.write("上传完成".getBytes());

        //关闭资源
        fos.close();
        outs.close();
        socket.close();
        }catch(Exception ex){

        }

        }

}

