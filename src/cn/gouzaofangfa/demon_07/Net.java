package cn.gouzaofangfa.demon_07;

public class Net extends Maintainer {
    //定义Net构造器
    public Net(String name,String id){
        super(name,id);
    }
    //重写work抽象方法
    public void work(){
        System.out.println(getId()+"  "+getName()+ " 网络维修工程师在维修网络");
    }
}
