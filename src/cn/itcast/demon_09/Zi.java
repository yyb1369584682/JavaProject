package cn.itcast.demon_09;
//this.调用本类成员
//super.调用的自己父类成员
public class Zi extends Fu{
    int i = 2;

    public void show(){
        int i = 3;
        System.out.println(i); //打印结果为3
        System.out.println(this.i);  //打印结果为2
        System.out.println(super.i);  //打印结果为1
    }
}
