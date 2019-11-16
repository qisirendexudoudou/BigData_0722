package com.atguigu.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.entity.User;
@Service
public class UserService {
	@Autowired
	private UserDao ud;
	
	public User getUserById() {
		
	//校验
		
	//查询
		User user = ud.getUserById();
		return user;
	//日志记录	
	}

}
