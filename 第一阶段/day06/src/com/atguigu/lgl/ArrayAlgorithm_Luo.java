package com.atguigu.lgl;

/*
	数组中常见的算法：
 	
	2. 求数值型数组中元素的最大值、最小值、平均数、总和等

	3. 数组的复制、反转、查找(线性查找、二分法查找(了解))


*/

public class ArrayAlgorithm_Luo {
	public static void main(String[] args) {
		
		//求数值型数组中元素的最大值、最小值、平均数、总和等
		int[] num = {10,30,50,40,60,70,80,20,100,310};
		int sum = 0;
		int min = num[0];
		int max = num[0];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
	
		for (int i = 1; i < num.length; i++) {
			if ( num[i] < min) {
				min = num[i];
			} 
			
			if ( num[i] > max){
				max = num[i];
			}
		}
		
		System.out.println("sum = " + sum);
		System.out.println("arg = " + sum/num.length);
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		System.out.println("-------------------------------------");
		
		//复制的两种情况
		int[] a = num;
		for (int i = 0; i < a.length; i++) {
			a[i] = num[i];			
		}		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("-------------------------------------");
		
//		a[0] = 111;
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);		
//		}
//		
//		System.out.println("-------------------------------------");
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//			
//		}
		
		a = new int[3];
		a[0] = 222;
		System.out.println("--------new一个变量后再修改值a[0]，查看a-----------------------------");
		
		a[0] = 111;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);		
		}
		
		System.out.println("---------new一个变量后再修改值a[0]，查看num----------------------------");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		
		
	}
}
