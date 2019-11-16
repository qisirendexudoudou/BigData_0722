package com.atguigu.java3;

import org.junit.Test;

/**
 	
 	异常的处理 ：
 	
 	一 抓抛模型 ：
 	
 		抛 ：在程序正常的执行过程中，一旦执行到某行代码时发生了异常，那么系统会根据对应的异常类创建该类的对象并抛出。
 			抛出异常类的对象时还会终止程序的运行。
 			1.系统向外抛      2.手动向外抛（throw）
 	
 		抓 ： 1.try-catch-finally    2.throws
 	
 */
public class ExceptionTest2 {

	@Test
	public void test(){
		
		System.out.println("aaaa");
		System.out.println("cccc");
		System.out.println(1 / 0);
		System.out.println("程序结束");
		
	}
}
