package cn.fengzhuang.demon1;
/*
JDK1.5之后出现的特性，自动装箱和自动拆箱
自动装箱：基本数据类型，直接变成对象
自动拆箱：对象中的数据类型变回基本数据类型
 */
public class IntegerDemon2 {
    public static void main(String[] args) {
//        function();
//        function2();
        function3();
    }
    public static void function3(){
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);  //false，对象地址
        System.out.println(i1.equals(i2)); //true，继承Object重写equals，比较的对象数据
        System.out.println("###########");
        /*
        整型常量池中的常量范围：-128~127
        在自动装箱时，把int变成Integer的时候，是有规则的，
        当你的int的值在-128-IntegerCache.high(127) 时，
        返回的不是一个新new出来的Integer对象，而是一个已经
        缓存在堆中的Integer对象，
        （我们可以这样理解，系统已经把-128到127之 间的Integer缓存
        到一个Integer数组中去了，如果你要把一个int变成一个Integer
        对象，首先去缓存中找，找到的话直接返回引用给你就 行了，
        不必再新new一个），如果不在-128-IntegerCache.high(127)
        时会返回一个新new出来的Integer对象。
         */
        //数据在byte范围内，JVM不会从新new对象
        Integer a = 127;  //Integer a = new Integer(127);
        Integer b = 127;  //Integer b = a;
        System.out.println(a == b);//true 当a,b大于等于128的时候，此值为false
        System.out.println(a.equals(b));//true
    }
    //自动装箱，拆箱的弊端：存在空指针异常的问题
    public static void function2(){
        Integer i = null;
        i = i +1;
        System.out.println(i);
    }
    //自动装箱，拆箱的好处：基本类型和引用类型直接运算
    public static void function(){
        //引用类型，引用变量一定指向对象
        //自动装箱，基本数据类型是1，直接变成了对象
         Integer i = 1; //Integer i = new Integer(1);
       // i是引用类型，不能和基本类型运算，自动拆箱，引用类型自动转换成基本类型
        i = i +1;    //i.inValue+1 = 2
        //i = 2   //自动装箱
        System.out.println(i);
    }
}
