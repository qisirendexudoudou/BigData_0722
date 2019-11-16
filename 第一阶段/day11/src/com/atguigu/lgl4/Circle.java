package com.atguigu.lgl4;

public class Circle {
	
	private double radius;

	public Circle() {
//		radius = 1;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findAre(){
		return Math.PI * radius * radius;
	}

}
