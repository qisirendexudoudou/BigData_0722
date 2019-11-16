package com.atguigu.java;

import org.junit.Test;

/*
 	包装类 ： 针对八种基本数据类型定义相应的引用类型—包装类（封装类）

 */
public class WrapperTest {

	/**
	 * 基本数据类型 -> 包装类 : 通过对应的包装类的构造器
	 */
	@Test
	public void test(){
		int a = 10;
		//将基本数据类型转成包装类
		Integer num = new Integer(a);
		System.out.println(num.toString());
		
		double d = 12.3;
		Double num2 = new Double(d);
		System.out.println(num2.toString());
	}
	
	/**
	 * 包装类 -> 基本数据类型 : xxxValue() 
	 */
	@Test
	public void test2(){
		Boolean boo = new Boolean(true);
		//包装类 -> 基本数据类型 
		boolean booleanValue = boo.booleanValue();
		System.out.println(booleanValue);
		
		Integer integer = new Integer(12);
		int intValue = integer.intValue();
		System.out.println(intValue);
	}
	
	/**
	 * JDK1.5之后，支持自动装箱，自动拆箱
	 * 自动拆箱和装箱 
	 * 
	 * 拆箱 ： 将包装类的对象直接赋值给基本数据类型
	 * 装箱 ： 将基本数据类型直接赋值给包装类
	 */
	@Test
	public void test3(){
		//拆箱
		int num = new Integer(10);
		//装箱
		Integer num2 = 10;
	}
	
	/**
	 * String -> 基本数据类型，包装类
	 * String -> 包装类 : 通过包装类的构造器
	 * String -> 基本数据类型 : parseXxx()
	 */
	@Test
	public void test4(){
		String s = "12"; //注意字符串的内容是否可以转换
		//String -> 包装类
		Integer num = new Integer(s);
		System.out.println(num.toString());
		s = "aabctrue";
		Boolean num2 = new Boolean(s); //不会发生异常 - 结果为false
		System.out.println(num2.toString());
		
		System.out.println("-----------------------");
		// String -> 基本数据类型
		s = "10";
		int num3 = Integer.parseInt(s);
		System.out.println(num3);
		s = "true";
		boolean parseBoolean = Boolean.parseBoolean(s);
		System.out.println(parseBoolean);
		
	}
	
	/**
	 * 基本数据类型，包装类 -> String
	 * 
	 * 基本数据类型-> String : 1.字符串拼接   2.通过String.valueOf()方法 - 建议使用这种方式
	 * 包装类 -> String　：　toString();
	 */
	@Test
	public void test5(){
		//基本数据类型-> String
		int num = 15;
		//字符串拼接
		String s = num + "";
		//通过String.valueOf()方法 - 建议使用这种方式
		String s2 = String.valueOf(num);
		System.out.println(s2);
		
		//包装类 -> String
		Integer integer = new Integer(10);
		String s3 = integer.toString();
		System.out.println(s3);
	}
}















