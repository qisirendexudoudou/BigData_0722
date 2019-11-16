package com.atguigu.java4;

import org.junit.Test;

/*
 	lambda表达式是对匿名内部类的简化
 	
 	格式：  
 		-> : lambda操作符（箭头操作符）
 		lambda操作符左边 ：方法的形参
 		lambda操作符右边 ：方法体
 */
public class LambdaTest2 {

	@Test
	public void test(){
		
		//创建的是Runnable接口实现类的对象
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("正在运行");
			}
		};
		
		run(runnable);
		
		System.out.println("--------------lambda表达式---------------");
		
		run(() -> {
			System.out.println("正在运行");
		});
		
	}
	
	public void run(Runnable runn){
	}
}
