package com.atguigu.java2;

public class Person {

	protected String nameProtected;
	
	protected void sayPortected(){
		System.out.println("sayPortected");
	}
	
	//本类中可以调用 ：protected修饰的属性和方法
	public void test(){
		System.out.println(nameProtected);
		sayPortected();
	}
}
