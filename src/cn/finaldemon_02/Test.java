package cn.finaldemon_02;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
        z.function();

        final int i = 10; //被final修饰，一次赋值，终身不变
//        i = 10;
        System.out.println(i);

        //final修饰引用变量
        //变量保存地址，终身不变
        final Zi z2 = new Zi();
        z2.function();

    }
}
