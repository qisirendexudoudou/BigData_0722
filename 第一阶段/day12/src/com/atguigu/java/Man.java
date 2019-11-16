package com.atguigu.java;

/*
 * 子类
 */
public class Man extends Person {

	@Override
	public void show() {
		System.out.println("男人脱掉上衣露出胸肌就这么show");
	}
	
	@Override
	public void say() {
		System.out.println("男人凶狠的说话");
	}
	
	/*
	 * 独有的方法
	 */
	public void smoking(){
		System.out.println("男人不抽烟，女生不喜欢");
	}
}
