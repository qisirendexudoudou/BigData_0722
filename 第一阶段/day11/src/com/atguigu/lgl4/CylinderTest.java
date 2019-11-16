package com.atguigu.lgl4;

//附加题：在CylinderTest类中创建一个Circle类的对象，设置圆的半径，计算输出圆的面积。体会父类和子类成员的分别调用。


public class CylinderTest {
	
	public static void main(String[] args) {
		
		System.out.println("-----Cylinder类中---------------");
		Cylinder Cylinder = new Cylinder();
		Cylinder.setRadius(2);
		Cylinder.setLongth(2);
		double r = Cylinder.getRadius();
		double h = Cylinder.getLongth();
		System.out.println("圆的半径 = " + r );
		System.out.println("圆的高 =  " + h );
		System.out.println("圆的面积 = " + Cylinder.mj());	
		System.out.println("圆的体积 = " + Cylinder.findVolume());


		System.out.println("--------circle类中-------------");
		Circle circle = new Circle();
		circle.setRadius(2);
		System.out.println("圆的半径 = " + circle.getRadius());
		System.out.println("圆的面积 = " + circle.findAre());
		
		
		
	}

}
