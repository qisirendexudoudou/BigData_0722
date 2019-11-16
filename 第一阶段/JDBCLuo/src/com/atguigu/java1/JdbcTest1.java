package com.atguigu.java1;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class JdbcTest1 {
	
	/**
	 * 使用一般方法连接JDBC操作数据库
	 * @throws Exception
	 */
	//JDBC普通增删改操作
	@Test
	public void test1() throws Exception {
		//1.注册数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.获取Connection连接对象
		Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.210:3306/test", "luo", "000000");
		System.out.println(connection);
		//3.获取statement对象
		Statement statament = connection.createStatement();
		//4.执行sql语句
		String sql="update student set name = 'g' where id =5;";
		String sql2="delete from student where id =7;";
		String sql3="insert into student(id,name) values(5,'e')";
		statament.execute(sql);
		statament.execute(sql2);
		statament.execute(sql3);
		System.out.println(sql);
		System.out.println(sql2);
		System.out.println(sql3);
		//5.关闭资源
		connection.close();
		statament.close();
	}
	
	//JDBC普通查询操作
	@Test
	public void test2() throws Exception {
		//1.注册数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.获取Connection连接对象
		Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.210:3306/test", "luo", "000000");
		System.out.println(connection);
		//3.获取statement对象
		Statement statament = connection.createStatement();
		//4.执行sql语句
		String sql="select id,name from student;";
		ResultSet resultSet = statament.executeQuery(sql);
		//5.遍历数组
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			System.out.println("id= " + id + " name= " + name);
		}
		
		//6.关闭资源
		connection.close();
		statament.close();
		resultSet.close();
		
	}
}
