package cn.mysql.jdbcutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
实现JDBC的工具类
定义方法，直接返回数据库的连接对象
写关闭方法
 */
public class JDBCUtils {
    private JDBCUtils(){}

    private static Connection con;

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mybase?useUnicode=true&characterEncoding=utf8";
            String username = "root";
            String password = "yyb123.";
            con = DriverManager.getConnection(url, username, password);
        }catch (Exception ex){
            throw new RuntimeException(ex+"数据库连接失败");

        }
    }
     /*
    定义静态方法，返回数据库的连接对象
     */
     public static Connection getConnection(){
         return con;
     }
     //增删改的时候没有ResultSet
    public static void close(Connection con, Statement stat){
        if (con != null) {
            try {
                con.close();
            } catch (Exception ex) {}
        }
        if (stat != null) {
            try {
                stat.close();
            } catch (Exception ex) {}
        }
    }
     public static void close(Connection con, Statement stat, ResultSet re){
         if (con != null) {
             try {
                 con.close();
             } catch (Exception ex) {}
         }
         if (stat != null) {
             try {
                 stat.close();
             } catch (Exception ex) {}
         }
         if (re != null) {
             try {
                 re.close();
             } catch (Exception ex) {}
         }

         }

}
