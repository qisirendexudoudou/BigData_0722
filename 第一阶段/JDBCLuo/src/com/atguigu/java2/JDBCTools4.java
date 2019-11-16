package com.atguigu.java2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTools4 {

	private static String username=null;
	private static String password=null;
	private static String driverclass=null;
	private static String url=null;
	
	private static Properties properties=new Properties();
	private static ThreadLocal<Connection> threadlocal=new ThreadLocal<>();
	
	static {
		try {
			//1.配置文件相关
			properties.load(JDBCTools4.class.getClassLoader().getResourceAsStream("info.properties"));	
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			url = properties.getProperty("url");
			driverclass = properties.getProperty("driverClassName");
			System.out.println(username);
			System.out.println(password);
			System.out.println(url);
			System.out.println(driverclass);
			
			//2.注册驱动
			Class.forName(driverclass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//获取数据库连接方法
	public static Connection getConnection() throws Exception {
		//确保只有一个线程连接
		Connection connection = threadlocal.get();
		if (connection == null) {
			connection = DriverManager.getConnection(url, username, password);
		}
		return connection;
	}
	
	//关闭数据库资源
	public static void  close(ResultSet resultSet,Statement statement,Connection connection) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (statement != null) {
			try {
				statement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
