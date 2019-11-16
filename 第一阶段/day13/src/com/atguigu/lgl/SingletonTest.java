package com.atguigu.lgl;

public class SingletonTest {

}

//单例设计模式
//懒汉式
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

//饿汉式
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