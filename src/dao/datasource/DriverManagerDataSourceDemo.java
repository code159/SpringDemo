package dao.datasource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

//DriverManagerDataSource Spring提供的简单数据源实现类，不提供池化连接机制，每次调用getConnection()时只简单创建一个新连接
public class DriverManagerDataSourceDemo {

	public static void main(String[] args) {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test2");
		ds.setUsername("root");
		ds.setPassword("root");
		
		Connection conn;
		try {
			conn = ds.getConnection();
			DatabaseMetaData dbmd=conn.getMetaData();
			System.out.println("是否支持事务："+dbmd.supportsTransactions());
			System.out.println("默认事务隔离级别："+dbmd.getDefaultTransactionIsolation());
			
			//设置事务
			conn.setAutoCommit(false);
			conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			Statement stmt=conn.createStatement();
			
			int rows=stmt.executeUpdate("insert into t1 values(1,'li')");
			rows=stmt.executeUpdate("update t1 set name='liyubin' where id=1");
			conn.commit();
		} catch (SQLException e) {
			
		}
		
		
	}

}
