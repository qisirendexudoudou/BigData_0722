package com.atguigu.exer;

public class StudentTest {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.name = "苍同学";
		stu.age = 18;
		stu.major = "表演系";
		stu.interests = "表演，拍电影";
		
		System.out.println(stu.say());
	}
}

//The type Student is already defined
/*
 * 在同一个包里的类名不能相同
class Student{
	
}
*/
