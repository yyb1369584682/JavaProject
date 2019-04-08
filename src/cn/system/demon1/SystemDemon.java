package cn.system.demon1;

public class SystemDemon {
    public static void main(String[] args) {
        function4();

    }
    /*
    获取当前操作系统的属性
    static PropertiesDemon getProperties()
     */
    public static void function4(){
        System.out.println(System.getProperties());
    }

    /*
    JVM在内存中收取对象的垃圾
    static void gc（）
     */
    public static void function3(){
        System.gc();
    }
    /*
    退出虚拟机，所有程序全部停止
     */
    public static void function2(){
        System.exit(0);
    }

    /*
    获取系统当前毫秒值
    static long currentTimeMillis()
    对程序执行时间测试
     */
    public static void function(){
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
    }
}
