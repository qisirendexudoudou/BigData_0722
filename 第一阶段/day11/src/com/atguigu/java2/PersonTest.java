package com.atguigu.java2;

public class PersonTest {

	public static void main(String[] args) {
		
		//在同一个包中可以访问 ：protected修饰的属性和方法
		Person person = new Person();
		person.sayPortected();
		System.out.println(person.nameProtected);
	}
}
