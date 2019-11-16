package com.atguigu.java2;

import java.util.Arrays;

/*
 	Arrays工具类：
 	
 	
 	快捷键 ： ctrl + / : 单行注释 、反注释
 		
 		   ctrl + shift + / : 多行注释
 		   ctrl + shift + \ : 取消多行注释
 		   
 */
public class ArraysTest {

	public static void main(String[] args) {
		
		int[] ns = {5,2,30,4,1,90};
		int[] ns2 = {5,2,3,4,1};
		
		//比较两个数组是否相等 : 比较的是内容，个数，顺序
//		boolean equals = Arrays.equals(ns, ns2);
//		System.out.println(equals);
		
		//输出数组信息
//		String nsStr = Arrays.toString(ns);
//		System.out.println(nsStr);
		
		//将指定的数值填充到数组中
//		Arrays.fill(ns, 100);
//		System.out.println(Arrays.toString(ns));
		
		//对数组中的内容进行排序
		Arrays.sort(ns);
		System.out.println(Arrays.toString(ns));
		
		//二分法查找 - 使用前必须先排序 - 如果找不到会返回负数
		int index = Arrays.binarySearch(ns, 4);
		System.out.println(index);
	}
}
