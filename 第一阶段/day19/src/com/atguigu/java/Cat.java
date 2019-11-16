package com.atguigu.java;

public class Cat  {

	String name;
	int age;
	
	public Cat(String name,int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "(" + name + " " + age + ")";
	}

}
