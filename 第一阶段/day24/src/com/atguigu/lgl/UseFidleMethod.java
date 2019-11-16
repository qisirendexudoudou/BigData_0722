package com.atguigu.lgl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class UseFidleMethod {

	
	//获取指定的属性
	@Test
	public void test() throws Exception, Exception{
		
		SubClass sc = new SubClass();
		
		//获取Class对象
		Class clazz = SubClass.class;
		//获取指定的属性--任何权限修饰符的属性
		Field declaredField = clazz.getDeclaredField("subscorePrivate");
		Field declaredField2 = clazz.getDeclaredField("subdesPublic");
		//授权
		declaredField.setAccessible(true);
//		declaredField2.setAccessible(true);
		//给属性赋值
		/*
		 * setInt(Object obj, int i)
		 * 第一个参数 ： 给哪个对象的该属性赋值
		 * 第二个参数 ： 给属性赋的内容
		 */
		declaredField.setInt(sc, 12);
		declaredField2.set(sc, "good");
		//读取属性的值
		System.out.println(sc.getSubScorePrivate());
		System.out.println(sc.subdesPublic);
	}
	
	//获取指定的方法
	@Test
	public void test2() throws Exception, Exception{
		SubClass sc = new  SubClass();
		//获取Class对象
		Class clazz = SubClass.class;
		//获取指定的方法
		Method declaredMethod = clazz.getDeclaredMethod("info2");
		//授权
		declaredMethod.setAccessible(true);
		//调用方法
		declaredMethod.invoke(sc);
	}
}
