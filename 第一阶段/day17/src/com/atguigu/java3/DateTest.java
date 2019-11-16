package com.atguigu.java3;


import java.sql.Date;

import org.junit.Test;
/**

	|-----java.util.Date(掌握)
	
		两个构造器：
			new Date(); 获取当前时间
			new Date(long date);获取毫秒数所对应的时间
		两个方法：
			toString() : 输出时间
			getTime() : 获取时间所对应的毫秒数
	
	|-----java.sql.Date（了解）
		构造器：
			new Date(long date); 获取毫秒数对应的日期
		两个方法：
			toString() : 输出日期
			getTime() :获取日期所对应的毫秒数
	
 */
public class DateTest {
	
	//需求：获取当前的日期
	@Test
	public void test3(){
		java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
		System.out.println(date);
		
		//下面的写法不对，因为不是多态不能向下转型
//		java.util.Date d = new java.util.Date();
//		java.sql.Date da = (java.sql.Date) d;
	}
	
	
	@Test
	public void test2(){
		java.sql.Date date = new java.sql.Date(1565940426182L);
		System.out.println(date.toString());//2019-08-16
		System.out.println(date.getTime());//1565940426182
	}

	
	@Test
	public void test(){
		
		//获取当前时间
		java.util.Date date = new java.util.Date();
		System.out.println(date.getTime());//1565940426182
		System.out.println(date.toString());//Fri Aug 16 15:27:06 CST 2019
		
		//获取毫秒数所对应的时间
		java.util.Date date2 = new java.util.Date(1565940426182L);
		System.out.println(date2.toString());//Fri Aug 16 15:27:06 CST 2019

		
	}
}
