package com.atguigu.lgl;

/*
 	数组的反转
  */

public class ArrayAlgorithm_Luo2 {

	public static void main(String[] args) {
		
		//fangshiyi
		int[] a = {1,2,3,4,5,6,7};//a.length=7
		for (int i = 0,j=a.length-1; i < a.length/2; i++,j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		
		System.out.println("****************************");
		
		
		//方式二:创建新数组
		int[] b = {1,2,3,4,5,6,7};//a.length=7
		int[] s = new int[b.length];//a.length=7
		for (int i = b.length-1; i >=0; i--) {
			s[b.length-i-1] = b[i];
		}
	
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		
		
	}
}
