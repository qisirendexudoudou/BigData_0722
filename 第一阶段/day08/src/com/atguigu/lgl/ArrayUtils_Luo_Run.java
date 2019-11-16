package com.atguigu.lgl;

import java.util.Arrays;

public class ArrayUtils_Luo_Run {

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

}
