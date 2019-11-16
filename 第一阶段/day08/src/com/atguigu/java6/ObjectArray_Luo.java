package com.atguigu.java6;

import java.net.Socket;
import java.util.Arrays;

/*
 	对象数组
 */
class Student2{
	String name;
	int id;
}


public class ObjectArray_Luo {

	public static void main(String[] args) {
		
//		ObjectArray_Luo test2 = new ObjectArray_Luo();
//		test2.test2();
		
		 new ObjectArray_Luo().test4();
		 System.out.println("----------------");
		 new ObjectArray_Luo().test3();
	}

	/*
	 * 数组中的元素存放的是不同的对象的地址值
	 */
	public void test4(){
		//创建数组
		Student[] numbers = new Student[5];
		for (int i = 0; i < numbers.length; i++) {
			//创建对象
			Student stu2 = new Student();
			//数组中的元素存放的是对象
			numbers[i] = stu2;
			numbers[i].name = "小许"+ (i+1);
			numbers[i].id = i+1;
		}
		//遍历数组
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i].name+"\t");
			System.out.println(numbers[i].id);
		}
		
	}

	/*
	 * 数组中的元素全部存放的是同一个对象的地址值
	 */
	public void test3(){
		//对比      int[] num = new int[5];
		//数组中的元素是Student类的对象
		Student[] numbers = new Student[5];
		//1.给数组赋值
		//1.1创建对象
		Student st1 = new Student();
		st1.name = "haha";
		st1.id = 1;
		
		//1.2学生的对象放到数组中
		numbers[0] = st1;
		numbers[1] = st1;
		numbers[2] = st1;
		numbers[3] = st1;
		numbers[4] = st1;
		
		//2.遍历数组中所有元素的属性
		for (int i = 0; i < numbers.length; i++) {
			//获取数组中的每一个元素并输出该对象的属性
			System.out.print(numbers[i].name+"\t");
			System.out.println(numbers[i].id);
		}
		
		//3.修改其中一个元素的值
		numbers[0].name = "gouzi";
		
		//4.遍历数组中所有元素的属性
		for (int i = 0; i < numbers.length; i++) {
			//获取数组中的每一个元素并输出该对象的属性
			System.out.print(numbers[i].name+"\t");
			System.out.println(numbers[i].id);
		}
	}
	

	}

