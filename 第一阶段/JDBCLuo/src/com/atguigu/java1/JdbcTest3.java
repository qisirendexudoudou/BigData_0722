package com.atguigu.java1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;


import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JdbcTest3 {
	
	
	@Test
	public void JDBCTools() throws Exception {
		//1.创建properties对象
		Properties properties = new Properties();
		
		//2.读取类路径下的jdbc.properties 配置文件
		properties.load(JdbcTest3.class.getClassLoader().getResourceAsStream("info.properties"));
		DataSource ds = DruidDataSourceFactory.createDataSource(properties);

/*		File file = new File("G:\\workspace\\info\\info.properties");
		FileInputStream fs = new FileInputStream(file);
		properties.load(fs);
		DataSource ds = DruidDataSourceFactory.createDataSource(properties);*/
		
		//3.获取Connection连接对象
		Connection conn = ds.getConnection();
		System.out.println(conn+"---");
		
		//4.获取statement对象
		Statement statement = conn.createStatement();
		
		//5.执行SQL语句
		String sql = "delete from  student where id = 2 ;";
		statement.execute(sql);
		System.out.println(statement);
		
		//6.关闭资源
		conn.close();
		statement.close();	

	}

}
