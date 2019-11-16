package com.atguigu.springmvc.handlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.entity.User;


/*
 * 1.  接受 请求，将数据转为json字符串，写给浏览器
 * 
 * 		SpringMVC对Jackson提供了友好支持。只需要导入jackson的jar包，json的转换将自动进行！
 * 
 * 2. @ResponseBody: 将方法的返回值作为响应体，响应给浏览器
 * 
 * 3. @RequestBody : 
 * 			只有post请求，才有请求体！
 */
@Controller
public class TestJsonHandler {
	
	// 
	@ResponseBody
	@RequestMapping(value = "/handle10",produces="text/html;charset=utf-8")
	public String handle10() {

		System.out.println("处理了handle10请求!");

		return "成功！";

	}
	
	@ResponseBody
	@RequestMapping(value = "/handle11")
	public User handle11() {

		System.out.println("处理了handle11请求!");

		return new User(1, "jack", "123");

	}
	
	@ResponseBody
	@RequestMapping(value = "/handle12")
	public String handle12(@RequestBody User user) {

		System.out.println("处理了handle11请求!"+user);

		return "success";

	}
	
	@ResponseBody
	@RequestMapping(value = "/handle13")
	public List<User> handle13() {

		System.out.println("处理了handle13请求!");
		
		User user1 = new User(1, "jack", "123");
		User user2 = new User(2, "jack1", "123");
		
		List<User> users=new ArrayList<>();
		
		users.add(user1);
		users.add(user2);

		return users;

	}

}
