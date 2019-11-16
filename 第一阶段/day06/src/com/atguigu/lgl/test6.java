package com.atguigu.lgl;

/*
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 然后求出所有元素的最大值，最小值，平均值，和值，查找 并输出出来。
 */
import java.util.*;
public class test6 {
	public static void main(String[] args) {

		
		Random ra =new Random();
		int[] a = new int[10];
		double sum = 0;

//		double arg = 0;
		
		for(int i=0;i<a.length;i++){
			a[i] = ra.nextInt(1000);	
			System.out.println(a[i]);	
			sum += a[i];
		}
		
		double max = a[0];
		double min = a[0];
		for (int j = 0; j < a.length; j++) {
			if (a[j] > max){
				max = a[j];
			}
			
			if (a[j] < min ){
				min = a[j];
			}	
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("-------------------");
		System.out.println("sum = " + sum);
		System.out.println("-------------------");
		System.out.println("arg = " + (sum/(a.length)));
		System.out.println("-------------------");
		System.out.println("max = " + max);
		System.out.println("-------------------");
		System.out.println("min = " + min);
	}
}
