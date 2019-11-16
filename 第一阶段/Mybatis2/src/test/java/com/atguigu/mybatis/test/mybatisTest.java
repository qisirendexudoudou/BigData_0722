package com.atguigu.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.atguigu.entity.Employee;
import com.atguigu.mapper.EmployeeMapper;

public class mybatisTest {
	
	@Test
	public void testGetssf() throws Exception {
		
		//从 XML 中构建 SqlSessionFactory
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession openSession = sqlSessionFactory.openSession();
		
		Employee e = openSession.selectOne("sql.2.1", 1);
		
		System.out.println(e);
		
	}
	

}
