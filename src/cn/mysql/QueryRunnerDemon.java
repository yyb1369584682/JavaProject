package cn.mysql;

import cn.mysql.demon.JDBCUtilsConfig;
import cn.mysql.jdbcutil.JDBCUtils;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/*
使用QueryRunner类，实现对数据表的insert delete update
调用QueryRunner类的方法update（Connection con,String sql,Object...param）
Object...param可变参数，Object类型，SQL语句会出现？占位符
数据库连接对象，自定义的工具类传递
 */
public class QueryRunnerDemon {
    private static Connection con = JDBCUtilsConfig.getConnection();
    public static void main(String[] args)throws Exception {
//        insert();
//        update();
        delete();
    }
    /*
    定义方法，使用QueryRunner类的方法delete将数据表的数据删除
     */
    public static void delete() throws SQLException{
        //创建QueryRunner类对象
        QueryRunner qr = new QueryRunner();
        String sql = "DELETE  from sort where sid=? ";
        //调用QueryRunner方法update
        int row = qr.update(con,sql,16);
        System.out.println(row);
        DbUtils.closeQuietly(con);
    }
    /*
    定义方法，使用QueryRunner类的方法update将数据表中的数据修改
     */
    public static void update() throws SQLException {
        //创建QueryRunner类对象
        QueryRunner qr = new QueryRunner();
        String sql = "UPDATE  sort SET sname=?,sprice=?,sdesc=? WHERE sid=?";
        //定义Object数组，存储？中的参数
        Object[] params = {"花卉",100.88,"情人节玫瑰花",4};
        //调用QueryRunner方法update
        int row = qr.update(con, sql, params);
        System.out.println(row);
        DbUtils.closeQuietly(con);

    }
    /*
    定义方法，使用QueryRunner类的方法update向数据表中添加数据
     */
    public static void insert()throws Exception{
        //创建QueryRunner类对象
        QueryRunner qr = new QueryRunner();
        String sql = "INSERT INTO sort(sname,sprice,sdesc)VALUES(?,?,?)";
        //将三个？占位符的实际参数，写在数组中
        Object[] paras = {"体育用品",289.32,"购买体育用品"};
        //调用QueryRunner类的方法update执行sql语句
        int row = qr.update(con,sql,paras);
        System.out.println(row);
        DbUtils.closeQuietly(con);

    }
}
