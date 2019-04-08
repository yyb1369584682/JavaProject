package cn.set.demon;

/*
HashSet集合的自身特点：
    底层数据结构为哈希表
    存储，取出都比较快
    线程不安全，运行速度快
 */
public class HashSetDemon2 {
    /*
            对象的哈希值，普通的十进制整数
            父类的Object，方法public int hashCode()计算结果为int
            hashCode()返回对象的hash值
             */
    public static void main(String[] args) {
        Person p = new Person();
        int i = p.hashCode();
        System.out.println(i);
        //String类继承Object类，重写了hashCode方法
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
}
