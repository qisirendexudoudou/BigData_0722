package com.atguigu.java2;

import java.io.IOException;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.alibaba.druid.util.JdbcUtils;

public class JdbcTest {
	//不使用批处理
	@Test//27997
	public void test() throws Exception, Exception, Exception{
		
		long start = System.currentTimeMillis();
		Connection conn = JDBCTools.getConnection();
		String sql = "insert into student(id,name) values(?,?);";
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		for (int i = 0; i < 50000; i++) {
			statement.setInt(1, i);
			statement.setString(2,"name"+i);
			statement.executeUpdate();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		JDBCTools.close(null, statement, conn);
				
		
	}
	
	//使用批处理
	@Test//990
	public void test2() throws Exception, Exception, Exception {
		long start = System.currentTimeMillis();
		Connection conn = JDBCTools.getConnection();
		System.out.println(conn);
		String sql = "insert into student(id,name) values(?,?)";
		
		PreparedStatement statement = conn.prepareStatement(sql);
		
		for (int i = 0; i < 50000; i++) {
			statement.setInt(1, i);
			statement.setString(2,"name"+i);
			statement.addBatch();
			
		}
		
		statement.executeBatch();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		JDBCTools.close(null, statement, conn);
		
	}

}
