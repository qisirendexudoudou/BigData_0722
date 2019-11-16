package com.atguigu.lgl3;

/*
 * 在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
 */
public class KidsTest {

	public static void main(String[] args) {
		Kids kids = new Kids();
		
		kids.manOrWoman(0);
		kids.employeed();
		
	}
}
