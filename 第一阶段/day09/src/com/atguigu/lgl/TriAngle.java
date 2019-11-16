package com.atguigu.lgl;

/*
 		3.编写两个类，TriAngle和TriAngleTest，
 		其中TriAngle类中声明私有的底边长base和高height，
 		同时声明公共方法访问私有变量。
 		此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。

 */
public class TriAngle {

	private double base;
	private double height;
	
	public TriAngle(){
		base = 1.0;
		height = 1.0;
	}
	
	public void setValues(double a,double b){
		base = a;
		height = b;
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double s(){
		return (base * height)/2;
	}
	
}
