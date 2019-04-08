package cn.neibulei.demon_03;
/*
匿名内部类，简化问题：定义实现类，重写方法,建立实现类对象，合并为一步完成
 */
public interface Smoking {
    public abstract void smoking();
}
/*
实现类，实现接口，重写接口抽象方法，创建实现类对象
class XXX implements Smoking{
    public void smoking(){
    }
}
//子类调用
XXX x = new XXX();\\
x.smoking();
//多态调用
Smoking s = new XXX;
s.smoking();


 */
