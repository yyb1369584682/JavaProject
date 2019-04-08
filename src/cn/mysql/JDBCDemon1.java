package cn.mysql;

import java.sql.*;

/*
JDBC技术，查询数据表，获取结果
 */
public class JDBCDemon1 {
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
        //4、调用执行者对象方法，执行SQL语句获取结果集
        //ResultSet executeQuery（String sql）执行SQL语句中的select语句
        //返回值ResultSet接口的实现类对象，实现类在Mysql驱动中。
        ResultSet result = stat.executeQuery("select * from sort");
        //5、处理查询结果集
        //ResultSet接口方法boolean next()返回true，有结果集，返回false没有结果集
        while(result.next()){
            //获取没列数据，使用ResultSet接口的方法getXXX方法参数中，建议写String列名
            System.out.println(result.getInt("sid")
                    +"  "+result.getString("sname")
                    +"   "+result.getDouble("sprice")
                    +"  "+result.getString("sdesc"));
        }
        //6、关闭资源
        result.close();
        stat.close();
        con.close();
    }
}
