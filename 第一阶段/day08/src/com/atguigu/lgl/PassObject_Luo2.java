package com.atguigu.lgl;
/*（1）定义一个Circle类，
	包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
       （2）定义一个类PassObject，在类中定义一个方法printAreas()，
	该方法的定义如下：public void printAreas(Circle c, int time)
	在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
	例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。*/
public class PassObject_Luo2 {
	public static void main(String[] args) {
		PassObject_Luo3 luo1 = new PassObject_Luo3();
		luo1.printAreas(new Circle(), 5);
	}

}
class Circle2{
	private double radius;
	
	public void setRadius(double r){
		radius = r;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double findArea(){
		return Math.PI * radius * radius;
	}
}

class PassObject_Luo3{
	
	public void printAreas(Circle c, int time){
		System.out.println("Radius\tArea");
		int i = 1;
		for (; i <= time; i++) {
			c.setRadius(i);
			System.out.println(c.getRadius() + "\t" + c.findArea());
		}
		c.setRadius(i);
		System.out.println("now Radius = " + c.getRadius());
	}
}