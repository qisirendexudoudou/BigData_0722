package com.atguigu.java2;

import java.util.Scanner;

/*
 	
 	this调用构造器：
		格式 ：this(形参列表)
		作用 ：用来调用本类中的其它构造器
		说明：
			1.this(形参列表)只能放在构造器的首行
			2.this(形参列表)在同一个构造器中只能有一个。
			3.一个类如果有N个构造器，那么最多只能有N-1个this(形参列表)
			
 	
 */

/**
 * 通过this(形参列表)的形式给属性进行赋值
 */
class Cat{
	String name;
	int age;
	int legs;
	char gender;
	
	public Cat(){
		
	}
	
	public Cat(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Cat(String name,int age,int legs){
		this(name,age);
		this.legs = legs;
	}
	
	public Cat(String name,int age,int legs,char gender){
		this(name,age,legs);
		this.gender = gender;
	}
	
	public void show(){
		System.out.println(name + " " + age + " " + legs + " " + gender);
	}
	
	
}

/**
 * this调用构造器
 * @author Administrator
 *
 */
class Dog{
	String name;
	
	public Dog(){
		System.out.println("热巴小姐姐");
	}
	
	public Dog(String name){
		//1.this(形参列表)只能放在构造器的首行
		this();
		System.out.println("cccc");
	}
	
	public Dog(String name,int age){
		this(name);
		System.out.println("dddddd");
	}
}
public class ThisTest3 {

	public static void main(String[] args) {
		
//		new Dog();
		new Dog("aaa",18);
		
		
		System.out.println("--------------------------------");
		
		Cat cat = new Cat("小猫咪", 2, 4, '母');
		cat.show();
		
		System.out.println("------------");
		
		new Scanner(System.in);
	}
}
