package cn.set.demon;

public class Person {
    /*
    hashCode没有做重写父类的话，每次运行的结果都是不同的整数
    如果子类重写父类的方法，哈希值则应该是自定义的值
    哈希值是存储到hash表的依据
     */
    public int hashCode(){
        return 1;
    }
}
