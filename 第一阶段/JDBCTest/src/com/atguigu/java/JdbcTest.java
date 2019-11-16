package com.atguigu.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

public class JdbcTest {
	
/*	@Test
	public void JDBCTest() throws Exception{
		Driver driver = new com.mysql.jdbc.Driver();
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		Properties info = new Properties();
		
		info.put("user", "root");
		info.put("password", "root");
		Connection connect = driver.connect(url, info);
		
		System.out.println(connect);
		
	} */


    public Connection getConnection() throws Exception {
        String driverClass = null;
        String jdbcUrl = null;
        String user = null;
        String password = null;

        //读取类路径下的jdbc.properties 配置文件
        InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();

        properties.load(in);
        driverClass = properties.getProperty("driver");
        jdbcUrl = properties.getProperty("jdbcUrl");
        user = properties.getProperty("user");
        password = properties.getProperty("password");

        //通过反射创建Driver对象
        Driver driver = (Driver) Class.forName(driverClass).newInstance();
        Properties info = new Properties();
        info.put("user", user);
        info.put("password", password);

        //通过Driver的 Connect（）方法获取数据库连接
        Connection connection = driver.connect(jdbcUrl, info);
        return connection;

    }

    @Test
    public void testGetConnection() throws Exception {
        System.out.println(getConnection());
    }

}
