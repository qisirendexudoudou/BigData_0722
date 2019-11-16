package com.atguigu.exer2;

public class Kids extends ManKind {

	/*
	 * 定义类Kids继承ManKind，并包括
成员变量int yearsOld；
方法printAge()打印yearsOld的值。

	 */
	int yearsOld;
	
	public void printAge(){
		System.out.println(yearsOld);
	}
	
	@Override
	public void employeed() {
		super.employeed();
		System.out.println("but Kids should study and no job");
	}
	
}
