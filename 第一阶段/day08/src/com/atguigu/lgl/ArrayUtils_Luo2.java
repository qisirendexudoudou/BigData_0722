package com.atguigu.lgl;

import java.util.Arrays;

public class ArrayUtils_Luo2 {
	public static void main(String[] args) {
		int[] numbers1 = {3,1,7,9,5,11};
		ArrayUtils_Luo run2 = new ArrayUtils_Luo();
		System.out.println(run2.maxNumber(numbers1));
		System.out.println(run2.minNumber(numbers1));
		System.out.println(run2.sum(numbers1));
		System.out.println(run2.ever(numbers1));
		System.out.println(Arrays.toString(run2.copyNumber(numbers1)));
		System.out.println(Arrays.toString(run2.fanzhuan(numbers1)));
		System.out.println(run2.findNumber(numbers1,9));
		System.out.println(Arrays.toString(run2.sort(numbers1,true)));
		System.out.println(Arrays.toString(run2.sort(numbers1,false)));
	
	}
	//排序
	public int[] sort(int[] a,boolean boo){
		if (boo){
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if (a[j] > a[j+1]) {
					int tmpe = a[j];
					a[j] = a[j+1];
					a[j+1] = tmpe;
				}
			}
		}
		}else {
			for (int i = 0; i < a.length-1; i++) {
				for (int j = 0; j < a.length-i-1; j++) {
					if (a[j] < a[j+1]) {
						int tmpe = a[j];
						a[j] = a[j+1];
						a[j+1] = tmpe;
				}
			}
		}
		}
		return a;
	}
	
	//查找
	public int findNumber(int[] a,int b){
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if ( a[i] == b) {
				index = i;
			}
		}
		return index;
	}
	
	//反转
	public int[] fanzhuan(int[] a){
		for (int i = 0,j=a.length-1; i < a.length/2; i++,j--) {
			int tmpe = a[i];
			a[i] = a[j];
			a[j] = tmpe;
		}
		return a;
	}
	
	//复制
	public int[] copyNumber(int[] a){
		int[] copyNumber = new int[a.length];
		for (int i = 0; i < copyNumber.length; i++) {
			copyNumber[i] = a[i];
		}
		return copyNumber;
	}
	
	//求平均值
	public int ever(int[] a){
		return sum(a)/a.length;
		
	}
	
	//求和
	public int sum(int[] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	//最小值
	public int minNumber(int[] a){
		int minNum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < minNum) {
				minNum = a[i];
				}
		}
		return minNum;
	}		
	
	//最大值
	public int maxNumber(int[] a){
		int maxNum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxNum) {
				maxNum = a[i];
			}
		}
		return maxNum;
	}	
}
