package cn.thread.demon9;

public class ThreadDemon {
    public static void main(String[] args) {
        Tickets t = new Tickets();
        Thread t0 = new Thread(t);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t0.start();
        t1.start();
        t2.start();
    }
}
