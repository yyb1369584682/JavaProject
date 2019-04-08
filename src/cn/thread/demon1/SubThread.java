package cn.thread.demon1;
/*
定义子类，继承Thread
重写父类方法run
 */
public class SubThread extends Thread{
    public void run(){
        for(int i = 0;i< 50;i++){
            System.out.println("run..."+i);
        }
    }

}
