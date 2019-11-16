package com.atguigu.java2;

public class Demo {

	public static void main(String[] args) {
		
		new A(10){
			
			@Override
			void show() {
				System.out.println(age);
			}
		};
	}
}
interface B{
	
}


abstract class A{
	
	int age;
	
	public A(int age){
		this.age = age;
	}
	
	abstract void show();
}
