package com.atguigu.java2;

/*
 	二维数组 ： 数组的元素是一维数组
 	
 	说明：
 		1.二维数组的元素是一维数组
 */
public class DyadicArray {

	public static void main(String[] args) {
		
		//1.二维数组的声明和初始化
		//二维数组的声明
		String[][] persons;
		String persons2[][];
		String[] persons3[];
		//二维数组的初始化
		//静态初始化：
		persons = new String[][]{{"小龙哥","110"},{"老强哥","120"},{"小淫哥","119"}};
		//下面这种写法声明和初始化不能分开
		int[][] numbers = {{1,2},{3,4},{5,6}};
		//动态初始化 ：
		//如果需要创建的二维数组的元素的长度是一样的选择下面的方式
		persons2 = new String[3][2]; //3指的是二维数组的长度，2指的是二维数组元素（一维数组）的长度
		
		//如果需要创建二维数组的元素的长度是不一样的选择下面的方式
		//创建了一个长度为3的二维数组。二维数组的元素为null
		persons3 = new String[3][];
		persons3[0] = new String[2];
		persons3[1] = new String[3];
		persons3[2] = new String[2];
		
		
		//2.给二维数组的元素的元素赋值和获取二维数组元素的元素的值
		String name = persons[1][0]; //1指的是二维数组的索引值，0指的是二维数组元素的索引值
		System.out.println(name);
		System.out.println(persons[2][1]);
		persons[2][0] = "阿威哥";
		System.out.println(persons[2][0]);
		
		//3.二维数组的属性 ：length
		System.out.println(persons.length); //二维数组的长度
		String[] person = persons[0];
		System.out.println(persons[0].length);//二维数组元素的长度
		
		System.out.println("----------------------------------------------");
		//4.遍历二维数中的元素
		//4.1先遍历二维数组的元素
		for (int i = 0; i < persons.length; i++) {
			//获取的是二维数组的元素 - 一维数组
			String[] p = persons[i];
			//遍历二维数组的元素 - 一维数组
			for (int j = 0; j < p.length; j++) {
				System.out.println(p[j]);
			}
		}
		
		
		System.out.println("----------------------------------");
		
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				System.out.println(persons[i][j]);
			}
		}
		
		//5.二维数组元素的默认值 ：null (二维数组的元素是一维数组)
		// 二维数组的元素的元素的默认值和一维数组元素的默认值是一样的
		
		
		//6.二维数组的内存解析 详见 DyadicArray2.java
	}
}
















