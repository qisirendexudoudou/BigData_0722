package com.atguigu.lgl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import org.junit.Test;

/**
	LocalDate:
	LocalTime:
	LocalDateTime:
 */
public class NewDate {
	
	@Test
	public void test3(){
		LocalDate of = LocalDate.of(2019, 8, 17);
		System.out.println(of);
	}
	
	@Test
	public void test2(){
		//now():获取当前类的对象
		LocalDate localdate = LocalDate.now();
		LocalTime localtime = LocalTime.now();
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdate);
		System.out.println(localtime);
		System.out.println(localdatetime);
		
	}
	
	

	@SuppressWarnings("deprecation")
	@Test
	public void test(){
		Date date = new Date(2019, 8, 16);
		System.out.println(date);
	}
}
