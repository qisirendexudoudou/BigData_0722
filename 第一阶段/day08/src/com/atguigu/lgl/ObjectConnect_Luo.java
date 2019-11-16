package com.atguigu.lgl;

//		对象之间的关联
public class ObjectConnect_Luo {

	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.name = "狗子";
		dog.color = "yellow";
		
		Teacher teacher = new Teacher();
		teacher.name = "小许";
		teacher.age = 12;
		
		teacher.n3 = dog;
		
		System.out.println(teacher.n3.name);
		System.out.println(teacher.n3.color);
	}
}

class Dog2{
	String name;
	String color;
	int age;
	
}

class Teacher{
	String name;
	int age;
	Dog2 n3;
}