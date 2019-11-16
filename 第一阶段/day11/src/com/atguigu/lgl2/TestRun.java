package com.atguigu.lgl2;

public class TestRun {
	public static void main(String[] args) {
		
		Student student = new Student(1001, 100, 90, 80);
		System.out.println(student.max());
		System.out.println(student.min());
		System.out.println(student.aver());
		
		System.out.println(student.toString());
	}

}
