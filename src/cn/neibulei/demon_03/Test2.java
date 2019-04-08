package cn.neibulei.demon_03;
/*
new Animal(){
            public void eat(){
                System.out.println("在吃饭");
            }
            public void sleep(){
                System.out.println("在睡觉");
            }
        };
        以上代码就是Anmail的子类对象
        多态性，父类引用 = 子类的对象
 */
public class Test2 {
    public  static void main(String[] args) {
        new Animal(){
            public void eat(){
                System.out.println("在吃饭");
            }
            public void sleep(){
                System.out.println("在睡觉");
            }
        }.eat();
    }
}
