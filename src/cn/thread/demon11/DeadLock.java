package cn.thread.demon11;

public class DeadLock implements Runnable{
    private int i = 0;
    public void run(){
        while(true){
            if(i%2 == 0){
                synchronized (LockA.lock){
                    System.out.println("if...locka");
                    synchronized (LockB.lock){
                        System.out.println("if...locka..lockb");
                    }
                }
            }else {
                synchronized (LockB.lock){
                    System.out.println("if....lockb");
                    synchronized (LockA.lock){
                        System.out.println("if...lockb...locka");
                    }
                }
            }
            i++;
        }
    }
}
