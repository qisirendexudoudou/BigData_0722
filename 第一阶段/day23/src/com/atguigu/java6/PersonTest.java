package com.atguigu.java6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

class Person{
	
	private String name;
	
	private void say(){
		System.out.println("say");
	}
	
	public void info(){
		System.out.println("info====" + name);
	}
}
public class PersonTest {

	/*
	 * 演示
	 */
	@Test
	public void test() throws Exception, Exception{
		
		Person p = new Person();
	
		
		Class clazz = Person.class;
		
		Field name = clazz.getDeclaredField("name");
		name.setAccessible(true);
		name.set(p, "小龙哥");
		p.info();
		
		
//		Method say = clazz.getDeclaredMethod("say");
//		
//		say.setAccessible(true);
//		
//		say.invoke(p);
	}
}
