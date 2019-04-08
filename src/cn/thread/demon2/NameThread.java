package cn.thread.demon2;
/*
获取线程名字，父类Thread方法
    String getName()
 */
public class NameThread extends Thread {
    public NameThread(){
        super("Python");
    }
    public void run(){
        System.out.println(super.getName());//super可以省略不写
        System.out.println(getName());
//        System.out.println(0/0);
    }
}
