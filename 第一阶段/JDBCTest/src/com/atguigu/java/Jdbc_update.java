package com.atguigu.java;

import java.io.InputStream;
import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import org.junit.Test;


public class Jdbc_update {

    @Test
    public void testStatement() throws Exception {
        //1.获取数据库连接
        Connection connection = getDriverManager();
        //3.sql语句
        String sql = "delete from  student where id = 2;";

        //4.执行插入
        //4.1 获取操作sql语句的statement对象
        Statement statement = (Statement) connection.createStatement();
        //4.2调用statement对象的executeUpdate（sql）执行sql语句进行插入
        statement.execute(sql);
        //5.关闭statement对象
        statement.close();

        //2.关闭数据库连接
        connection.close();

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
    
    @Test
    public void test3() throws Exception{
    	System.out.println(getDriverManager());
    }
}
