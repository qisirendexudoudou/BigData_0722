package com.atguigu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.entity.User;

public class TestSpring {
	
	/*
	 * 1. 容器中的对象 是什么时候创建的？
	 * 			对象是随着容器的创建而创建！一个<bean>只会创建一个对象。默认是单例模式！
	 * 
	 * 2. getBean(): 从容器中取出对象
	 * 		getBean(String id):  取出后，需要手动进行类型转换
	 *		 getBean(Class T):  取出后，无需进行类型转换
	 *				前提： 保证容器中只有唯一此类型的对象
	 * 
	 * 		getBean(String id,Class T):  
	 * 3. 常见错误：
	 * 		NoSuchBeanDefinitionException: No bean named 'user' is defined  ： 容器中没有指定id的对象
	 * 		NoUniqueBeanDefinitionException: No qualifying bean of type [com.atguigu.entity.User] is defined: 
	 *       expected single matching bean but found 2: user1,user2
	 *       		使用类型从容器中取出对象时，发生了歧义（容器中有多个此类型）
	 *       
	 * 4. 为对象赋值
	 * 		常用：使用<property>标签赋值
	 * 		赋值的类型：
	 * 				字面量：  从字面上就知道数据是什么样的！
	 * 						 8种基本数据类型及其包装类+String
	 * 						在<property>标签中，使用value属性或<value>赋值
	 * 				自定义的引用数据类型：	
	 * 						在<property>标签中，使用ref属性或<ref>赋值
	 * 
	 * 				null：<null>
	 * 
	 *				
	 * 
	 * 
	 * 
	 * 			
	 */

	@Test
	public void test() {
		
		//  先获取指定的容器
		ApplicationContext context=new ClassPathXmlApplicationContext("helloworld.xml");
		
		// 从容器中获取想要的对象
		User bean = (User) context.getBean("user1");
		
		//User user = context.getBean(User.class);
		
		User user = context.getBean("user1", User.class);
		
		//System.out.println(user.getPassword()==null);
		
		System.out.println(user);
		
		
	}

}
