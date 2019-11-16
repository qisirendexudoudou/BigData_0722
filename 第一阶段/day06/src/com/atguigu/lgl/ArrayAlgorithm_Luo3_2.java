package com.atguigu.lgl;


// 查找数
public class ArrayAlgorithm_Luo3_2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int findnum = 3;
		int index = -1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == findnum) {
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("no");
		} else {
			System.out.println("yse,  at " + index);
		}
	}
}
