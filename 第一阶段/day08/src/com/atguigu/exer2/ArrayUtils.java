package com.atguigu.exer2;

import java.util.Arrays;

/*
 	封装数组中常见的算法
 */
public class ArrayUtils {

	public static void main(String[] args) {
		int[] numbers = { 10, 2, 30, 4, 5, 6 };

		ArrayUtils au = new ArrayUtils();
		// au.reverse(numbers);

		// int index = au.findNumber(numbers, 15);
		// System.out.println(index);

		au.sort(numbers,false);

		System.out.println(Arrays.toString(numbers));
	}

	/**
	 * 排序
	 */
	public void sort(int[] numbers, boolean boo) {
	
		if (boo) { //从小到大
			// 外层循环控制比较几轮
			for (int i = 0; i < numbers.length - 1; i++) {

				// 内层循环控制每轮的次数
				for (int j = 0; j < numbers.length - i - 1; j++) {

					// 比较
					if (numbers[j] > numbers[j + 1]) {
						// 交换数据
						int temp = numbers[j];
						numbers[j] = numbers[j + 1];
						numbers[j + 1] = temp;
					}
				}
			}
		} else {//从大到小
			// 外层循环控制比较几轮
			for (int i = 0; i < numbers.length - 1; i++) {

				// 内层循环控制每轮的次数
				for (int j = 0; j < numbers.length - i - 1; j++) {

					// 比较
					if (numbers[j] < numbers[j + 1]) {
						// 交换数据
						int temp = numbers[j];
						numbers[j] = numbers[j + 1];
						numbers[j + 1] = temp;
					}
				}
			}
		}
		
		
		/*
		 * 比上面的方式的效率低
			for (int i = 0; i < numbers.length - 1; i++) {

				// 内层循环控制每轮的次数
				for (int j = 0; j < numbers.length - i - 1; j++) {
					if(boo){
						// 比较
						if (numbers[j] > numbers[j + 1]) {
							
						
							// 交换数据
							int temp = numbers[j];
							numbers[j] = numbers[j + 1];
							numbers[j + 1] = temp;
						}
					}else{
						// 比较
						if (numbers[j] < numbers[j + 1]) {
							// 交换数据
							int temp = numbers[j];
							numbers[j] = numbers[j + 1];
							numbers[j + 1] = temp;
						}
					}
				}
			}
			*/
		
	}

	/**
	 * 线性查找 :如果没找到返回-1
	 */
	public int findNumber(int[] numbers, int findNumber) {
		int index = -1;// 要查找的数值所在的索引位置
		for (int i = 0; i < numbers.length; i++) {
			if (findNumber == numbers[i]) {
				index = i;
				break;// 只找一个
			}
		}
		return index;
	}

	/**
	 * 数组的反转 注意 ： 值传递（传的是地址值）
	 */
	public void reverse(int[] numbers) {
		for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
			// 交换数据
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
	}

	/**
	 * 数组的复制
	 */
	public int[] copyNumber(int[] numbers) {
		int[] copyNumber = new int[numbers.length];
		for (int i = 0; i < copyNumber.length; i++) {
			copyNumber[i] = numbers[i];
		}
		return copyNumber;
	}

	/**
	 * 求数组的平均值
	 */
	public int aver(int[] numbers) {
		return sum(numbers) / numbers.length;
	}

	/**
	 * 求数组所有元素的和
	 */
	public int sum(int[] numbers) {
		int sum = 0;// 总和
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	/**
	 * 获取数组中的最大值
	 */
	public int maxNumber(int[] numbers) {
		int maxNumber = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (maxNumber < numbers[i]) {
				maxNumber = numbers[i];
			}
		}
		return maxNumber;
	}

	/**
	 * 获取数组中的最小值
	 */
	public int minNumber(int[] numbers) {
		int minNumber = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (minNumber > numbers[i]) {
				minNumber = numbers[i];
			}
		}
		return minNumber;
	}
}
