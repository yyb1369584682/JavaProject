package cn.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
PrepareStatement接口实现数据表的查询操作
 */
public class JDBCDemon5 {
    public static void main(String[] args) throws Exception{
        Class.forName("java.sql.Driver");
        //2、获取数据库连接的静态方法
        String url = "jdbc:mysql://localhost:3306/mybase?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "yyb123.";
        Connection con = DriverManager.getConnection(url, username, password);

        String sql = "SELECT * from sort";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet re = pst.executeQuery();
        while (re.next()){
            System.out.println(re.getInt("sid")
                    +"   "+re.getString("sname")
                    +"    "+re.getDouble("sprice")
                    +"    "+re.getString("sdesc"));
        }
        //关闭资源
        re.close();
        pst.close();
        con.close();
    }
}
