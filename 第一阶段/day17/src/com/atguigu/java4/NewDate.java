package com.atguigu.java4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import org.junit.Test;

public class NewDate {
	/*
	 * 本地日期 ：
	 * 本地时间：
	 * 本地日期时间：
	 */
	@Test
	public void test2(){
		/*
		 * now() 获取当前类的对象
		 */
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);
		
		//静态方法，根据指定日期/时间创建对象
		LocalDate of = LocalDate.of(2010, 8, 3);
		System.out.println(of);
		
		//获取当天是当月的第几天
		int day = localDate.getDayOfMonth();
		System.out.println(day);
		//获取当前日期所对应的年份
		System.out.println(localDate.getYear());
		
		System.out.println("---------------------------");
		
		//将月份天数、年份天数、月份、年份修改为指定的值并返回新的对象
		LocalDate withDayOfMonth = localDate.withDayOfMonth(20);
		System.out.println(withDayOfMonth);
		//原对象并没有发生修改
		System.out.println(localDate);
		
		System.out.println(localDate.plusDays(2));
		System.out.println(localDate.minusDays(2));
	}

	/*
	 * 偏移性：Date中的年份是从1900开始的，而月份都从0开始。
	 */
	@Test
	public void test(){
		//创建一个2010-3-5的Date对象
//		Date d = new Date(2010, 3, 5);
//		System.out.println(d);
	}
}
