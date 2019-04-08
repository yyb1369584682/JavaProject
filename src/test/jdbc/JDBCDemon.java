package test.jdbc;

import java.sql.*;

public class JDBCDemon {
	public static void main(String[] args) throws Exception{
		//1、注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2、获取连接
		String url = "jdbc:mysql://localhost:3306/gjp";
		String username = "root";
		String password = "yyb123.";
		Connection con = DriverManager.getConnection(url, username, password);
		//3、获取语句执行平台
		Statement state = con.createStatement();
		//4、拼写SQL语句
		String sql = "SELECT * FROM gjp_zhangwu";
		//5、执行SQL语句
		ResultSet result = state.executeQuery(sql);
		//6、处理返回结果
		while(result.next()){
			System.out.println(result.getInt("zwid")+"   "+result.getString("flname")
					+"   "+result.getString("money")+"   "+result.getString("zhanghu")
					+"   "+result.getString("createtime")+"   "+result.getString("description"));
		}
		//7、关闭资源
		con.close();
	}
}
