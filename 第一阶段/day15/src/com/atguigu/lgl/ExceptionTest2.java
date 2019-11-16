package com.atguigu.lgl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.tree.ExpandVetoException;

import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;

/**
 * 异常的处理
 * --抓抛模型
 * 		抛：
 * 			1.系统向外抛  
 * 			2.手动向外抛(throw)
 * 				格式 ： throw 异常类的对象;
 * 		抓：
 * 			1.try-catch-finally
 * 				格式：
 * 					try{
 * 						可能会发生异常的代码;
 * 					}catch(异常的类型1 变量名){
 * 						处理异常的方式1;
 * 					}catch(异常的类型2 变量名){
 * 						处理异常的方式2;
 * 					}
 * 					...
 * 					finally{
 * 						一定会执行的代码;
 * 					}
 * 				常见的异常处理方法：
 * 						1.getMessage():打印异常的信息
 * 						2.printStackTrace():打印异常的详细信息
 * 				说明：finally : 
 						1.finally中的代码一定会执行。
 						2.就算在try和catch中有return,那么finally中的代码也一定会执行。
 * 			2.throws
 * 				格式 ： 权限修饰符 返回值类型 方法 (形参列表) throws 异常类型1，异常类型2......{
 * 
 * 				}
 */



public class ExceptionTest2 {
	
	int age;
	
	@Test
	public void test5(){
		try{
			setAge(-8);
		}catch(Exception e){
			e.printStackTrace();
		}
}

	public void setAge(int age) throws Exception{
		if (age >= 0) {
			this.age =age;
		}else
			throw new Exception("age不能小于0");
	}
	
	
	@Test
	public void test4(){
		try{
			demo2();
		}catch (FileNotFoundException e){
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}
		
		public void demo2() throws FileNotFoundException {
			demo();
		}

		public void demo() throws FileNotFoundException {
			new FileInputStream("123.txt");
		}

	
	@Test
	public void test() {
		try {
			demo2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

//	public void demo2() throws FileNotFoundException {
//		demo();
//	}
//
//	public void demo() throws FileNotFoundException {
//		new FileInputStream("123.txt");
//	}

	



	@Test
	public void test3(){
		System.out.println(getNum()); //20
		System.out.println("----------------");
		System.out.println(getNum2());
	}
		
		public int getNum(){
			try{
				System.out.println(1/0);
				return 10;
			}catch (NullPointerException e){
				System.out.println(e.getMessage());
			}finally{
				return 20;
			}
		}
		
		public int getNum2(){
			try{
//				System.out.println(1/0);
				return 10;
			}catch (NullPointerException e){
				System.out.println(e.getMessage());
			}finally{
				System.out.println("我一定要执行");
			}
			return 20;
		}

		
	@Test
	public void test2(){
		try{
		String str = null;
		System.out.println(str.toUpperCase());
		}catch (NullPointerException e){
			System.out.println("空指针异常");
		}catch (ArithmeticException e){
			System.out.println("ArithmeticException");
		}catch (Exception e){
			System.out.println("匹配不到对应的异常信息的话 就让我处理吧");
		}finally{
			System.out.println("我必须要执行的");
		}
	}
		
		
	@Test
	public void test1(){
		try{
			System.out.println("aa");
			System.out.println("bb");
			System.out.println(1/0);
			System.out.println("cc");
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
//			e.getStackTrace();
		}
		System.out.println("程序正常结束了");
	}	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
