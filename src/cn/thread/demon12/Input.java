package cn.thread.demon12;
/*
输入线程，对资源对象Resource中成员变量赋值
一次赋值张三，男
一次赋值李四，女

 */
public class Input implements Runnable {
    private Resource r ;
    public Input( Resource r){
        this.r = r;
    }
    public void run(){
        int i = 0;
        while(true){
            synchronized (r){
                //如果标记是true，则等待
                if(r.flag){
                    try{
                        r.wait();
                    }catch (Exception ex){
                    }
                }
                if(i%2==0){
                    r.name = "张三";
                    r.sex = "男";
                }else {
                    r.name = "lisi";
                    r.sex = "nv";
                }
                r.flag = true;
                r.notify();
            }
            i++;
        }

    }
}
