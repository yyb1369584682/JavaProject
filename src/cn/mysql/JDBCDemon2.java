package cn.mysql;

import java.sql.*;
import java.util.Scanner;

/*
java程序实现用户登录，用户和密码，数据库检查
演示被别人注入攻击
 */
public class JDBCDemon2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、注册驱动
        Class.forName("java.sql.Driver");
        //2、获取数据库连接的静态方法
        String url = "jdbc:mysql://localhost:3306/mybase?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "yyb123.";
        Connection con = DriverManager.getConnection(url, username, password);
        //3、获取SQL语句执行对象
        Statement stat = con.createStatement();

        //键盘输入用户名和密码
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pass = sc.nextLine();

        //执行SQL语句，数据表，查询用户名和密码，如果存在，登录成功，不存在则登录失败
        String sql = "SELECT * FROM users WHERE username = '"+user+"' AND PASSWORD = '"+pass+"'";
        System.out.println(sql);
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString("username")+"="+rs.getString("password"));
        }
        //关闭资源
        rs.close();
        stat.close();
        con.close();
    }
}
