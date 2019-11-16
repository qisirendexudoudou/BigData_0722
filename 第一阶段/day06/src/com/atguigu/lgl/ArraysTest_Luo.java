package com.atguigu.lgl;

import java.util.Arrays;

// array工具类
public class ArraysTest_Luo {
	public static void main(String[] args) {
		int[] a = {1,3,7,8,5,3,8,5};
		int[] b = {1,3,5,7,9};
		
//		Arrays.equals(a, b);
		System.out.println(Arrays.equals(a,b));
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		Arrays.fill(b, 10);
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.binarySearch(a, 7));
		
	}
}
