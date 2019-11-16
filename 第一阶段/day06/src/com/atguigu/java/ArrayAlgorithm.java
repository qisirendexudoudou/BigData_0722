package com.atguigu.java;

/*
 	数组中常见的算法：
 	
 	2. 求数值型数组中元素的最大值、最小值、平均数、总和等

	3. 数组的复制、反转、查找(线性查找、二分法查找(了解))

	4. 数组元素的排序算法

 */
public class ArrayAlgorithm {

	public static void main(String[] args) {
		int[] numbers = {1,10,9,8,20};
//		求数值型数组中元素的最大值、最小值、平均数、总和等
		int maxNumber = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(maxNumber < numbers[i]){
				maxNumber = numbers[i];
			}
		}
		System.out.println("最大值：" + maxNumber);
		
		System.out.println("----------------------------总和 平均数---------------");
		
		int sum = 0;//总和
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("sum=" + sum + " aver=" +  sum / numbers.length);
		
		System.out.println("---------------------数组的复制-------------------");
		
		int[] copyNumber = new int[numbers.length];
		for (int i = 0; i < copyNumber.length; i++) {
			copyNumber[i] = numbers[i];
		}
		//修改copyNumber中的数据
		copyNumber[0] = 100;
		for (int i = 0; i < copyNumber.length; i++) {
			System.out.print(copyNumber[i] + " ");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		System.out.println("---------------------数组的反转1-------------------");
		
		//第一种方式 ：创建新的数组进行反转
		//创建数组
		int[] numbers2 = new int[numbers.length];
		//倒着遍历numbers
		for(int i = numbers.length - 1 ; i >=0; i--){
			numbers2[numbers.length - i - 1] = numbers[i];
		}
		//遍历numbers2
		for (int i = 0; i < numbers2.length; i++) {
			System.out.print(numbers2[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------数组的反转2-------------------");
		//第二种方式
		for(int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++,j--){
			//交换数据
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
		
		//遍历数组
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}



















