package com.atguigu.dao;

import java.sql.SQLException;
import java.util.List;

/**
 * 
 * Dao:访问数据库对象
 *
 */
public interface UserDao {
	
	//根据用户名和密码来查询user对象
	User getUser(String username,String password) throws Exception;
	
	boolean validusernameExist(String username) throws Exception, Exception, Exception;
	
	List<Employee> getAllemps() throws Exception, Exception, Exception;

}
 