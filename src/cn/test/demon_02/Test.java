package cn.test.demon_02;

public class Test {
    public static void main(String[] args) {
        //创建一个经理，两个服务员，两个厨师
        jingLi j = new jingLi("小明", "000",50.2);
        j.work();

        fuWuyuan f1 = new fuWuyuan("李四","001");
        fuWuyuan f2 = new fuWuyuan("李五","002");

        f1.work();
        f1.service();

        f2.work();
        f2.service();

        chuShi c1 = new chuShi("张三","035");
        chuShi c2 = new chuShi("张三","035");
        c1.work();
        c1.service();
        c2.work();
        c2.service();


    }
}
