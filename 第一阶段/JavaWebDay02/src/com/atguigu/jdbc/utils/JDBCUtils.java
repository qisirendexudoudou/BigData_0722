package com.atguigu.jdbc.utils;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;




/*
 * ThreadLocal: 在每个线程的本地保存数据.
 * 			为每个线程创建一个ThreadLocalMap，每个线程操作的是自己的ThreadLocalMap中的数据。
 * 			提供set(T)向Map中存放变量
 * 			提供get()获取之前保存的变量
 * 			提供remove()移除之前保存的变量
 * 
 *  原生方式获取Coonection
 * 		每个线程最多只能创建一个Connection
 * 		
 */
public class JDBCUtils {
	
	private static ThreadLocal<Connection> threadLocal;
	
	private static String username;
	private static String password;
	private static String jdbcUrl;
	private static String driverClass;
	
	private static Properties props;
	
	static {
		
		props=new Properties();
		
		try {
			props.load(JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		username = props.getProperty("username");
		password=props.getProperty("password");
		jdbcUrl=props.getProperty("url");
		driverClass=props.getProperty("driverClassName");
		
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		threadLocal=new ThreadLocal<>();

	}
	

	//获取Connection
	public static Connection getConn() throws SQLException {
		
		// 获取之前，先从ThreadLocal中尝试获取Conn
		Connection connection = threadLocal.get();
		
		if (connection==null) {
			
			connection= DriverManager.getConnection(jdbcUrl, username, password);
		}
		
		threadLocal.set(connection);
		
		return connection;
		
	}
	
	// 释放资源
	public static void  close(ResultSet rs,Statement s,Connection c) throws Exception {
		
		if (rs !=null) {
			rs.close();
		}
		
		if (s != null) {
			s.close();
		}
		
		if (c !=null) {
			
			c.close();
			
			threadLocal.remove();
			
		}

		
	}

}
