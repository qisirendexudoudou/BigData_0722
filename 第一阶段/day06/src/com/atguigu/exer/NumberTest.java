package com.atguigu.exer;

/*
 	输入10个元素（10——99范围），保存到数组中，查找里面是否有>80，如果有，显示有，否则提示没有

 */
public class NumberTest {

	public static void main(String[] args) {
		
		//创建一个数组用来保存数据
		int[] numbers = new int[10];
		
		//将随机值存放到数组中
		for (int i = 0; i < numbers.length; i++) {
			/*
			 	random() : 随机返回一个double值 [0.0,1.0)
			 */
			//随机生成数（10-99）存放到数组中
			int number = (int)(Math.random() * 90 + 10);
			numbers[i] = number;
		}
		
		//挑出大于80的数
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > 80){
				System.out.println(numbers[i]);
			}
		}
	}
}
