package com.atguigu.java4;

/**
	接口在jdk1.8以后接口中还可以定义默认方法和静态方法
 */
public interface MyInterface2 {

	default void demo(){
		System.out.println("MyInterface2 default demo");
	}
	
	public static void info(){
		System.out.println("MyInterface2 static info");
	}
}
