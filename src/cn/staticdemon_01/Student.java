package cn.staticdemon_01;
/*
静态的注意事项
在静态中不能调用非静态
为什么呢？（生命周期不同）
静态优先于非静态存在于内存中
静态 前人先人 非静态 后人
静态不能写this，不能写super

问题：static 修饰到底什么时候用，应用场景
成员变量加不加static，要根据具体事物，具体分析问题
    定义事物的时候，多个事物之间是否有共性的数据
    若有，则将共性之间的数据定义为静态成员
成员方法加不加static，跟着变量走
    如果方法没有调用非静态成员，则将方法定义为静态
 */
public class Student {
    private static String name;
    private static int age;
    public static void function(){
        System.out.println(name+age);
    }
}
