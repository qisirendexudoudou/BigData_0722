package com.atguigu.java;

/*
 	一  。所谓javaBean，是指符合如下标准的Java类 （JavaBean就是一个普通的类）：
			1.类是公共的
			2.有一个无参的公共的构造器
			3.有属性，且有对应的get、set方法

 */
public class JavaBean {
	
	private int age;

	public JavaBean(){
		
	}
	
	public JavaBean(int a){
		age = a;
	}
	
	public void add(){
		System.out.println("sum");
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public int getAge(){
		return age;
	}
	
	
}
