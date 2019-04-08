package cn.test.demon_02;
/*
定义厨师类
    属于员工的一种，具有额外的VIP功能
    继承Employee，实现VIP接口
 */
public class chuShi extends Employee implements VIP{
    //空参构造器
    public chuShi(){

    }
    //有参数构造器
    public chuShi(String name,String id){
        super(name, id);
    }
    public void work(){
        System.out.println("厨师在炒菜");
    }

    public void service(){
        System.out.println("加大菜量");
    }
}
