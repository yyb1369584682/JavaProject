package bigdata;
/*存储学生：学生类型存储到集合中
        总览：遍历集合
        随机：随机数作为索引，到集合中去找到元素
        三个功能，共享的数据，集合容器
        定义三个方法，必须参数传递集合*/


import java.util.ArrayList;
import java.util.Random;

public class CallName {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        addstudent(arr);
        printStudent(arr);
        System.out.println("---------------");
        ranStudent(arr);

    }

    //添加学生
    public static void addstudent(ArrayList<Student> arr){
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();

        student1.name = "zhangsan1";
        student1.age = "11";

        student2.name = "zhangsan2";
        student2.age = "12";

        student3.name = "zhangsan3";
        student3.age = "13";

        student4.name = "zhangsan4";
        student4.age = "14";

        student5.name = "zhangsan5";
        student5.age = "15";

        student6.name = "zhangsan6";
        student6.age = "16";

        //把学生添加到集合里
        arr.add(student1);
        arr.add(student2);
        arr.add(student3);
        arr.add(student4);
        arr.add(student5);
        arr.add(student6);
    }

    public static void printStudent(ArrayList<Student> arr){
//        for (Student student : arr) {
//            System.out.println(student.name + "   "+student.age);
//        }
        for (int i = 0;i<arr.size();i++){
            Student student = arr.get(i);
            System.out.println(student.name + "   "+student.age);
        }
    }

    public static void ranStudent(ArrayList<Student> arr){
        Random random = new Random();
        int i = random.nextInt(arr.size());
        Student student = arr.get(i);
        System.out.println(student.name + "   "+student.age);


    }

}
