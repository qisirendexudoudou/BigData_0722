package com.atguigu.exer4;

public class Test {

	public static void main(String[] args) {
		
		Circle c = new Circle("red", 1.0, 1.0);
		Circle c2 = new Circle("blue", 2.0, 1.0);
		
		boolean equals = c.equals(c2);
		System.out.println(equals);
		
		System.out.println(c); // 默认调用toString方法
		System.out.println(c2);// 默认调用toString方法
		
	}
}
