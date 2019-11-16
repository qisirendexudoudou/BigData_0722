package com.atguigu.java4;

import org.junit.Test;

/*
 	抛 ：throw
 	
 	格式 ： throw 异常类的对象;
 */
public class ThrowTest {

	@Test
	public void test(){
		
		//编译时异常 ： 必须处理
		try {
			setAge(-5);
		} catch (MyException e) {
			e.printStackTrace();
		}
		
		System.out.println("程序结束");
	}
	
	/**
	 * 年纪必须大于0
	 * @param age
	 * @throws Exception 
	 */
	public void setAge(int age) throws MyException{
		if(age > 0){
			//直接赋值
		}else{
			//创建的是运行时类的异常对象 （调用者可以不用处理该异常，但是发生异常后直接会终止程序的运行）
//			throw new NullPointerException("年纪不能小于0");
			
			
			//创建的是编译时异常（一般情况下都是编译时异常） ： 必须得处理异常 
			//（向上抛该异常，那调用者调用该方法时就必须处理这个异常（相当于通知了调用者可能会有异常发生））
			throw new MyException("不能小于0");
		}
	}
}
