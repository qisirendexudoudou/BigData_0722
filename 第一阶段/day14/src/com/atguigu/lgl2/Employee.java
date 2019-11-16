package com.atguigu.lgl2;

public class Employee {
	String name;
	int age;
	int score;

	public Employee(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "-" + age + "-" + score;
	}
}
