package cn.fanshe.demon1;

public class Person {
    public String name;
    private int age;

//    static{
//        System.out.println("静态代码块");
//    }
    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    private Person(int age,String name){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(){
        System.out.println("人在睡觉");
    }
    public void sleep(String s,int a,double d){
        System.out.println("人在睡觉"+s+"....."+a+"...."+d);
    }

    public String toString(){
        return "Person [ name="+name+", age="+age+"]";
    }
}
