package com.atguigu.java2;

public class ThisTest2 {

	public static void main(String[] args) {
		
		A a = new A();
		A a2 = new A();
		System.out.println(a); //输出的是对象的地址值
		a.say();
		
		System.out.println("--------------------------------------------");
		
		System.out.println(a2);//输出的是对象的地址值
		a2.say();
	}
}

class A{
	
	//谁调用的方法this就是谁
	public void say(){
		System.out.println("this====" + this);
	}
}
