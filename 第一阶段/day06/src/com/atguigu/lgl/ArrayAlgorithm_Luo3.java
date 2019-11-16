package com.atguigu.lgl;


/*
  		3.查找(线性查找、二分法查找(了解))
*/
public class ArrayAlgorithm_Luo3 {
	public static void main(String[] args) {
		int[] a = {1,3,7,5,11,9,2,4};
		int findnum = 4;
		int index = -1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == findnum) {
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("meiyou");
		} else {
			System.out.println("you,at " + index);
		}
	}
}
