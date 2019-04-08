package cn.test.demon_02;
/*
定义经理类
    属于员工的一种，没有VIP功能
    自己有奖金属性
 */
public class jingLi extends Employee {
    //定义奖金属性
    private double money;
    //定义空参构造方法
    public jingLi(){}

    public jingLi(String name, String id,Double money){
        super(name,id);
        this.money = money;
    }

    //重写抽象方法
    public void work(){
        System.out.println("管理，谁出错我罚谁");
    }

    public void money(){
        System.out.println("经理得到奖金");
    }
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


}
