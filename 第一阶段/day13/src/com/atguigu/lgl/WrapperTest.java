package com.atguigu.lgl;

import org.junit.Test;

public class WrapperTest {
	
	/**
	 *基本数据类型 --> 包装类 ：通过对应的包装类的构造器
	 */
	@Test
	public void test1(){
		int a = 11;
		Integer integer = new Integer(a);
		System.out.println(integer);
		}
	
	/**
	 * 包装类 --> 基本数据类型： xxxValue()方法
	 */
	@Test
	public void test2(){
		Integer integer = new Integer(12);
		int intValue = integer.intValue();
		System.out.println(intValue);
		
		Double double1 = new Double(12.2);
		double doubleValue = double1.doubleValue();
		System.out.println(doubleValue);
	}
	
	/**
	 * 自动装箱和自动拆箱
	 * 自动拆箱：将包装类的对象直接赋值给基本数据类型
	 * 自动装箱：将基本数据类型直接赋值给包装类
	 */
	@Test
	public void test3(){
		//拆箱
		int num1 = new Integer(13);
		System.out.println(num1);
		
		//装箱
		Integer num2 = 133;
		System.out.println(num2);
	}
	
	/**
	 * String -->基本数据类型 :parseXxx()
	 * 
	 * String -->包装类:通过包装类的构造器
	 */
	@Test
	public void test4(){
		//String --> 基本数据类型
		String s ="14";
		int num4 = Integer.parseInt(s);
		System.out.println(num4 +1);
		
		//String --> 包装类
		String s2 = "aa";
		Boolean boolean1 = new Boolean(s2);
		System.out.println(boolean1);
	}
	
	/**
	 * 基本类型 --> String String.valueOf()方法 
	 * 包装类 --> String toString()方法
	 */
	@Test
	 public void test5(){
		 int a = 5;
		  String valueOf = String.valueOf(a);
		  System.out.println(valueOf);
		  
		Integer integer = new Integer(10);
		String  num6 = integer.toString();
		System.out.println(num6);
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

