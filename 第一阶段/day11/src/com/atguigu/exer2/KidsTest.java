package com.atguigu.exer2;

public class KidsTest {

	public static void main(String[] args) {
		/*
		 * 定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法
		 */
		Kids someKid = new Kids();
		//访问父类中的属性
		someKid.sex = 1;
		someKid.salary = 1000;
		
		someKid.employeed();
		someKid.manOrWoman();
		
		
		//调用本类中的属性和方法
		someKid.yearsOld = 3;
		someKid.printAge();
		
	}
}
