package cn.thread.demon9;
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
    private int ticket = 100;
    public void run(){
        while (true){
            payTicket();
        }
    }
    public synchronized void payTicket(){
        //线程共享数据，保证安全,加入同步代码块
            //对票数判断，可以出售，变量--操作
            if(ticket>0){
                try{
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"出售第"+ticket--+"张票");
                }catch (Exception ex){
                }
            }
        }
}
