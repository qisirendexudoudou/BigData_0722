package com.atguigu.exer;



public class DebugTest {

	public static void main(String[] args) {
		
		DebugTest dt = new DebugTest();
		
		System.out.println("ccc");
		dt.show();
		System.out.println("ddd");
	}
	
	public void show(){
		int a = 10;
		int b = 1 + 5;
		int c = a + b;
		System.out.println(c);
	}
}
