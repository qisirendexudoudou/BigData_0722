package com.atguigu.java3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/*
 	格式化时间和日期：（熟悉）
 	
 	java.text :该包下所有的类都是关于国际化的类
 	
 */
public class SimpleDateFormatTest {

	@Test
	public void test() throws ParseException{
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		//将时间转成字符串
		String time = sdf.format(date);
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-'W'ww-u");
		//将时间转成字符串
		String time2 = sdf2.format(date);//2019-W33-5
		
		
		// 
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//将时间转成字符串
		String time3 = sdf3.format(date);//2019-08-16 15:48:39
		//将字符串转成时间
		Date d = sdf3.parse("2019-08-16 15:48:39");
		
		System.out.println(time3);
		System.out.println(d);
		
		
		//-------------------------注意---------------------
		// SimpleDateFormat构造器的时间格式 必须和 字符串的时间格式一致 才能将字符串转成对应的Date
		Date d2 = sdf3.parse("2019-08-16 15:48:39");
	}
}
