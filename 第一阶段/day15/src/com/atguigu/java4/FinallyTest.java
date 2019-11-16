package com.atguigu.java4;

import org.junit.Test;

/*
 	finally : 
 			1.finally中的代码一定会执行。
 			2.就算在try和catch中有return,那么finally中的代码也一定会执行。
 */
public class FinallyTest {
	
	@Test
	public void test2(){
		System.out.println(getNumber());//20
		System.out.println("----------------------------------");
		System.out.println(getNumber2());
	}
	
	public int getNumber2(){
		try{
			return 10;
		}catch(Exception e){
			System.out.println("发生异常了");
		}finally{
			System.out.println("我是finally");
		}
		return 20;
	}
	/*
	 * 就算在try中catch中有return,那么finally中的代码也一定会执行。
	 */
	public int getNumber(){
		try{
			return 10;
		}catch(Exception e){
			System.out.println("发生异常了");
		}finally{
			return 20;
		}
	}

	/*
	 * 1.就算catch中再次发生异常finally还是会执行。
	 */
	@Test
	public void test(){
		
		try{
			System.out.println("aaaa");
			System.out.println(1 / 0);
		}catch(ArithmeticException e){
			System.out.println("发生了异常");
			System.out.println(1 / 0);
		}finally{
			System.out.println("我一定要执行");
		}
		
		System.out.println("程序结束");
	}
}
