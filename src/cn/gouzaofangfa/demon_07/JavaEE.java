package cn.gouzaofangfa.demon_07;
/*
定义JavaEE工程师，属于研发部的员工，继承研发部
 */
public class JavaEE extends Develop {
    public JavaEE(String name,String id){
        super(name,id);
    }
    //重写work抽象方法
    public void work(){
        System.out.println(getId()+"  "+getName() +" JavaEE工程师在开发淘宝");
    }

}
