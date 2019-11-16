package com.atguigu.java2;

/*
 	值传递 ：
 	
 	
 */
class Number {
	int m;
	int n;
}

public class ValueTransferTest2 {

	public static void main(String[] args) {
		ValueTransferTest2 vtf = new ValueTransferTest2();
		
		// 创建对象
		Number number = new Number();
		number.m = 10;
		number.n = 5;
		//调用方法交换数据
		vtf.swapData(number);
		//输出交换后的数据
		System.out.println("main number.m=" + number.m + " number.n=" + number.n);

	}

	/**
	 * 交换数据
	 */
	public void swapData(Number number) {
		// 需求 ：交换number对象中的m和n的值
		int temp = number.m;
		number.m = number.n;
		number.n = temp;
	}

}
