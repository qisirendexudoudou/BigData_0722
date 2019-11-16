package com.atguigu.java2;

import java.sql.Connection;

import org.junit.Test;

public class JDBCLuo {
	@Test
	public void test1() throws Exception {
		Connection conn = JDBCTools4.getConnection();
		System.out.println("--"+conn);
		
		
	}

}
