package com.atguigu.java3;

import org.junit.Test;

/**
	抓异常的方式一 ： try-catch-finally
	
	格式：
		try{
			可能会发生异常的代码;
		}catch(异常的类型1 变量名){
			处理异常的方式1;
		}catch(异常的类型2 变量名){
			处理异常的方式2;
		}
		......
		finally{
			一定会执行的代码;
		}
		
	 说明：
	 	1.当try中的代码发生异常时，系统会根据对应的异常类创建对象并抛出。抛出的对象会和catch后面的类型进行匹配。
	 		一旦匹配成功则执行对应的异常处理的代码。如果有finally则执行finally中的代码。然后跳出try-catch结构继续向下执行。
	 		（一旦没有匹配成功，如果有finally执行完finally中的代码后，终止程序的运行）
	 	2.finally是可以省略的。finally中的代码一定会执行。
	 	3.catch可以有多个。多个catch的时候，子类（异常的类型）在上父类（异常的类型）在下。
	 	4.try-catch-finally,try-catch,
	 			try-finally : 发生异常后，异常不处理但是需要做一些必须要处理的事情（关闭资源，数据的保存等操作）
	 	5.常见的异常处理方法 : getMessage():打印异常的信息
	 				printStackTrace() ：打印异常的详细信息
	
	注意 ： 一般运行时异常我们都不做处理。
 */
public class ExceptionTest3 {
	
	/*
	 	常见的异常处理方法 : getMessage(),printStackTrace()
	 */
	@Test
	public void test5(){
		
		try{
			System.out.println("aaaa");
			System.out.println("cccc");
			System.out.println(1 / 0);//代码发生异常后，这行代码下面的代码将不再执行。
			System.out.println("==================================");
		}catch(ArithmeticException e){
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("程序结束");
	}
	
	/*
	 	try-catch-finally
	 	try-catch
	 	try-finally : 发生异常后，异常不处理但是需要做一些必须要处理的事情（关闭资源，数据的保存等操作）
	 */
	@Test
	public void test4(){
		try{
			System.out.println("aaaa");
			System.out.println("cccc");
			System.out.println(1 / 0);
		}finally{
			System.out.println("我一定要执行");
		}
		System.out.println("程序结束");
		
	}
	
	/*
	  	如果不同的异常需要不同的处理方式，那么就不能使用异常的父类进行catch。
	  	如果所有的异常都是相同的处理方法，那么就可以使用异常的父类进行catch。
	  	
	  	多个catch的时候，子类（异常的类型）在上父类（异常的类型）在下。
	 */
	@Test
	public void test3(){
		try{
			System.out.println("aaaa");
			System.out.println("cccc");
//			System.out.println(1 / 0);
			String str = null;
			System.out.println(str.toUpperCase());
		}catch(NullPointerException e){
			System.out.println("RuntimeException");
		}catch(Exception e){
			System.out.println("RuntimeException");
		}
		System.out.println("程序结束");
	}
	
	/*
	 * finally是可以省略的。finally中的代码一定会执行。
	 */
	@Test
	public void test2(){
		try{
			System.out.println("aaaa");
			System.out.println("cccc");
			System.out.println(1 / 0);
		}catch(ArithmeticException e){
			System.out.println("哥们你数学是体育老师教的吧");
		}
		System.out.println("程序结束");
	}
	
	/*
	 * 当try中的代码发生异常时，系统会根据对应的异常类创建对象并抛出。抛出的对象会和catch后面的类型进行匹配。
	 		一旦匹配成功则执行对应的异常处理的代码。如果有finally则执行finally中的代码。然后跳出try-catch结构继续向下执行。
	 		（一旦没有匹配成功，如果有finally执行完finally中的代码后，终止程序的运行）
	 */
	@Test
	public void test(){
		
		try{
			System.out.println("aaaa");
			System.out.println("cccc");
			System.out.println(1 / 0);
		}catch(NullPointerException e){
			System.out.println("哥们你怎么能空指针呢？？？？");
		}catch(ArithmeticException e){
			System.out.println("哥们你数学是体育老师教的吧");
		}finally{
			System.out.println("我必须执行");
		}
		System.out.println("程序结束");
		
	}
}















