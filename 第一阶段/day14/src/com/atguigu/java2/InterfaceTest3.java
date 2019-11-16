package com.atguigu.java2;

import org.junit.Test;

/*
 * 创建匿名实现类（匿名子类）的对象 : 必须会
 */
abstract class GeometricObject{
	public abstract double findArea();
}

class Person{
	public void show(){
		System.out.println("person show");
	}
}

interface D{
	void say();
}

//class DD implements D{
//
//	@Override
//	public void say() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}

public class InterfaceTest3 {
	
	@Test
	public void test3(){
		D d = new D(){

			@Override
			public void say() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	
	@Test
	public void test2(){
		//创建的是Person类的匿名子类的对象
		Person person = new Person(){
			@Override
			public void show() {
				super.show();
				System.out.println("person");
			}
		};
		person.show();
	}

	@Test
	public void test(){
		
		//创建的是GeometricObject匿名子类的对象
		GeometricObject go = new GeometricObject() {

			@Override
			public double findArea() {
				// TODO Auto-generated method stub
				return 30;
			}
		};
		
		System.out.println(go.findArea());
	}
		
}
