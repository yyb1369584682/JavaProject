package cn.gjp.tools;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
实现数据库连接工具
实现连接池，dbcp连接池
 */
public class JDBCUtils {
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;
    private static String initialsize;
    private static String maxactive;
    private static String maxidle;
    private static String minidle;
    private static BasicDataSource dataSource = new BasicDataSource();


    static{
        try {
            readConfig();
            dataSource.setDriverClassName(driverClass);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            dataSource.setInitialSize(Integer.parseInt(initialsize));
            dataSource.setMaxActive(Integer.parseInt(maxactive));
            dataSource.setMaxIdle(Integer.parseInt(maxidle));
            dataSource.setMinIdle(Integer.parseInt(minidle));
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException("数据库连接失败");
        }
    }

    //读取配置文件
    private static void readConfig()throws IOException {
        InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("zwdatabase.properties");
        Properties pro = new Properties();
        pro.load(in);
        //读取键值对
        driverClass = pro.getProperty("driverClass");
        url = pro.getProperty("url");
        username = pro.getProperty("username");
        password = pro.getProperty("password");
        initialsize = pro.getProperty("initialsize");
        maxactive = pro.getProperty("maxactive");
        maxidle = pro.getProperty("maxidle");
        minidle = pro.getProperty("minidle");
    }

    public static DataSource getDataSource(){
        return dataSource;
    }

}
