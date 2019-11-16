package com.atguigu.java;

public class MethodTest2 {

	public static void main(String[] args) {
		
		MethodTest2 mt = new MethodTest2();
		mt.test();
	}
	
	public void test(){
		System.out.println("test");
//		test2();//调用本类中的其它方法。
		test(); //除了递归，别自己调用自己的方法会StackOverflowError
	}
	
	public void test2(){
		System.out.println("test2");
	}
}
