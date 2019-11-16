package com.atguigu.java2;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTools3 {
	
		private static String driverClass=null;
		private static String jdbcUrl=null;
		private static String username=null;
		private static String password=null;
		
		private static Properties properties=new Properties();
		
		private static ThreadLocal<Connection> threadLocal =new ThreadLocal<>();
		
		static {
			try {
				InputStream is = JDBCTools3.class.getClassLoader().getResourceAsStream("info.properties");
				//加载外部配置文件
				properties.load(is);
				//设置属性
				driverClass=properties.getProperty("driverclass");
				jdbcUrl=properties.getProperty("url");
				username=properties.getProperty("username");
				password=properties.getProperty("password");
				//注册驱动
				Class.forName(driverClass);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 获取连接，确保当前线程只有一个连接
		public static Connection getConnection() throws SQLException {
			Connection connection = threadLocal.get();
			if (connection==null) {
				connection=DriverManager.getConnection(jdbcUrl, username, password);
			}
			return connection;
		}
		public static void closeConnection() throws SQLException {
			Connection connection = threadLocal.get();
			if (connection !=null && !connection.isClosed()) {
				connection.close();
			}
			threadLocal.set(null);
		}
	}
