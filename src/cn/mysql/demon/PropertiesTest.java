package cn.mysql.demon;

import java.sql.Connection;

public class PropertiesTest {
    public static void main(String[] args) {
        Connection con = JDBCUtilsConfig.getConnection();
        System.out.println(con);
    }
}
