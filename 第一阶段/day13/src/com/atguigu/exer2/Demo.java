package com.atguigu.exer2;

public class Demo {
	
	static{
		System.out.println("static block");
	}
	
	{
		System.out.println("block");
	}

	public Demo(){
		System.out.println("cccc");
	}
	
	public static void main(String[] args) {
		new Demo();
	}
	
	static Demo demo = new Demo();
}
