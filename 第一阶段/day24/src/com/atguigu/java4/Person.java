package com.atguigu.java4;

public class Person {

	String name;
	int age;
	int score;
	
	
	public Person(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}


	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
}
