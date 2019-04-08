package cn.itcast.demon_09;
//子类的对象调用成员变量，子类自己有的话，就用子类的，子类没有就调用父类的。
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi.i);
        zi.show();
    }
}
