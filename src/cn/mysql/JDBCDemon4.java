package cn.mysql;
/*
PrepareStatement接口实现数据表的更新操作
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemon4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、注册驱动
        Class.forName("java.sql.Driver");
        //2、获取数据库连接的静态方法
        String url = "jdbc:mysql://localhost:3306/mybase?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "yyb123.";
        Connection con = DriverManager.getConnection(url, username, password);

        //拼写修改的SQL语句，参数采用？占位
        String sql = "UPDATE sort SET sname=?,sprice=? WHERE sid=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,"汽车美容");
        pst.setObject(2,5000);
        pst.setObject(3,15);
        pst.executeUpdate();

        //关闭资源
        pst.close();
        con.close();
    }
}
