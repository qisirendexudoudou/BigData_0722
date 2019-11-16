package com.atguigu.java;

/*
 	冒泡排序 : 必须会手写
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] numbers = {10,2,89,39,16};
		
		//外层循环控制比较几轮
		for (int i = 0; i < numbers.length - 1; i++) {
			
			//内层循环控制每轮的次数
			for (int j = 0; j < numbers.length - i - 1; j++) {
				
				//比较
				if(numbers[j] > numbers[j + 1]){
					//交换数据
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		
		//遍历数组
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
