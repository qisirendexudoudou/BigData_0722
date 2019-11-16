package com.atguigu.java3;

//同一个包中 : 可以调用缺省的，public修饰的 属性和方法
public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		System.out.println(person.name);
		System.out.println(person.namePublic);
		
		
		person.say();
		person.sayPublic();
	}
}
