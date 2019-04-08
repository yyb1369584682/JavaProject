package cn.jiekou.demon_02;

public class InterImpl implements Inter {
    //重写接口中的抽象方法，public权限是必须的
    @Override
    public void show() {
    }
    public int getSum(int a, int b ){
        return a+b;
    }
}
