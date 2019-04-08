package cn.test.demon_02;
/*
酒店的员工类
    员工的共性：姓名，工号，工作方法
 */
public abstract class Employee {
    private  String name;
    private  String id;
    //定义构造方法
    public Employee(){}
    public Employee(String name, String id){
        this.name = name;
        this.id = id;
    }

    public abstract void work();

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  String getId() {
        return id;
    }

    public  void setId(String id) {
        this.id = id;
    }


}
