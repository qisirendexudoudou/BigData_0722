package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.entity.User;
import com.atguigu.mvc.UserController;

public class diTest {
	
	/*
	 * 容器中的对象是创建容器时创建；
	 *   
	 */
	
	@Test
	public void test2() throws Exception {
		ApplicationContext Context = new ClassPathXmlApplicationContext("di.xml");
		
		UserController controller = Context.getBean(UserController.class);
		
		System.out.println(controller.getUserById());

	}

}
