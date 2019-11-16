package com.atguigu.java4;

/**
	接口在jdk1.8以后接口中还可以定义默认方法和静态方法
 */
public interface MyInterface {

	default void demo(){
		System.out.println("default demo");
	}
	
	public static void info(){
		System.out.println("static info");
	}
}
