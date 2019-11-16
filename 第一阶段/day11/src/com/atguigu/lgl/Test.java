package com.atguigu.lgl;

public class Test {

	public static void main(String[] args) {
//		Student student = new Student();
		Student student = new Student(1001, 30, 50, 70);
		student.age = 10;
		student.sex = '女';
		student.age = 27;
		
		System.out.println(student.aver());
		System.out.println(student.max());
		System.out.println(student.min());
	}
}
