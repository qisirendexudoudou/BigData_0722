package com.atguigu.lgl2;

public class Person{
	
	String name;
	char sex;
	int age;

	public Person() {
	}

	public Person(String name, char sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	

	public String toString(){
		return name + sex + age;
	}
}