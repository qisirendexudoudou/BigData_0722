package com.atguigu.java3;

public class Employee {
	String name;
	int age;
	int score;

	public Employee(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "-" + age + "-" + score;
	}
}
