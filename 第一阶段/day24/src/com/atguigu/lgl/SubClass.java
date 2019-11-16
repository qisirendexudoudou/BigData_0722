package com.atguigu.lgl;

public class SubClass extends SuperClass {

	public String subdesPublic;
	private int subscorePrivate;
	
	
	public SubClass(){
//		System.out.println("SubClass()");
	}
	
	public SubClass(int a){
		System.out.println("SubClass(int a)");
	}
	
	public SubClass(int a,int b,int c){
		System.out.println("SubClass(int a,int b,int c)");
	}
	
	public void info(){
		System.out.println("public - info");
	}
	
	private void info2(){
		System.out.println("private - info");
	}
	
	public int getSubScorePrivate(){
		return this.subscorePrivate;
	}
	
	
	
}
