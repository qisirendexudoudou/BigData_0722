package com.atguigu.java;

import java.util.Arrays;

/**
 * 快捷键 ： alt + shift + r (批量修改变量名、类名 .....)
 * 
 * 		  shift + ctrl + y : 将所有字母变为小写
 * 		  shift + ctrl + x : 将所有字母变为大写
 * 
 * 使用enum定义枚举类 ： 1.格式 ： enum 类名{}
 */
enum Season3 {

	//枚举类的对象只能放在类的首行。多个对象之间用","隔开用";"结尾
	SPRING("春天"), 
	SUMMER("夏天"), 
	AUTUMN("秋天"), 
	WINTER("冬天");

	private final String SEASON_NAME;
	
	Season3(String seasonName) { // 默认就是private且只能是private
		this.SEASON_NAME = seasonName;
	}

	public String getSeasonName() {
		return SEASON_NAME;
	}
	
	
}

interface Info{
	void seasonDes();
}
enum Season2 implements Info {
	SPRING{
		@Override
		public void seasonDes() {
			System.out.println("SPRING");
		}
	}, 
	SUMMER{
		@Override
		public void seasonDes() {
			System.out.println("SUMMER");
		}
	}, 
	AUTUMN{
		@Override
		public void seasonDes() {
			System.out.println("AUTUMN");
		}
	}, 
	WINTER{
		@Override
		public void seasonDes() {
			System.out.println("WINTER");
		}
	};

	
}

public class EnumTest2 {

	public static void main(String[] args) {
		System.out.println(Season3.SPRING.getSeasonName());
		/*
		 *  values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
			valueOf(String str)：可以把一个字符串转为对应的枚举类对象。
			要求字符串必须是枚举类对象的“名字”。
				如不是，会有运行时异常：IllegalArgumentException。

		 */
		Season2[] values = Season2.values();
		System.out.println(Arrays.toString(values));
		
		//注意大小写的问题
		Season3 summer = Season3.valueOf("SUMMER");
		System.out.println(summer.getSeasonName());
		
		System.out.println("-----------------------------------------------");
		
		Season2.SPRING.seasonDes();
		Season2.SUMMER.seasonDes();
	}
}











