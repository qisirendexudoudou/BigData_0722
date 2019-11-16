package com.atguigu.java3;

import sun.applet.Main;

/*
 	单例设计模式 ： 
 	
 	解决的问题 ： 一个类在整个项目中只能创建一个对象。
 	
 	实现方式 ： 懒汉式  vs 饿汉式
 	
 	饿汉式的和懒汉式的区别？
 	饿汉式 ：1.线程安全的。（后面再讲什么是线程）
 	懒汉式 ：1.线程不安全的   2.延迟了对象的加载时机（懒加载），一定程度节约了内存的占用。
 	
 */

/*
 *  懒汉式 :
 */
class Bank{
	//1.私有化构造器
	private Bank(){
		
	}
	
	//2.提供一个该类的实例的声明
	private static Bank bank = null;
	
	//3.提供一个公共的方法，返回该类的对象。
	public static Bank getInstance(){
		
		//4.创建该类的对象 - 需要进行判断，如果该对象已经被创建就不能再new了
		if(bank == null){
			bank = new Bank();
		}
		return bank;
	}
}

/*
 * 饿汉式 ：
 */
class Computer{
	//1.私有化构造器
	private Computer(){
		
	}
	//2.创建一个Computer对象
	private static Computer computer = new Computer();
	
	//3.提供一个公共的方法，返回该类的对象。
	public static Computer getInstance(){
		return computer;
	}
}


public class SingletonTest {

	public static void main(String[] args) {
		
		/*
		 * 先看看就可以了
		 */
		for (int i = 0; i < 50; i++) {
			new Thread(() -> {
				System.out.println(Bank.getInstance());
			}).start();
		}
	
	}
}


