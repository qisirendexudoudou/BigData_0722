package com.atguigu.lgl;

public class Dog {

	String name;
	int age;
	public Dog(int age,String name) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "-" + age;
	}
	
}
