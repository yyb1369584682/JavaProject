package cn.itcast.demon_03;

public class TestPersion {
    public static void main(String[] args) {
        int i = 5;
        function(i);
        System.out.println(i);
        Persion persion = new Persion();
        persion.name = "张三";
        System.out.println(persion.name);
        function(persion);
        System.out.println(persion.name);
    }

    //定义方法，参数类型是基本数据类型
    public static void function(int i){
        i += 1;
    }

    /*
    定义方法，参数类型是引用数据类型Persion
    p接收的是一个内存的地址
    main中的p和function中的变量p保存的地址是一样的
     */
    public static void function(Persion persion){
        persion.name = "李四";
    }
}
