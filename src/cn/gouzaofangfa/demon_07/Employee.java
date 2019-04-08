package cn.gouzaofangfa.demon_07;
//定义员工类
public abstract class Employee {
    private String name;
    private String id;

    //定义员工构造器
    public Employee(String name,String id){
        this.name = name;
        this.id = id;
    }

    //定义工作的抽象方法
    public abstract void work();

    //定义name,age的set，get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
