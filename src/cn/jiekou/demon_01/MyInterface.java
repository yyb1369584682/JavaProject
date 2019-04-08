package cn.jiekou.demon_01;
/*
定义接口
    使用关键字Interface 接口名字
接口定义
    成员方法，全抽象
    不能定义带有方法体的方法

定义抽象方法：固定格式
    public abstract 返回值类型 方法名字（参数列表）；
    修饰符public 写或者不写，都是public

    接口中成员变量的定义
        具体要求：
        必须定义为常量
        固定格式：public static final 数据类型 变量名 = 值
 */
public interface MyInterface {
    //在接口中定义抽象方法
    public abstract void function();
}
