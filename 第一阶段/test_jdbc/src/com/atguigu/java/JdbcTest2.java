package com.atguigu.java;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

import org.junit.Test;

public class JdbcTest2 {

    @Test
    public void testGetConnection2() throws Exception {
        System.out.println(getDriverManager());
    }


    public Connection getDriverManager() throws Exception {
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

        //加载数据库驱动程序(注册驱动程序)
        Class.forName(driverClass);

        //通过DriverManager的 Connection（）方法获取数据库连接
        Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
        return connection;

    }
}
