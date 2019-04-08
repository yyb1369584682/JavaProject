package cn.itcast.demon_08;
/*
定义研发部员工
    属于员工中的一种
    研发员工继承员工类

关键字extends
子类是Develop，父类是Employee
子类自动拥有父类中可以继承的属性和方法
 */
public class Develop extends Employee {
    public void print(){
        System.out.println(name);
    }

}
