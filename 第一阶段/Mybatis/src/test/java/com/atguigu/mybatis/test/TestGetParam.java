package com.atguigu.mybatis.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.atguigu.entity.Employee;
import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.mapper.EmployeeMapper2;



public class TestGetParam {
	
	private SqlSessionFactory sqlSessionFactory;
	
	// 会在所有的@Test方法之前执行
	@Before
	public void init() throws Exception {
		
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}

	@Test
	public void test1() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper2 employeeMapper = sqlSession.getMapper(EmployeeMapper2.class);
			
			Employee employee = employeeMapper.getEmployeeById1("jack", 2);
			
			System.out.println(employee);

		} finally {

			sqlSession.close();

		}

	}
	
	@Test
	public void test2() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper2 employeeMapper = sqlSession.getMapper(EmployeeMapper2.class);
			
			Employee employee2 = new Employee(1, null, null, null);
			
			Employee employee3 = new Employee(2, null, null, null);
			
			Employee employee = employeeMapper.getEmployeeById2(employee2,employee3);
			
			System.out.println(employee);

		} finally {

			sqlSession.close();

		}

	}
	
	@Test
	public void test3() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper2 employeeMapper = sqlSession.getMapper(EmployeeMapper2.class);
			
			Map<String, Object> map=new HashMap<>();
			
			Employee employee3 = new Employee(2, null, null, null);
			
			map.put("a", 1);
			map.put("b", 2);
			
			Employee employee = employeeMapper.getEmployeeById3(employee3,map);
			
			System.out.println(employee);

		} finally {

			sqlSession.close();

		}

	}
	
	@Test
	public void test4() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper2 employeeMapper = sqlSession.getMapper(EmployeeMapper2.class);
			
			Object [] o=new Object[] {1,2,3};
			
			
			
			Employee employee = employeeMapper.getEmployeeById5(o);
			
			System.out.println(employee);

		} finally {

			sqlSession.close();

		}

	}
	
	@Test
	public void test5() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper2 employeeMapper = sqlSession.getMapper(EmployeeMapper2.class);
			
			Object [] o=new Object[] {1,2,3};
			
			List<Object> list = Arrays.asList(o);
			
			
			
			Employee employee = employeeMapper.getEmployeeById4(list);
			
			System.out.println(employee);

		} finally {

			sqlSession.close();

		}

	}

}
