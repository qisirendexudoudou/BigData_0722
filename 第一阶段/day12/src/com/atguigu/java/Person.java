package com.atguigu.java;

/*
 * 父类
 */
public class Person extends Creature {

	String name = "personname";
	
	public void show(){
		System.out.println("person show");
	}
	
	public void say(){
		System.out.println("person say");
	}
}
