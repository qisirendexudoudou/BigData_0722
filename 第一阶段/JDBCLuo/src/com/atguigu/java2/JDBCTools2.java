package com.atguigu.java2;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

//使用线程池 写工具类
public class JDBCTools2 {
	private static DataSource datasource;
	
	static {
		Properties properties = new Properties();
		try {
			properties.load(JDBCTools2.class.getClassLoader().getResourceAsStream("info.properties"));
			datasource = DruidDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//获取数据库连接方法
	public static Connection getconn() throws Exception {
		return datasource.getConnection() ;
	}

	//关闭数据库资源
	public static void close(ResultSet resultSet,Statement statement,Connection conn) {
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
		
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	

}
