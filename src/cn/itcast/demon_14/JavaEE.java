package cn.itcast.demon_14;
/*
描述JavaEE开发员工类
    工号，姓名 ，工作方法
其他的员工，也具备这些共性，抽取到父类中，自己就不用定义了
是研发部员工的一种，继承研发部类
 */
public class JavaEE extends Develop{
    //重写它父类的父类的抽象方法
    @Override
    public void work() {
        System.out.println("JavaEE工程师在开发淘宝"+super.getName()+"    "+super.getNum());

    }
}
