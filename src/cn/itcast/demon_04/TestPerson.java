package cn.itcast.demon_04;
/*
定义好的Person类进行测试
创建对象，对象调用属性和方法
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "张三";
        person.setAge(-25);
        person.spark();
        person.getAge();
    }
}
