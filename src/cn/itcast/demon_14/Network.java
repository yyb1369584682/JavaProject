package cn.itcast.demon_14;
/*
描述的是网络维护工程师
属于修护部的员工，是继承维护部类
 */
public class Network extends Maintainer{
    @Override
    public void work() {
        System.out.println("网络工程师在检查网络是否畅通"+super.getName()+"   "+super.getNum());
    }
}
