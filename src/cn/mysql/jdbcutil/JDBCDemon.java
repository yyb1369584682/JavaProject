package cn.mysql.jdbcutil;
/*
JDBC读取数据表sort，每行数据封装sort类的对象中
很多个Sort类对象，存储到List集合中
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemon {
    public static void main(String[] args) throws Exception{
        //使用JDBC工具类，直接获取数据库连接对象
        Connection con = JDBCUtils.getConnection();
        //连接获取数据库SQL语句执行者对象
        PreparedStatement pst = con.prepareStatement("SELECT * FROM sort");
        //调用查询方法，获取结果集
        ResultSet re = pst.executeQuery();
        //创建集合对象
        List<Sort> list = new ArrayList<Sort>();
        while(re.next()){
            //获取到每个列数据，封装到Sort对象中
           Sort s = new Sort(re.getInt("sid"),re.getString("sname"),
                   re.getDouble("sprice"),re.getString("sdesc"));
           //封装的Sort对象，存储到集合中
           list.add(s);
        }
        //关闭资源
        JDBCUtils.close(con,pst,re);
        //遍历List集合
        for (Sort sort : list) {
            System.out.println(sort);
        }

    }
}
