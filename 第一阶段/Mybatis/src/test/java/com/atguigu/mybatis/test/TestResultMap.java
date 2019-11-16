package com.atguigu.mybatis.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.atguigu.entity.Department;
import com.atguigu.entity.Employee;
import com.atguigu.entity.Employee2;
import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.mapper.TestResultMapMapper;



public class TestResultMap {
	
	private SqlSessionFactory sqlSessionFactory;
	
	// 会在所有的@Test方法之前执行
	@Before
	public void init() throws Exception {
		
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}

	/*@Test
	public void test1() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			TestResultMapMapper employeeMapper = sqlSession.getMapper(TestResultMapMapper.class);
			
			Employee2 e = employeeMapper.getEmployeeById(1);
			
			System.out.println(e);

		} finally {

			sqlSession.close();

		}

	}*/
	
	@Test
	public void test2() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			TestResultMapMapper employeeMapper = sqlSession.getMapper(TestResultMapMapper.class);
			
			Employee e = employeeMapper.getEmployeeById(1);
			
			System.out.println(e);
			System.out.println(e.getDept());

		} finally {

			sqlSession.close();

		}

	}
	
	@Test
	public void test3() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			TestResultMapMapper employeeMapper = sqlSession.getMapper(TestResultMapMapper.class);
			
			Department department = employeeMapper.getDepartmentById(1);
			
			System.out.println(department);
			//System.out.println(e.getDept());

		} finally {

			sqlSession.close();

		}

	}

}
