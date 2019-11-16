package com.atguigu.exer3;

/*
 * （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。

 */
public class Circle {

	private  double radius;
	
	/**
	 * 获取属性的值
	 */
	public void setRadius(double r){
		radius = r;
	}
	
	/**
	 * 获取属性的值
	 * @return
	 */
	public double getRadius(){
		return radius;
	}
	
	/**
	 * 求圆的面积
	 * @return
	 */
	public double findArea(){
		return Math.PI * radius * radius;
	}
}
