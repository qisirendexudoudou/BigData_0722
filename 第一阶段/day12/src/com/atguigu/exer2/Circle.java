package com.atguigu.exer2;

public class Circle extends GeometricObject{

	private double radius;
	
	//通过构造器给属性赋值-包括父类的属性
	public Circle(double radius,String color, double weight){
		super(color, weight);//调用父类的构造器给属性赋值
		this.radius = radius;
	}
	
	@Override
	public double findArea() {
		
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
