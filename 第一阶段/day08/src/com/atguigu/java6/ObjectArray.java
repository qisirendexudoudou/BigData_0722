package com.atguigu.java6;

import java.util.Arrays;

/*
 	对象数组
 */
class Student{
	String name;
	int id;
}


public class ObjectArray {

	public static void main(String[] args) {
		
		 new ObjectArray().test2();
	}
	/*
	 * 数组中的元素存放的是不同的对象的地址值
	 */
	public void test2(){
		
		Student[] students = new Student[5];
		
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			students[i] = student;
			students[i].name = "小刚哥"+ i;
			students[i].id = i;
		}
		
		//修改其中某一个对象的属性值
		students[0].name = "小刚哥挂了";
		
		//遍历数组中的每一个元素的属性
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].name+"\t");
			System.out.println(students[i].id);
		}
	}
	
	/*
	 * 数组中的元素全部存放的是同一个对象的地址值
	 */
	public void test(){
		int[] numbers = new int[5];
		//数组中的元素是Student类的对象
		Student[] students = new Student[5];
		//1.给数组赋值
		//1.1 创建对象
		Student student = new Student();
		student.name = "小强哥";
		student.id = 1;
		//1.2将学生的对象放入到数组中
		students[0] = student;
		students[1] = student;
		students[2] = student;
		students[3] = student;
		students[4] = student;
		
		//修改数组中某一个元素中的属性的值
		Student stud = students[1];
		stud.name = "小淫哥";
		
		//2.遍历数组中所有的元素的属性
		for (int i = 0; i < students.length; i++) {
			//获取数组中的每一个元素并输出该对象的属性
			Student stu = students[i];
			System.out.println(stu.name);
			System.out.println(stu.id);
		}
	}
}
