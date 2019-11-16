package com.atguigu.java;

/*
 	数组 ：
 	
 	说明：
 		1.数组是引用数据类型。
 		2.数组中的元素即可以基本数据类型也可以是引用数据类型。
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		//1.数组的声明和初始化
		//数组的声明
		String[] names; //存储的数据的类型是String类型
		int scores[]; //存储的数据的类型是int类型
		//数组的初始化 ：静态初始化和动态初始化
		//静态初始化：数组的初始化和赋值是同时进行的
		names = new String[]{"苍老师","小泽老师","小饭老师","小泷老师"};
		//下面的方式数组的声明和初始化不能分开。
		int[] age = {1,10,2,90};
		//动态初始化：数组的初始化和赋值是分开进行的
		String[] names2 = new String[5]; //5指的数组的长度（数组中可以放几个数据）。
		
		
		//2.给数组赋值和获取数组中的元素 ：数组的索引值（下角标）是从0开始到数组的长度-1
		//给数组赋值
		names2[0] = "志玲姐姐"; //0指的是数组的索引值。
		//获取数组中的数据
		String name = names2[0];
		System.out.println(name);
		
		
		//3.数组的属性 ：length(数组的长度)
		System.out.println(names2.length);//5
		System.out.println(age.length);//4
		System.out.println(names.length);//4
		
		System.out.println("----------------------------------");
		//4.遍历数组中所有的元素
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		
		System.out.println("----------------------------------");
		//5.数组元素的默认值
		/*
		 	byte,short,int,long  -> 0
		 	float,double -> 0.0
		 	boolean -> false
		 	char -> \u0000
		 	
		 	引用数据类型(类，数组，接口) -> null
		 */
		boolean[] boos = new boolean[2];
		System.out.println(boos[0]);
		int[] ns = new int[2];
		System.out.println(ns[0]);
		String[] strs = new String[2];
		System.out.println(strs[0]);
		char[] cs = new char[2];
		System.out.println("a" + cs[0] + "c");
		
		System.out.println("----------------------------------");
		int a = 10;
		
		int b = a;
		//6 一维数组的内存解析
		String[] persons = new String[3];
		persons[0] = "小波老师";
		persons[2] = "小龙老师";
		//persons和persons2实际上指向的是同一块内存
		String[] persons2 = persons;
		persons2[1] = "斗战胜佛小龙哥";
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
		
		System.out.println("-----------persons2----------------");
		
		for (int i = 0; i < persons2.length; i++) {
			System.out.println(persons2[i]);
		}
	}
}














