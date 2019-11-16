package com.atguigu.lgl2;

public class Person {
	String name;
	int age;
	int score;
	
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	public Person(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
}
