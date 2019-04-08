package cn.thread.demon4;
/*
使用匿名内部类，实现多线程程序
前提：继承或者接口实现
new 父类或者接口（）{
    重写抽象方法
    }
 */
public class ThreadDemon {
    public static void main(String[] args) {
        //继承方式 XXX extends Thread{public void run(){}}
        new Thread(){
            public void run(){
                System.out.println("!!!");
            }
        }.start();

        //实现接口方式 XXX implements Runnable{ public void run(){}}
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("###");
            }
        };
        new Thread(r).start();

        //两种方式结合
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("@@@");
            }
        }).start();
    }
}
