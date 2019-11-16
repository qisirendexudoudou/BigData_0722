package com.atguigu.java1;

import static org.junit.Assert.*;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

public class JdbcTest2 {
	
	/**
	 * 使用线程池连接JDBC操作数据库
	 * @throws Exception
	 */
	//使用线程池 增删改操作
	@Test
	public void test1() throws Exception {
		//1.创建DruidDataSource（）对象
		DruidDataSource ds = new DruidDataSource();
		
		//2.DruidDataSource（）对象的setXXX方法需要的配置 
		//2.1  核心参数--连接数据库所需要的配置信息
		ds.setUrl("jdbc:mysql://192.168.0.210:3306/test");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUsername("luo");
		ds.setPassword("000000");
		//2.2连接池参数
		ds.setInitialSize(10);
		ds.setMaxActive(20);
		ds.setMinIdle(1);
		ds.setMaxWait(10000);
		ds.setTimeBetweenLogStatsMillis(60000);
		ds.setPoolPreparedStatements(true);
		
		//3.获取Connection连接对象
		Connection conn = ds.getConnection();
		
		//4.获取statement对象
		Statement statement = conn.createStatement();
		
		//5.执行SQL语句
		String sql = "delete from  student where id = 5 ;";
		statement.execute(sql);
		System.out.println(sql);
		
		//6.关闭资源
		conn.close();
		statement.close();		
	}
	
	//使用线程池查询操作
	@Test
	public void test2() throws Exception {
		//1.创建DruidDataSource（）对象
		DruidDataSource ds = new DruidDataSource();
		
		//2.DruidDataSource（）对象的setXXX方法需要的配置 
		//2.1  核心参数--连接数据库所需要的配置信息
		ds.setUrl("jdbc:mysql://192.168.0.210:3306/test");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUsername("luo");
		ds.setPassword("000000");
		//2.2连接池参数
		ds.setInitialSize(10);
		ds.setMaxActive(20);
		ds.setMinIdle(1);
		ds.setMaxWait(10000);
		ds.setTimeBetweenLogStatsMillis(60000);
		ds.setPoolPreparedStatements(true);
		
		//3.获取Connection连接对象
		Connection conn = ds.getConnection();
		
		//4.获取statement对象
		Statement statement = conn.createStatement();
		
		//5.执行SQL语句
		String sql = "select id,name from  student where id = ?;";
		ResultSet resultSet = statement.executeQuery(sql);
		System.out.println(sql);
		//5.1遍历结果集信息
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			System.out.println("id= " + id + " name= " + name);
		}
		
		//6.关闭资源
		conn.close();
		statement.close();
		resultSet.close();
	}
	
	//使用线程池查询操作 --prepareStatement
	@Test
	public void test33() throws Exception{
		test3(3);
	}
	
	public void test3(Integer id) throws Exception {
		//1.创建DruidDataSource（）对象
		DruidDataSource ds = new DruidDataSource();
		
		//2.DruidDataSource（）对象的setXXX方法需要的配置 
		//2.1  核心参数--连接数据库所需要的配置信息
		ds.setUrl("jdbc:mysql://192.168.0.210:3306/test");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUsername("luo");
		ds.setPassword("000000");
		//2.2连接池参数
		ds.setInitialSize(10);
		ds.setMaxActive(20);
		ds.setMinIdle(1);
		ds.setMaxWait(10000);
		ds.setTimeBetweenLogStatsMillis(60000);
		ds.setPoolPreparedStatements(true);
		
		//3.获取Connection连接对象
		Connection conn = ds.getConnection();
		
		//4.使用占位符定义查询的sql语句
		String sql = "select id,name from  student where id=?";
		
		//5.获取statement对象 ,预编译
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, id);
		System.out.println(statement);
		System.out.println("-----");
		
		//6.执行sql语句
		ResultSet resultSet = statement.executeQuery();
		//6.1遍历结果集信息
		while (resultSet.next()) {
			Integer idStr = resultSet.getInt(1);
			String name = resultSet.getString(2);
			System.out.println("id= " + idStr + " name= " + name);
		}
		
		//6.关闭资源
		conn.close();
		statement.close();
		resultSet.close();
	}
	
	
}
