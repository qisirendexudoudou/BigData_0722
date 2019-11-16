package com.atguigu.lgl;

//抽象类和抽象方法（关键字：abstract）
public class AbstractTest {

	public static void main(String[] args) {
		Circle circle = new Circle(2.0);
		System.out.println(circle.findAra());
	}
}


abstract class GeometricObject {
	public abstract  double findAra();
}

class Circle extends GeometricObject{

	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double findAra() {
		return Math.PI * radius * radius;
	}
	
}

