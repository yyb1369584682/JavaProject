package cn.dengluzhuce.userdao;

import cn.dengluzhuce.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import java.sql.SQLException;

/*
实现用户注册登陆功能
 */
public class UserDao {
    private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
    //实现登陆功能
    public static boolean login(String username,String password){
        try{
            //拼写查询数据表的SQL语句
            String sql = "SELECT * FROM users WHERE username=? and password=?";
            Object[] param = {username,password};
            //调用qr方法query查询数据表
            Object[] obj = qr.query(sql, new ArrayHandler(), param);
            //对数组进行判断，没有结果集
            if(obj.length == 0)
                return false;
            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException("登陆失败");
        }
    }
    //实现注册功能
    public static boolean register(String username,String password){
        try{
            //拼写SQL语句,检查用户名是否被占，用户名作为查询条件
            String sql = "SELECT username from users where username=?";
            //调用qr对象方法query查询结果集，ScalarHandler一个结果集
            String user = qr.query(sql,new ScalarHandler<String>(),username);
            //如果用户名存在，user变量表示一个用户名，用户名不存在，user变量结果为null
            if( user != null)
                return false;
            //用户名不存在的话，把该用户名与密码存入数据库，完整注册
            sql = "INSERT  INTO users(username,PASSWORD) VALUES(?,?)";
            Object[] param = {username, password};
            int row = qr.update(sql, param);
            System.out.println(row);
            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException("注册失败");
        }

    }
}
