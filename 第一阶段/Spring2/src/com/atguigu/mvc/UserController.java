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
		
		// 在查询前执行xxxxx，接受请求参数，验证参数
		
		User user = us.getUserById();
		
		System.out.println(qr);
		
		// 在查询后执行xxxxx，记录
		
		return user;
	}
	

}
