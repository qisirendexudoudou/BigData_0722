package com.atguigu.java3;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/*
 *	日历类（了解）
 */
public class CalendarTest {

	@Test
	public void test(){
		
		Calendar c = Calendar.getInstance();
		//c.getClass().getName() 获取当前对象所对应的类的类名
		System.out.println(c.getClass().getName());
		
		//修改当天是当月的第几天（在原来的基础上加上2天）
//		c.add(Calendar.DAY_OF_MONTH, -2);
		
		//修改当天是当月的第几天（在原来的基础上修改成第2天）
		c.set(Calendar.DAY_OF_MONTH, 2);
		
		//获取当天是当月的第几天
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		//获取日历类对应的时间
		Date date = c.getTime();
		System.out.println(date.toString());
	}
}
