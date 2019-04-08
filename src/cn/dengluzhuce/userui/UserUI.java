package cn.dengluzhuce.userui;

import cn.dengluzhuce.userdao.UserDao;
import java.util.Scanner;

public class UserUI {
    private static Scanner sc = new Scanner(System.in);
    private static UserDao dao = new UserDao();
    private static String username;
    private static String password;
    public static void main(String[] args) {
        while(true){
            String choose = choose();
            switch (choose) {
                case "1":
                    //注册
                    System.out.println("请选择的是注册，请输入用户名");
                    username = sc.next();
                    System.out.println("请输入密码");
                    password = sc.next();
                    boolean register = dao.register(username, password);
                    if (register)
                        System.out.println("注册成功");
                    else
                        System.out.println("此用户名已存在");
                    break;
                case "2":
                    System.out.println("选择的是登陆功能，请输入用户名");
                    username = sc.next();
                    System.out.println("请输入密码");
                    password = sc.next();
                    boolean b = dao.login(username, password);
                    if (b)
                        System.out.println("登陆成功");
                    else
                        System.out.println("登陆失败，请检查你的用户名和密码");
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("没有此功能");
                    break;
            }
        }
    }
    public static String choose(){
        System.out.println("请选择您要使用的功能");
        System.out.println("1、注册  2、登陆 3、退出");
        String in = sc.next();
        return in;
    }
}
