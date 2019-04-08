package test.jdbc.JDBCUtilsDemon;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtils {
	static String  driverClass;
	static String url;
	static String username;
	static String password;
	static Connection connection;
	static{
		try {
			getConfig();
			//注册Mysql驱动
			Class.forName(driverClass);
			//获取连接
			 connection = DriverManager.getConnection(url, username, password);
		}catch (Exception ex){
			throw new RuntimeException("数据库连接失败");
		}
	}


	public static void getConfig()throws IOException {
		//创建输入流
		InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("database.properties");
		//创建Properties
		Properties pro = new Properties();
		//加载输入流中的数据
		pro.load(in);
		driverClass = pro.getProperty("driverClass");
		url = pro.getProperty("url");
		username = pro.getProperty("username");
		password = pro.getProperty("password");

	}
	public static Connection getConnection(){return connection;}


}
