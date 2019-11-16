package com.atguigu.lgl;
/*
		1. 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。
		2. 修改上题中类和构造器，
			增加name属性,使得每次创建Person对象的同时初始化对象的age属性值和name属性值。

 */
public class Persons {
	int age;
	String name;
	public Persons(){
		age = 18;
		name = "小许";
	}
	
	public static void main(String[] args) {
		Persons persons = new Persons();
		System.out.println(persons.age);
		System.out.println(persons.name);
	}
	
}
