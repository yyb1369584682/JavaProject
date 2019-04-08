package cn.thread.demon10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
采用同步方法，解决线程的安全问题
好处：代码简洁
将线程共享数据和同步，抽取到一个方法中。
在方法的声明上，加入同步关键字

问题：同步方法有锁吗，肯定有，同步方法中的对象锁，是本类对象引用this
      如果是静态方法呢，同步有锁吗，有，肯定不是this
      锁是本类自己.class属性
      静态方法，同步锁，是本类类名.class属性。
 */
public class Tickets implements Runnable {
    //定义出售的票源
    private int ticket = 100;
    //在类的成员位置，创建Lock接口的实现类对象
    private Lock lock = new ReentrantLock();
    public void run(){
        while (true){
            //调用Lock接口方法lock获取锁
            lock.lock();
            //对票数判断，可以出售，变量--操作
            if(ticket>0){
                try{
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"出售第"+ticket--+"张票");
                }catch (Exception ex){
                }finally {

                }
            }
            //释放锁，调用Lock接口方法unlock
            lock.unlock();

        }
    }
}
