package com.atguigu.lgl;

// maopaopaixu
public class BubbleSort_Luo2 {
	public static void main(String[] args) {
		int[] a = {12,43,23,45,67,75,6};
		
		for (int i = 0; i < a.length-1; i++) {//轮数
			for (int j = 0; j < a.length-i-1; j++) {//每轮次数
				if (a[j]>a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}

}
