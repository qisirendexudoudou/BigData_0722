package com.atguigu.java;

import java.util.Arrays;

/*
 * 有时间就看一下，没时间就算了
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] number = { 12, 30, -5, 6, 9, 10, 5 };
		
		//排序
		Arrays.sort(number); // 必须排序好

		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

		int findNumber = 12; // 要查找的内容
		int start = 0;
		int end = number.length - 1;
		int index = -1; // 所在的元素位置
		while (start <= end) {
			int mid = (start + end) / 2;
			if (number[mid] == findNumber) {
				index = mid;
				break;
			} else if (number[mid] < findNumber) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		if (index == -1) {
			System.out.println("没有找到您需要的内容");
		} else {
			System.out.println("元素所在的位置" + index);
		}
		
	}
}
