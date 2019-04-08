package cn.thread.demon1;
//Java的线程都是通过java.lang.Thread类来实现的，可以通过Thread类的实例来创建新的线程。
//每个线程都是通过某个特定的Thread对象所对应的run来完成其操作的，run称为线程体
//通过Thread类的start方法来启动一个线程
/*
创建和启动一个线程
    创建Thread子类对象
    子类对象调用start（）
        让线程程序执行，JVM调用线程中的run
 */
public class ThreadDemon {
    public static void main(String[] args) {
        //创建状态：在生成线程对象，并没有调用对象的start方法
        SubThread st = new SubThread();
        //就绪状态，当调用了start方法之后，线程就进入了就绪状态
        st.start();
        for(int i = 0;i< 50;i++){
            System.out.println("main..."+i);
        }

    }
}
