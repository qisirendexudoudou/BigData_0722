package com.atguigu.lgl2;

import javax.xml.crypto.Data;

public class Circle extends GeometricObject{
	
	public static void main(String[] args) {
		Circle c1 = new Circle(2.0, "yellow", 1.0);
		System.out.println(c1.equals(new Circle(2.0, "bule", 2.0)));
		
		System.out.println(c1.toString());
		System.out.println(new Circle(1.0).toString());
	}

	private double radius;
/**
 * radius属性的setter和getter方法
public double findArea()：计算圆的面积
public boolean equals(Object obj)
public String toString()
	
 */
	public double findArea(){
		return Math.PI * radius * radius;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (this == arg0) {
			return true;
		}
		
		if (arg0 instanceof Circle) {
			Circle cc = (Circle) arg0;
			return this.findArea() == cc.findArea();
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "radius = " + radius;
	}
	
	
	public Circle(){
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius,String color, double weight) {
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
