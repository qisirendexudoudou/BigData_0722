package com.atguigu.lgl3;

public class Kids extends ManKind {
	int yearsOld;
	
	public void printAge(){
		System.out.println("yearsold = " + yearsOld);
	}
	
	public void employeed(){
		super.employeed();
//		System.out.println("Kids should study and no job.");
		System.out.println("but Kids should study and no job.");
	}
}