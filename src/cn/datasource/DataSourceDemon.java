package cn.datasource;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/*
连接池jar包中，定义好一个类BasicDataSource
实现类数据源的规范接口javax.sql.DataSource
 */
public class DataSourceDemon {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybase");
        dataSource.setUsername("root");
        dataSource.setPassword("yyb123.");
        try{
            Connection con = dataSource.getConnection();
            System.out.println(con);
        }catch (SQLException ex){
            throw new RuntimeException();
        }
    }
}
