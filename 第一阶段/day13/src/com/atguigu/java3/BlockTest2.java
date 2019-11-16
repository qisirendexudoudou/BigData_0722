package com.atguigu.java3;

public class BlockTest2 {

	public static void main(String[] args) {
		
		new A(); //每创建一个对象就有一个数组
		System.out.println(new A().numbers2.length);
		
	}
}

class A{
	
	int[] numbers = new int[5];
	
	//多个对象共同拥有一份该数组
	static int[] numbers2;
	
	static{
		numbers2 = new int[10];
	}
	
}
