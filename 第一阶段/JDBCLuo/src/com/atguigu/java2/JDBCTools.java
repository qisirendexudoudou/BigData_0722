package com.atguigu.java2;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.atguigu.java1.JdbcTest3;

public class JDBCTools {
	private static DataSource dataSource;
 
	static {
		Properties properties = new Properties();
		try {
			properties.load(JDBCTools.class.getClassLoader().getResourceAsStream("info.properties"));
			dataSource = DruidDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    /**
     * 获取数据库连接的方法
     */
    public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
    	
        return dataSource.getConnection();
    }
    
    
    /**
     * 关闭数据库资源的方法
     */
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
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
