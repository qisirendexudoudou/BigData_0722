package com.atguigu.lgl;

import java.rmi.StubNotFoundException;

import org.junit.Test;

//创建匿名实现类（匿名子类）的对象

//抽象类
abstract class GeometricObject2{
	public abstract double findAre();

}

//普通类
class Person2{
	public void say(){
		System.out.println("person2 show");
	}
}

//接口
interface Student{
	public abstract void show();
}


//class Luo implements Student {
//
//	@Override
//	public void show() {
//		System.out.println("这是创建class的实例后重写的show方法 ");
//	}
//	
//}

public class InterfaceTest3 {
	
	@Test
	public void test3(){
//		Luo luo1 = new Luo();
//		luo1.show();
		
		Student st1 = new Student() {
			
			@Override
			public void show() {
				System.out.println("这是创建Student接口的实现类的匿名对象后的show方法");
			}
		};
		st1.show();
		
	}
	
	
	
	@Test
	public void test2(){
		//创建的是Person类的匿名子类的对象
		Person2 person2 = new Person2() {
			@Override
			public void say() {
				//调用原来Person中的say方法
				super.say();
				System.out.println("person");
			}
		};
		person2.say();
		
	}
	
	
	@Test
	public void test1(){
		
		double radius = 2.0;
		//创建GeometricObject2匿名子类的对象
		GeometricObject2 g2 = new GeometricObject2() {
			
			@Override
			public double findAre() {
//				return Math.PI * radius * radius; 
				return 10; 
			}
		};
		System.out.println(g2.findAre());
	}
	
}
