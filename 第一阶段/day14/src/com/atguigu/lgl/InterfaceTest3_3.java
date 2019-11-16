package com.atguigu.lgl;

import org.junit.Test;

//普通类 抽象类 接口的   创建匿名实现类（匿名子类）的对象
public class InterfaceTest3_3 {
	
	@Test
	public void test1(){
//		A3 a31 = new A3("aa",11);
		A3 a3 = new A3("小许", 17){
			@Override
			public void info() {
				System.out.println("name = " + getName() + " age  = " + getAge());
			}
		};
		a3.info();
	}
	
	@Test
	public void test2(){

//		B3 b33 = new B3();
		B3 b3 = new B3(){
			@Override
			public void info() {
				System.out.println("抽象类 创建匿名子类的对象");
			}
		};
		b3.info();
	}
	
	
	@Test
	public void test3(){
		C3 c3 = new C3() {
			
			@Override
			public void info() {
				System.out.println("接口创建匿名实现类的对象");
			}
		};
		c3.info();
	}
}


//普通类
class A3{
	private int age;
	private String name;
	
	public A3(String name,int age){
		this.age = age;
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void info(){
		System.out.println("null");
	}
}

//抽象类
abstract class B3{
	public abstract void info();
}

//接口
interface C3{
	public abstract void info();
}



