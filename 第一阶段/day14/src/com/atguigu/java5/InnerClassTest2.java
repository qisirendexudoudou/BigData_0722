package com.atguigu.java5;


interface MyInterface{
	void demo();
}


public class InnerClassTest2 {

	public static void main(String[] args) {
		
		/*
		 * 因为该类的对象只是在该方法中使用，所以将该类放入到该方法中更合理
		 */
//		class MyNewClass implements MyInterface{
//
//			@Override
//			public void demo() {
//				System.out.println("我是demo我就这么牛");
//			}
//		}
		
		/*
		 * 匿名内部类。
		 */
		new MyInterface(){

			@Override
			public void demo() {
				System.out.println("我是demo我就这么牛");
			}
		};

	}
}
