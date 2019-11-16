package com.atguigu.java3;

import com.atguigu.java2.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		
	}
}

//不同包的子类可以访问 ： protected修饰的属性和方法
class A extends Person{
	
	public void show(){
		System.out.println(nameProtected);
		sayPortected();
	}
}
