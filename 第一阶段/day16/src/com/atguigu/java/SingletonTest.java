package com.atguigu.java;

public class SingletonTest {

	public static void main(String[] args) {
		Bank instance = Bank.getInstance();
		System.out.println(instance);
	}
}

/*
 * 
 * 	使用代码块去实现单例
 */

class Bank{
	
	//1.私有化构造器
	private Bank(){}
	
	//2.提供该类对象的声明
	private static Bank bank = null;
	
	static{ //只能使用静态代码块。（不能使用非静态代码块，因为非静态代码块是随着对象的创建而加载的）
		bank = new Bank();
	}
	
	//3.提供一个公共的方法返回当前类的对象
	public static Bank getInstance(){
		return bank;
	}
	
}
