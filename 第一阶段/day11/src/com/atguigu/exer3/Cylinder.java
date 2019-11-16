package com.atguigu.exer3;

public class Cylinder extends Circle{

	/*
	 * -length:double

	 */
	private double length;
	
	public Cylinder(){
		length = 1;
	}
	
	/**
	 * 求圆柱的表面积 ：圆的面积 * 2 +侧面积
	 */
	@Override
	public double findArea() {
		
		return super.findArea() * 2 + 2 * Math.PI * getRadius() * length;
	}
	
	/**
	 * 求体积 : 注意只要调用父类中的方法全部显示的使用"super."
	 * @return
	 */
	public double findVolume(){
		return super.findArea() * length;
//		return  Math.PI * getRadius() * getRadius() * length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
}
