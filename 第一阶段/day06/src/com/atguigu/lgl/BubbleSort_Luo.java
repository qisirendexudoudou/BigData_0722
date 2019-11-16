package com.atguigu.lgl;

//冒泡排序
public class BubbleSort_Luo {

	public static void main(String[] args) {
		
		int[] a = {23,13,34,24,56,74,35};//a.length=7
		
		for (int i = 0; i < a.length-1; i++) {//比较轮数
			for (int j = 0; j < a.length-i-1; j++) {//比较每轮的次数
				if (a[j] > a[j+1]) {
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
