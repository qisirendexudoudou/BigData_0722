package com.atguigu.java3;

//在类的内部任何权限修饰符修饰的属性方法都可以访问
public class Person {

	private String namePrivate;
	String name;
	public String namePublic;
	
	public void sayPublic(){
		System.out.println("sayPublic");
	}
	
	private void sayPirvate(){
		System.out.println("sayPrivate");
	}
	
	void say(){
		System.out.println("say");
	}
	
	//-------------------------
	
	public void test(){
		System.out.println(namePrivate);
		System.out.println(name);
		System.out.println(namePublic);
		sayPublic();
		sayPirvate();
		say();
	}
}
