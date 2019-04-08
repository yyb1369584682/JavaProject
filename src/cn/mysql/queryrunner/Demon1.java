package cn.mysql.queryrunner;

import cn.mysql.demon.JDBCUtilsConfig;
import cn.mysql.jdbcutil.Sort;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/*
QueryRunner数据查询操作：
    调用QueryRunner类方法query(Connection con,String sql,ResultSetHandler r,Object...params)
    ResultSetHandler r 结果集的处理方法，传递ResultSetHandler接口实现类
    Object...params SQL 语句中的？占位符

    注意：query方法返回值，返回的是T泛型，具体返回类型跟随结果集处理方式变化
 */
public class Demon1 {
    private static Connection con = JDBCUtilsConfig.getConnection();
    public static void main(String[] args) throws SQLException{
//        arrayHandler();
//        arrayListHandler();
//        beanHandler();
//        beanListHandler();
//        columnListHandler();
//        scalarHandler();
//        mapHandler();
        mapListHandler();
    }
    /*
    结果集第八种处理方法MapListHandler
    将结果集每一行存储到Map集合，键：列名，值：数据
    Map集合过多，存储到List集合
     */
    public static void mapListHandler()throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        //调用方法query，传递结果集实现类MapListHandler
        //返回值List集合，存储的是Map集合
        List<Map<String,Object>> list = qr.query(con,sql,new MapListHandler());

        //遍历List集合
        for (Map<String, Object> map : list) {
            //遍历Map集合
            for(String key : map.keySet()){
                System.out.print(key+"..."+map.get(key)+"  ");
            }
            System.out.println();
        }
    }

    /*
    结果集的第七种处理方法MapHandler
    将第一行结果封装到Map集合中
    Map<键，值> 键:列名 值:列的数据
     */
    public static void mapHandler()throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        //调用方法query，传递结果集实现类MapHandler
        Map<String,Object> map = qr.query(con,sql,new MapHandler());
        //遍历Map集合
        for(String key: map.keySet()){
            System.out.println(key+"  "+map.get(key));
        }

    }
    /*
    结果集第六种处理方法：ScalarHandler
    对于查询后，只有一个结果
     */
    public static void scalarHandler()throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT COUNT(*) FROM sort";
        Long count = qr.query(con,sql,new ScalarHandler<Long>());
        System.out.println(count);
    }

    /*
    结果集第五种处理方法，ColumnListHandler
    结果集，指定列的数据，存储到List集合
    多个JavaBean对象，每个列数据类型不同
     */
    public static void columnListHandler()throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        //调用query，传递结果集实现类ColumnListHandler
        //实现类构造方法中，使用字符串的列名
        List<Object> list = qr.query(con, sql, new ColumnListHandler<Object>("sname"));
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    /*
     结果集的第四种处理方法BeanListHandler
     将结果集的第一行数据，封装成JavaBean对象
     多个JavaBean对象封装成List集合
     */
    public static void beanListHandler()throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        //调用query，传递结果集处理实现类BeanListHandler
        List<Sort> result = qr.query(con,sql,new BeanListHandler<Sort>(Sort.class));
        for (Sort sort : result) {
            System.out.println(sort);
        }
    }
    /*
    结果集的第三种处理方法BeanHandler
    将结果集的第一行数据，封装成JavaBean对象
    注意：被封装成数据到JavaBean对象，Sort类必须有空参数的构造
     */
    public static void beanHandler()throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        //调用方法，传递结果集实现类BeanHandler
        //BeanHandler(Class<T> type)
         Sort s = qr.query(con,sql,new BeanHandler<Sort>(Sort.class));
        System.out.println(s);
    }
    /*
    结果集第二种处理方法ArrayListHandler
    将结果集对象的每一行，封装到对象的数组中，出现很多对象数组
    将对象数组存储到List集合
     */
    public static void arrayListHandler()throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        //调用query方法,结果集处理的参数上，传递实现类ArrayListHandler
        //方法返回值 每行是一个对象数组，存储到ArrayList
        List<Object[]> result = qr.query(con, sql,new ArrayListHandler());
        for (Object[] objects : result) {
            for (Object object : objects) {
                System.out.print(object+"\t");
            }
            System.out.println();
        }
    }

    /*
    结果集第一种处理方法，ArrayHandler
    将结果集的第一行存储到对象数组中 Object[]
     */
    public static void arrayHandler() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "SELECT * FROM sort";
        //调用方法query执行查询，传递连接对象，SQL语句，结果集处理方法的实现类
        //返回对象数组
        Object[] result = qr.query(con,sql,new ArrayHandler());
        for(Object obj:result){
            System.out.print(obj+"\t");
        }
    }
}
