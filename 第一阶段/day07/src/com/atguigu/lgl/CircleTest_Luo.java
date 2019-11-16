package com.atguigu.lgl;

// 求圆的周长和面积
public class CircleTest_Luo {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.ban = 1;
		System.out.println(c1.mianji());
		System.out.println(c1.zhouchang());
	}

}

class Circle{
	public double ban;
	
	public double mianji(){
		return Math.PI * ban * ban;
	}
	
	public double zhouchang(){
		return Math.PI * 2 * ban;
	}
}
