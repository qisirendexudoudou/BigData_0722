package com.atguigu.java4;

import com.atguigu.java3.Person;

//不同包中 - 可以调用public修饰的属性和方法
public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		System.out.println(person.namePublic);
		
		person.sayPublic();
	}
}
