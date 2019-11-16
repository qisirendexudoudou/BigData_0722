package com.atguigu.mvc;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.entity.User;
@Controller
public class UserController {
	@Autowired
	private UserService us;
	@Autowired
	private QueryRunner qr;

	public User getUserById() {
		
	//校验
		
	//查询
		User user = us.getUserById();
		System.out.println(qr);
		return user;
	//日志记录	
	}
}
