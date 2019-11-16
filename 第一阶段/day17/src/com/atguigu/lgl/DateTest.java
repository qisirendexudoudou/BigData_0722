package com.atguigu.lgl;

import java.util.Date;

import org.junit.Test;

public class DateTest {
	
	@Test
	public void test2(){
		java.sql.Date date = new java.sql.Date(1565968642295L);
		System.out.println(date.toString());
		System.out.println(date.getTime());
		
		//获取当前日期
		java.sql.Date date2 = new java.sql.Date(new java.util.Date().getTime());
		System.out.println(date2);
		
	}

	@Test
	public void test(){
		//获取当前时间
		java.util.Date date = new java.util.Date();
		System.out.println(date.getTime());//秒差   1565968642295
		System.out.println(date.toString());//Fri Aug 16 23:17:22 IRKT 2019
		
		//获取毫秒数所对应的的时间
		Date date2 = new java.util.Date( 1565968642295L);
		System.out.println(date2.toString());
		
	}
}
