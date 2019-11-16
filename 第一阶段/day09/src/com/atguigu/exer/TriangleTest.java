package com.atguigu.exer;

public class TriangleTest {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(3, 5);
		triangle.findArea();
	}
}

/*
3.编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，
同时声明公共方法访问私有变量。此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
*/

class Triangle{
	
	private int base;
	private int height;
	
	//构造器
	public Triangle(int b,int h){
		base = b;
		height = h;
	}
	
	/**
	 * 计算三角开有的面积
	 *
	 */
	public void findArea(){
		System.out.println(base * height / 2);
	}
	
	public void setBase(int b){
		base = b;
	}
	
	public void setHeight(int h){
		height = h;
	}
}
