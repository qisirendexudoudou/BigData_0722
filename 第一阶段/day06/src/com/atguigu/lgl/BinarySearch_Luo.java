package com.atguigu.lgl;

import java.util.Arrays;

//二分法
public class BinarySearch_Luo {
	public static void main(String[] args) {
		
		int[] a = {1,5,3,7,6,8,9,4,2};
		
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		int findnum = 9;
		int start = 0;
		int end = a.length-1;
		int index = -1;
		
		while (start <= end) {
			int mid = (start + end)/2;
			if (findnum == a[mid]) {
				index = mid;
				break;
			} else if(findnum > a[mid]) {
				start = mid + 1;
			}else{
				end = mid -1;
			}	
		}
			if (index == -1) {
				System.out.println("no index = " + index);
			} else {
				System.out.println("yes,at " + index);
			}
		
		
	}
}
