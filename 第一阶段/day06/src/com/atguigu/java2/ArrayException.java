package com.atguigu.java2;

/*
 	数组中常见的异常：
 	
 	1.数组下角标越界 ： ArrayIndexOutofBoundsException
 		原因 ： 使用的索引值没有在当前数组的索引的合理范围之内
 	2.空指针异常 ： : NullPointerException
 		因为null不能调用任何方法和属性
 */
public class ArrayException {

	public static void main(String[] args) {
		
		//1.数组下角标越界 ： ArrayIndexOutofBoundsException
		int[] numbers = new int[2]; //索引值合理范围 ： 0 ~ 长度-1
//		System.out.println(numbers[2]); //发生了异常
//		System.out.println(numbers[-1]); //发生了异常
		
		
		//2.空指针异常 ： : NullPointerException
		String str = "aaa";
		str = null;
//		System.out.println(str.toUpperCase());//发生了异常
		
		String[] names = new String[2];
//		System.out.println(names[0].toUpperCase());//发生了异常
		
		String[][] persons = new String[3][];
//		System.out.println(persons[0][0]); //发生了异常
//		System.out.println(persons[0].length); //发生了异常
	}
}
