package com.atguigu.exer;

public class Test {

	public static void main(String[] args) {
		
		Student student = new Student(10101, 100, 100, 90);
		//给名字和年纪赋值
		student.name = "小龙哥";
		student.age = 20;
		student.sex = '男';
		
		//调用方法
		System.out.println(student.max());
		System.out.println(student.min());
		System.out.println(student.toString());
	}
}
