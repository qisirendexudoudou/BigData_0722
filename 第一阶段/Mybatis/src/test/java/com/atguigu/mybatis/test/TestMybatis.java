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

import com.atguigu.entity.Employee;
import com.atguigu.mapper.EmployeeMapper;


/*
 * 1.目前写法的弊端：
 * 		①无法对参数进行严格的检查
 * 		②返回的也是Object，还需要手动强转
 * 		③不符合MVC开发的规范
 * 				Model层:      Dao接口-----DaoImpl----POJO
 * 
 * 2.Mybatis也提供了复合MVC开发规范的接口式编程
 * 		名词：   xxxDao  -----> XXXMapper
 * 		     xxxMapper.xml 对应是XXXMapper中要使用的sql语句！
 * 
 * 		使用Mybatis的接口式编程，只需要声明接口，编写接口中使用的sql的配置文件。实现类，mybatis会自动使用
 * 		代理技术为自动创建实现类！
 * 
 * 3. 要求
 * 		① xxxMapper.xml 和 XXXMapper.java 名称要对应
 * 		②xxxMapper.xml的namespace和接口全类名一致
 * 		③ xxxMapper.xml的每条sql语句的id要和接口方法名一致
 * 
 * 4. SqlSession的细节：
 * 		SqlSession不是线程安全的，不能共享。作用域必须为一次请求或方法！
 * 		SqlSession使用完后，需要及时关闭！
 * 
 * 5. 事务
 * 		查询不需要事务；
 * 		增删改需要提交事务！
 * 			①sqlSession.commit();
 * 			②自动提交 : SqlSession sqlSession = sqlSessionFactory.openSession(true);
 * 			
 * 		
 */
public class TestMybatis {
	
	private SqlSessionFactory sqlSessionFactory;
	
	// 会在所有的@Test方法之前执行
	@Before
	public void init() throws Exception {
		
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}

	@Test
	public void testGetSqlSessionFactory() throws IOException {
		
		// mybatis全局配置文件
		
		// 需要一个sqlsession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// 查询单个对象
		//statement： 执行的sql的唯一标识=namespace.id
		// parameter：sql中传递的参数
		Employee e = sqlSession.selectOne("sql.selectEmp", 1);
		
		System.out.println(e);
		
	}
	
	@Test
	public void test1() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
			
			System.out.println(employeeMapper.getClass().getName());
			
			Employee employee = employeeMapper.getEmployeeById(1);
			
			System.out.println(employee);
		} finally {
			
			sqlSession.close();
			
		}
		
		
	}
	
	@Test
	public void testInsert() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

			Employee employee = new Employee(null, "jack1", "male", "jack@163.com");
			
			boolean rows = employeeMapper.insertEmployee(employee);
			
			System.out.println(rows);
			
			System.out.println(employee.getId());
			
//			sqlSession.commit();
			
		} finally {

			sqlSession.close();

		}

	}
	
	@Test
	public void testUpdate() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

			Employee employee = employeeMapper.getEmployeeById(7);
			
			employee.setLastName("mike");
			
			employeeMapper.updateEmployee(employee);
		} finally {

			sqlSession.close();

		}

	}
	
	@Test
	public void testDelete() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

			employeeMapper.deleteEmployeeById(7);
		} finally {

			sqlSession.close();

		}

	}
	
	@Test
	public void testGetAll() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
			
			List<Employee> emps = employeeMapper.getEmps();
			
			System.out.println(emps);

		} finally {

			sqlSession.close();

		}

	}
	
	@Test
	public void testGetAllEmpsWithMap() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
			
			Map<String, Object> map = employeeMapper.getEmpsWithMap(1);
			
			//{gender=male, last_name=Tom, id=1, email=Tom@163.com}
			System.out.println(map);

		} finally {

			sqlSession.close();

		}

	}
	
	@Test
	public void testGetAllEmpsWithMap2() throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 调用接口的实现类来执行接口中的方法
		try {
			EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
			
			Map<String, Employee> map = employeeMapper.getEmpsWithMap2(2);
			
			//{gender=male, last_name=Tom, id=1, email=Tom@163.com}
			System.out.println(map);

		} finally {

			sqlSession.close();

		}

	}

}
