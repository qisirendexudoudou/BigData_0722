package com.atguigu.exer2;

import java.util.Arrays;

/*
    3.查找(线性查找、二分法查找(了解))

	4. 数组元素的排序算法
 */
public class ArrayAlgorithm2 {

	public static void main(String[] args) {
		
		int[] numbers = {1,10,9,8,20};
		
		//线性查找
		int findNumber = 18; //要查找数值
		int index = -1;//要查找的数值所在的索引位置
		for (int i = 0; i < numbers.length; i++) {
			if(findNumber == numbers[i]){
				index = i;
				break;//只找一个
			}
		}
		//判断是否找到了
		if(index == -1){
			System.out.println("亲，没有找到您要的商品哦");
		}else{
			System.out.println("您要的商品在:" + index);
		}
		
		
	}
}
