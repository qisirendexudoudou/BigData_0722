package com.atguigu.exer2;

/*
 	杨辉三角：
 	
 	
 */
public class YangHui {

	public static void main(String[] args) {
		
		//创建二维数组
		int[][] numbers = new int[10][];
		//给二维数组的元素赋值
		for (int i = 0; i < numbers.length; i++) {
			//创建二维数组的元素（一维数组）
			numbers[i] = new int[i + 1];
			//给二维数组中的元素的第一个元素和最后一个元素赋值
			numbers[i][0] = numbers[i][i] = 1;
			
			//遍历二维数组中的元素（一维数组），不包括第一个和最后一个
			for (int j = 1; j < numbers[i].length - 1; j++) {
				numbers[i][j] = numbers[i - 1][j] + numbers[i - 1][j - 1];
			}
		}
		
		//遍历二维数组
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
