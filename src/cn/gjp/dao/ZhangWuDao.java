package cn.gjp.dao;

import cn.gjp.domin.ZhangWu;
import cn.gjp.tools.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/*
实现对数据表gjp_zhangwu 的增删改查操作
dbutils工具类完成，类成员创建QueryRunner对象，指定数据源
 */
public class ZhangWuDao {
    private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
    /*
       定义方法，查询数据库，实现删除账务
       方法由service业务层调用，传递参数zwid
       将zwid对应的记录进行删除
        */
    public void deleteZhangWu(int zwid) {
        try {
            //删除数据的SQL语句
            String sql = "DELETE FROM gjp_zhangwu WHERE zwid=?";
            qr.update(sql, zwid);
        }catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("删除账务失败");
        }
    }
    /*
    定义方法，查询数据库，实现编辑账务
    方法由service业务层调用，传递ZhangWu对象
    将ZhangWu对象中的数据，更新到数据表
     */
    public void editZhangWu(ZhangWu zw){
        try {
            //更新数据的SQL语句
            String sql = "UPDATE gjp_zhangwu SET flname=?,money=?,zhanghu=?,createtime=?,description=? WHERE zwid=?";
            //实际参数来源是传递过来的对象ZhangWu
            Object[] params = {zw.getFlname(), zw.getMoney(), zw.getZhanghu(), zw.getCreatetime(), zw.getDescription(), zw.getZwid()};
            qr.update(sql, params);
        }catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("账务编辑失败");
        }

    }
    /*
    定义方法，查询数据库，实现添加账务
    方法由service业务层调用，传递ZhangWu对象
    将ZhangWu对象中的数据，添加到数据表
     */
    public void addZhangWu(ZhangWu zw){
        try {
            //拼写SQL语句
            String sql = "INSERT INTO gjp_zhangwu(flname,money,zhanghu,createtime,description)VALUES(?,?,?,?,?)";
            //创建对象数据，存储5个占位符的实际参数
            //实际参数来源是传递过来的对象ZhangWu
            Object[] params = {zw.getFlname(), zw.getMoney(), zw.getZhanghu(), zw.getCreatetime(), zw.getDescription()};
            qr.update(sql, params);
        }catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("账务添加失败");
        }

    }
    /*
    定义方法，查询数据库，获取相应账务数据
    方法由业务层调用,查询结果集存储到
    结果集，将所有账务数据，存储到Bean对象中，存储到集合中
     */
    public List<ZhangWu> select(String startDate,String stopDate){
        try {
            //根据日期条件查询账务数据的SQL语句
            String sql = "SELECT * FROM gjp_zhangwu WHERE  createtime BETWEEN ? AND ? ";   //?必须为英文字符
            Object[] params = {startDate, stopDate};
            //调用qr对象的方法
            return qr.query(sql, new BeanListHandler<>(ZhangWu.class), params);
        }catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("条件查询失败");
        }
    }
    /*
    定义方法，查询数据库，获取所有账务数据
    方法由业务层调用
    结果集，将所有账务数据，存储到Bean对象中，存储到集合中
     */
    public List<ZhangWu> selectAll(){
        try {
            //查询账务数据的SQL语句
            String sql = "SELECT * FROM gjp_zhangwu";
            //调用qr对象的方法
            List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
            return list;
        }catch (SQLException ex){
            System.out.println(ex);
            throw new RuntimeException("查询所有账务失败");
        }
    }


}
