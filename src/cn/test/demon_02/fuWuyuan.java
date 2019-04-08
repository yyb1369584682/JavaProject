package cn.test.demon_02;
/*
定义服务员类
    属于员工的一种，具有额外的VIP功能
    继承Employee，实现VIP接口
 */
public class fuWuyuan extends Employee implements VIP{
    //空参构造方法
    public fuWuyuan(){}
    //有参数构造方法
    public fuWuyuan(String name,String id){
       super(name,id);
    }
    public void work(){
        System.out.println("服务员在上菜");
    }

    public void service(){
        System.out.println("服务员为顾客倒酒");
    }
}
