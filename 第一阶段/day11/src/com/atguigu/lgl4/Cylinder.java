package com.atguigu.lgl4;

public class Cylinder extends Circle {

	private double longth;

	public Cylinder() {
		longth = 1;
	}

	public double getLongth() {
		return longth;
	}

	public void setLongth(double longth) {
		this.longth = longth;
	}
	
	//求面积
	public double mj(){
		return super.findAre();
	}
	
	//求体积
	public double findVolume(){
		return super.findAre() * longth;
	}
	
	//求表面积
	public double findAre(){
		return Math.PI * super.getRadius() * 2 * longth  + super.findAre() * 2;
	}
	
	
}
