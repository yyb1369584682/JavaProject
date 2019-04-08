package cn.mysql;

import java.sql.*;
import java.util.Scanner;

/*
java程序实现用户登录，用户和密码，数据库检查
防止注入攻击
statement接口实现类，作用执行SQL语句，返回结果集
有一个子接口
 */
public class JDBCDemon3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、注册驱动
        Class.forName("java.sql.Driver");
        //2、获取数据库连接的静态方法
        String url = "jdbc:mysql://localhost:3306/mybase?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "yyb123.";
        Connection con = DriverManager.getConnection(url, username, password);

        //键盘输入用户名和密码
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pass = sc.nextLine();

        //执行SQL语句，数据表，查询用户名和密码，如果存在，登录成功，不存在则登录失败
        String sql = "SELECT * FROM users WHERE username=? AND PASSWORD=?";
        //调用Connection接口的方法prepareStatement，获取PrepareStatement接口的实现类
        //方法中参数，SQL语句中的参数全部采用？占位符
        PreparedStatement pst = con.prepareStatement(sql);
        //调用pst对象set方法，设置问号占位符上的参数
        pst.setObject(1,user);
        pst.setObject(2,pass);
        //调用方法，执行SQL，获取结果集
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("username")+"="+rs.getString("password"));
        }
        //关闭资源
        rs.close();
        pst.close();
        con.close();
    }
}
