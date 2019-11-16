package com.atguigu.lgl;

import java.util.Arrays;

//使用enum定义枚举类 ： 1.格式 ： enum 类名{}
public class EnumTest2 {
	public static void main(String[] args) {
		System.out.println(Season3.SPRING.getSeasonName());
		System.out.println(Season3.SUMMER.getSeasonName());
		
		
		Season3[] values = Season3.values();
		System.out.println(Arrays.toString(values));
		
		Season3 su = Season3.valueOf("SUMMER");
		System.out.println(su.getSeasonName());
		
		
		System.out.println(Season3.SPRING.getSeasonName());
	}

}

interface info{
	void say();
}

enum Season2 implements info {
	;

	@Override
	public void say() {
		System.out.println("SPRING");
	}
	
}


enum Season3{
	
	SPRING("春天"),
	SUMMER("夏天");
	
	
	private final String SEASONNAME;
	
	Season3(String seasonname){
		this.SEASONNAME = seasonname;
	}
	
	public String getSeasonName(){
		return SEASONNAME;
	}
	
}
