package cn.duotai.demon_04;
/*
测试类
    1、实现动物和Cat,Dog多态调用
    2、做类型的强制转换，调用子类的特有功能
 */
public class Test {
    public static void main(String[] args) {
        Anmail a1 = new Cat();
        Anmail a2 = new Dog();
        a1.eat();
        a2.eat();
        //类型向下转换，属于强制转换，转换后可以调用子类特有方法
        //为了防止发生异常：a1属于Cat类，转成Cat对象，转换成Cat类
        //a2属于Dog对象，转成Dog
        //用instanceof判断
        if(a2 instanceof Cat){
            Cat c = (Cat)a2;
            c.catchMouse();
        }
        if(a2 instanceof Dog){
            Dog d = (Dog)a2;
            d.lookHome();
        }

    }
}
