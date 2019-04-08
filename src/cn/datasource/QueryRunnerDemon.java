package cn.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.SQLException;
import java.util.List;

public class QueryRunnerDemon {
    //定义两个方法，实现数据表的添加，数据表查询
    //QueryRunner类对象，写在类成员位置
    private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
    public static void main(String[] args) {
//        insert();
        select();

    }
    //查询表格数据
    public static void select(){
        String sql = "SELECT * From sort";
        try{
            List<Object[]> list = qr.query(sql, new ArrayListHandler());
            //遍历集合
            for (Object[] objects : list) {
                for (Object object : objects) {
                    System.out.print(object+"\t");
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException("数据查询失败");
        }
    }
    //数据表添加数据
    public static void insert(){
        String sql = "INSERT INTO sort(sname,sprice,sdesc) VALUES(?,?,?)";
        Object[] params = {"水果",56.3,"新鲜上市"};
        try{
            int row = qr.update(sql,params);
            System.out.println(row);
        }catch (SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException("数据添加失败");
        }
    }
}


