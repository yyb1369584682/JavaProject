package cn.mysql.jdbcutil;
/*
测试JDBC工具类
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBCUtils {
    public static void main(String[] args) throws Exception{
        //获取数据库连接对象
        Connection con = JDBCUtils.getConnection();
        String sql = "SELECT sname from sort";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet re = pst.executeQuery();
        while(re.next()){
            System.out.println(re.getString("sname"));
        }
        //关闭资源
        JDBCUtils.close(con,pst,re);
    }
}
