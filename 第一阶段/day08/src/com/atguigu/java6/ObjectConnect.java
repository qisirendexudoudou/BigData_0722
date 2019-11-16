package com.atguigu.java6;

/*
 	对象之间的关联 :
 	
 	
 */

class Dog{
	String name;
	String color;
}

class Teacher{
	String name;
	int age;
	Dog dog;
}

public class ObjectConnect {

	public static void main(String[] args) {
		//创建一只狗的对象
		Dog dog = new Dog();
		dog.name = "中华田园犬";
		dog.color = "黄色";
		
		//创建一个老师的对象
		Teacher teacher = new Teacher();
		teacher.name = "小龙哥";
		teacher.age = 16;
		
		//让老师和狗关联起来
		teacher.dog = dog;
		
		System.out.println("----------------------------------");
		
		//需求 ：输出小龙哥宠物的颜色
		System.out.println(teacher.dog.color);
		System.out.println(teacher.dog.name);
		
		System.out.println("-------------------------------");
		//获取小龙哥的那只狗
		Dog d = teacher.dog;
		System.out.println(d.name);
		System.out.println(d.color);
	}
}









