package test.jdbc.JDBCUtilsDemon;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.Connection;
import java.util.List;

public class Test {
	public static void main(String[] args) throws Exception {
		//获取连接
		Connection con = JDBCUtils.getConnection();
		QueryRunner qr = new QueryRunner();
		//拼写SQL语句
		String sql = "SELECT * FROM gjp_zhangwu";
		//执行SQL语句
		List<Object[]> list = qr.query(con, sql, new ArrayListHandler());
		//处理返回结果
		for (Object[] objects : list) {
			for (Object object : objects) {
				System.out.print(object+"    ");
			}
			System.out.println();
		}
		//关闭资源
		con.close();
	}
}
