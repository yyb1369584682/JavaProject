package cn.itcast.demon_14;
/*
测试员工类
创建子类对象
 */
public class Test {
    public static void main(String[] args) {
        JavaEE ee = new JavaEE();
        Network net = new Network();

        ee.setName("张三");
        ee.setNum("002");
        net.setName("李四");
        net.setNum("008");

//        System.out.println(ee.getName()+"    "+ ee.getNum());
//        System.out.println(net.getName()+"    "+ net.getNum());

        ee.work();
        net.work();
    }
}
