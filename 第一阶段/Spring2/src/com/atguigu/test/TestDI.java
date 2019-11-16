package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.entity.User;
import com.atguigu.mvc.UserController;

public class TestDI {
	
	
	@Test
	public void test() {
		
		//  先获取指定的容器
		ApplicationContext context=new ClassPathXmlApplicationContext("di.xml");
		
	
		UserController controller = context.getBean(UserController.class);
		
		System.out.println(controller.getUserById());
		
		
	}

}
