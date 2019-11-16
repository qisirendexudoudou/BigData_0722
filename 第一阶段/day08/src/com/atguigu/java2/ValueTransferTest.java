package com.atguigu.java2;

/*
 	值传递 ：
 	
 	说明：
 		1.在调用方法时如果传递的是基本数据类型，那么传递的是基本数据类型中具体的数据
 		2.在调用方法时如果传递的是引用数据类型，那么传递的是引用数据类型中的地址值
 */
public class ValueTransferTest {

	public static void main(String[] args) {
		ValueTransferTest vtf = new ValueTransferTest();
		
		//需求 ：交换两个变量的数据
		int m = 10,n = 5;
		//调用方法交换数据
		vtf.swapData(m, n);
		//输出结果
		System.out.println("main m=" + m + " n=" + n);
	}
	
	/**
	 * 交换数据
	 * @param m
	 * @param n
	 */
	public void swapData(int m,int n){
		System.out.println("swapData 交换前 m=" + m + " n=" + n);
		int temp = m;
		m = n;
		n = temp;
		System.out.println("swapData 交换后  m=" + m + " n=" + n);
	}
}
