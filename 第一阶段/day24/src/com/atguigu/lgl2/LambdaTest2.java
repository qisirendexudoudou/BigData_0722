package com.atguigu.lgl2;

import org.junit.Test;

//lambda表达式的使用
//lambda表达式是对匿名内部类的简化

public class LambdaTest2 {

	@Test
	public void test(){
//		Runnable runnable = new  Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("--");
//			}
//		};
//		say(runnable);
		
		System.out.println("--lambda--");
		
		say(() ->System.out.println("aa"));
		
	}
	
public void say(Runnable runn){	
	System.out.println("aa");
	}
}
