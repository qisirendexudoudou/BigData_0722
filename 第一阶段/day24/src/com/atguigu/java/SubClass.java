package com.atguigu.java;

@MyAnn(age = 1)
public class SubClass extends SuperClass {

	private int sbScorePrivate;
	
	@MyAnn(age = 2)
	public String sbStreetPublic;
	
	public SubClass(){
		System.out.println("SubClass()");
	}
	
	public SubClass(int a){
		System.out.println("SubClass(int a)");
	}

	private SubClass(int a,int c){
		System.out.println("SubClass(int a,int c)");
	}
	
	@MyAnn(age = 3)
	public void showAnnotation(){
		
	}
	
	public void sbinfoPublic(String n,int s){
		System.out.println("sbinfoPublic" + "=====" + n + "==========" + s);
	}
	
	private void sbinfoPrivate(){
		System.out.println("sbinfoPrivate");
	}
	
	public int getSbScorePrivate(){
		return this.sbScorePrivate;
	}
}
