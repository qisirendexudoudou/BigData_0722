package com.atguigu.java;

public class Person {

	int id;
	String name;
	
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	
	
}
