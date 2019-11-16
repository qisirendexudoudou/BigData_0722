package com.atguigu.exer4;

public class GeometricObject {

	protected String color;
	protected double weight;

	/*
	 * 对属性进行初始化
	 */
	public GeometricObject() {
		this.color = "white";
		this.weight = 1.0;
	}

	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
