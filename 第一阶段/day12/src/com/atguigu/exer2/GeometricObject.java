package com.atguigu.exer2;

public class GeometricObject {

	protected String color;
	protected double weight;
	
	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	
	/*
	 * findArea()
	 */
	public double findArea(){
		return 0; //无法求面积的 - 思考：即然不能运算那这个方法还有必要定义吗？有 - 因为需要构成多态
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
