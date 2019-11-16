package com.atguigu.java;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.junit.Test;

import java.time.Instant;

/**
 * Instant : 用来获取UTC时区的时间
 * 
 * 了解
 *
 */
public class InstantTest {

	@Test
	public void test(){
		//静态方法，返回默认UTC时区的Instant类的对象
		Instant now = Instant.now();
		System.out.println(now);
		
		//静态方法，返回在1970-01-01 00:00:00基础上加上指定毫秒数之后的Instant类的对象
		Instant now2 = Instant.ofEpochMilli(152123123131L);
		System.out.println(now2);
		
		//结合即时的偏移来创建一个 OffsetDateTime
		OffsetDateTime atOffset = now.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);
		
		//返回1970-01-01 00:00:00到当前时间的毫秒数，即为时间戳
		long epochMilli = now.toEpochMilli();//1566005615581
		System.out.println(epochMilli);
		
	}
}
