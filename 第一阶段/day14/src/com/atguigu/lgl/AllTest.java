package com.atguigu.lgl;

import org.junit.Test;

//普通类
class Person{
	public void show(){
		System.out.println("Person show");
	}
}

//抽象类
abstract class Animal{
	abstract public void info();
}


//接口
interface A{
	public abstract void say();
}


public class AllTest {
	
	//普通类
	@Test
	public void test1(){
		Person person = new Person(){
			@Override
			public void show() {
				System.out.println("这是普通类的匿名测试");
			}
		};
		person.show();
	}
	
	
	//抽象类
	@Test
	public void test2(){
		Animal animal = new Animal(){
			@Override
			public void info() {
				System.out.println("这是抽象类的匿名测试");
			}
		};
		animal.info();
	}
	
	
	//接口
	@Test
	public void test3(){
		A a = new A(){
			@Override
			public void say() {
				System.out.println("这是接口的匿名测试");
			}
		};
		a.say();
	}
	
	
	
	
	
	
}





