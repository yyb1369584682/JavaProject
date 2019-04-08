package cn.dengluzhuce;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/*
使用DBCP实现数据库的连接池
连接池配置，自定义类
最基本四项完整
对于数据库连接池其他配置，自定义
 */
public class JDBCUtils {
    //创建BasicDataSource类对象
    private static BasicDataSource dataSource = new BasicDataSource();
    //静态代码块，对象BasicDataSource对象中的配置，自定义
    static{
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybase?useUnicode=true&characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("yyb123.");
        //对象连接池中的连接数量配置
        dataSource.setInitialSize(10); //初始化的连接数
        dataSource.setMaxActive(8);   //最大连接数
        dataSource.setMaxIdle(5);    //最大空闲连接数
        dataSource.setMinIdle(1);    //最小空闲连接数
    }
    //定义静态方法，返回BasicDataSource
    public static DataSource getDataSource(){
        return dataSource;
    }

}
