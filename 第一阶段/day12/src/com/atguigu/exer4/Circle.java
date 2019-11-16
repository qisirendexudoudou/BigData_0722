package com.atguigu.exer4;

public class Circle extends GeometricObject {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public Circle(String color, double weight,double radius) {
		super(color, weight);
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * 求圆的面积
	 * @return
	 */
	public double findArea(){
		return Math.PI * radius * radius;
	}
	
	/**
	 * 比较圆的半径
	 */
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Circle){
			//向下转型
			Circle c = (Circle) obj;
			return c.radius == this.radius;
		}
		return super.equals(obj);
	}
	
	/**
	 * 输出圆的半径
	 */
	@Override
	public String toString() {
		return "radius=" + radius;
	}
	
	
	
}
