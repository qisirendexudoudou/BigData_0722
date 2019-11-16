package com.atguigu;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.entity.Phone;
import com.atguigu.entity.User;


/*
 *    				@ResponseBody:将方法的返回值 作为响应体，返回给浏览器 
 *    				@RequestBody:
 */

@Controller
public class jsonControllerTest {

	@ResponseBody
	@RequestMapping(value = "/handle8",produces="text/html;charset=utf-8")
	public String handle8() {
		System.out.println("处理了hello8请求！");
		//转到ok页面
		return "这是JSON字符串";
//		return "handleok";
	}
	
	@ResponseBody
	@RequestMapping(value = "/handle9")
	public User handle9() {
		System.out.println("处理了hello9请求！");
		return new User(1, "小许", "000000",new Phone("huawei", "20Pro"));

	}
	
	@ResponseBody
	@RequestMapping(value = "/handle10")
	public String handle10(@RequestBody User user) {
		System.out.println("处理了hello10请求！");
		System.out.println("user=" +user );
		return "haha";

	}
	
	//前台JSON字符串转到后台java
	@ResponseBody
	@RequestMapping(value = "/handle12")
	public String handle12(@RequestBody User user) {

		System.out.println("处理了handle11请求!"+user);

		return "success";

	}
	
	//后台java对象转换到前台json字符串
	@ResponseBody
	@RequestMapping(value = "/handle13")
	public List<User> handle12() {

		System.out.println("处理了handle13请求!");
		User user1 = new User(1, "xaioxu", "123");
		User user2 = new User(2, "xaioxiaoxu", "456");
		List<User> users = new ArrayList<>();
		
		users.add(user1);
		users.add(user2);
		
		return users;

	}
	
}
