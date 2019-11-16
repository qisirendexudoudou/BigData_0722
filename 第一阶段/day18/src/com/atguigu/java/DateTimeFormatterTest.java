package com.atguigu.java;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

import org.junit.Test;

/**
 * 
 *	了解
 *
 */
public class DateTimeFormatterTest {
	
	@Test
	public void test2(){
		Date date = new Date();
		System.out.println(date);
		
		
	}

	@Test
	public void test(){
//		预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
		DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		//format()将时间转成字符串
		System.out.println(dtf.format(LocalDateTime.now()));
		
//		本地化相关的格式。如：ofLocalizedDateTime(FormatStyle.LONG)
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(dtf2.format(LocalDateTime.now()));
		
		
//		自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		System.out.println(dtf3.format(LocalDateTime.now()));
		//将字符串解析成时间
		TemporalAccessor parse = dtf.parse("2019-08-17T09:41:44.872");
		System.out.println(parse);
		
	}
}
