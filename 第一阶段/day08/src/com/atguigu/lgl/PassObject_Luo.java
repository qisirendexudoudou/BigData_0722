package com.atguigu.lgl;

import java.security.Signature;

/*
	（2）定义一个类PassObject，在类中定义一个方法printAreas()，
	该方法的定义如下：public void printAreas(Circle c, int time)
在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。

*/
public class PassObject_Luo {
	public static void main(String[] args) {
		PassObject_Luo luo1 = new PassObject_Luo();
		Circle a = new Circle();
		luo1.printAreas(a,5);
	}
	
	public void printAreas(Circle c, int time){
		System.out.println("Radius\tArea");
		int i = 1;
		for (; i <= time; i++) {
			c.setRadius(i);
			System.out.println(c.getRadius()+"\t" + c.findArea());
		}
		c.setRadius(6);
		System.out.println("now Radius is : " + c.getRadius());
	}
}

