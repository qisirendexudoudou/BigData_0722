package com.atguigu.java3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
	一 异常的体系结构：
	
		|------Throwable
			|-----Error: 没有针对性的代码进行处理
			
			|-----Exception: 有针对性的代码进行处理
				|-----编译时异常：程序在编译时(javac 源文件名.java)发生的异常 （必须处理，否则不能运行。）
					FileNotFoundException: 文件找不到异常
					
				|-----运行时异常：程序运行时（java 字节码文件名）发生的异常
					ArithmeticException : 算术运算异常
					ArrayIndexOutOfBoundsException : 下角标越界
					NullPointerException : 空指针异常
 */
public class ExceptionTest {
	
	/*
	 * 编译时异常 ： 必须处理，否则不能运行。
	 */
	@Test
	public void test2(){
		//FileNotFoundException: 文件找不到异常
		try {
			new FileInputStream("123.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 运行时异常  ：
	 */
	@Test
	public void test(){
		//ArithmeticException : 算术运算异常
//		System.out.println(1 / 0);
		
		//ArrayIndexOutOfBoundsException : 下角标越界
//		int[] numbers = new int[2];
//		System.out.println(numbers[2]);
		
		System.out.println("程序结束");
	}
}







