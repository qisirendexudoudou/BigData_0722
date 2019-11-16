package com.atguigu.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao ud;
	
	public User getUserById() {
		
		// 在查询前执行xxxxx
		
		User user = ud.getUserById();
		
		// 在查询后执行xxxxx
		
		return user;
	}
	
}
