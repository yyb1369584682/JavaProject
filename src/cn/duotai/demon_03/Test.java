package cn.duotai.demon_03;

import cn.duotai.demon_01.Animal;

/*
比较运算符，结果为真假值
关键字，instanceof比较，比较引用数据类型
关键字instanceof比较，一个引用类型的变量，是不是这个类型的变量
格式：引用变量 instanceof 类名
    p instanceof Student 比较p是不是Student类型的对象，如果是，instanceof返回true
 */
public class Test {
    public static void main(String[] args) {
//        Person p = new Student();
        Person p = new Teacher();  //向上转型：子类提升为父类
        boolean b = p instanceof Student;
        System.out.println(b);
        Student s = (Student)p;     //向下转型：父类类型强制转回子类类型
        s.sleep();


    }
}
