package com.atguigu.exer3;

public class Circle {

	private double radius;
	
	public Circle(){
		radius = 1;
	}
	
	/**
	 * 求圆的面积
	 * @return
	 */
	public double findArea(){
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
