package com.atguigu.java;

/*
 * 子类
 */
public class Woman extends Person {

	String name = "woman name";
	
	@Override
	public void show() {
		System.out.println("女生露出美腿美美的show");
	}
	
	@Override
	public void say() {
		System.out.println("女生说话很温柔");
	}
	
	/*
	 * 子类独有的方法
	 */
	public void buy(){
		System.out.println("女生逛街买买买");
	}
}









