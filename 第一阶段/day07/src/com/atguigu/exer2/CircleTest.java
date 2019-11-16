package com.atguigu.exer2;

/*
 * 利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
class Circle{
	
	public double radius;//半径
	
	/**
	 * 求面积 ： 
	 * 思考 ：1.该方法需不需要返回值    2.该方法需不需要形参
	 * 
	 * 思考：需不需要返回值？需不需使用这个结果去做其它的运算
	 * 思考 ：该方法需不需要形参？需不需要方法的调用者给传数据。
	 */
	public void findArea(){
		System.out.println(Math.PI  * radius * radius);
	}
	
	
	public void zhouChang(){
		System.out.println(Math.PI * 2 * radius);
	}
	
	//设计不合理 ：同一个圆的周长或面积它们的半径应该都是一样的。
	public void findArea2(double r){
		System.out.println(Math.PI * r * r);
	}
}


public class CircleTest {

	public static void main(String[] args) {

		Circle circle = new Circle();
		//调用无参的方法
		circle.radius = 1;
		circle.findArea();
		circle.zhouChang();
		//调用有参的方法
		circle.findArea2(1);
	}
	
	public void add(int a,int b){
		System.out.println(a + b);
	}
}
