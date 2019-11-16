package com.atguigu.dao;

import java.sql.SQLException;
import java.util.List;

import com.atguigu.entity.Employee;
import com.atguigu.entity.User;

/*
 * Dao：   Database access object :  访问数据库对象。
 * 			之前使用sql语句，执行crud。
 * 				步骤：  写sql，获取Connection,执行sql
 * 			提供一个对象，调用对象方法，完成CRUD。
 * 				对象的方法中，进一步封装了SQL。不将SQL直接暴露给用户。
 * 				只将封装后的方法暴露给用户。可维护性更强。
 * 
 * Dao为了维护性：  先定义Dao接口-----提供一个Dao接口的实现类(针对不同的数据库环境，可以提供不同的实现类)
 * 			UserDao接口 ------对user表进行增删该查
 * 				提供UserDaoImpl------》查询mysql下user表。
 * 				将来，数据库架构发生了变化  由mysql迁移到postgresql
 * 					只需要再实现UserDao接口，提供一个postgresql数据库的实现类即可。
 */
public interface UserDao {
	
	// 根据用户名和密码查询User对象
	User getUserByUserNameAndPassword(String username,String password) throws Exception;
	
	boolean validUsernameExist(String username) throws Exception;
	
	List<Employee> getAllEmps() throws Exception;
	

}
