package com.atguigu.exer;

public class Demo3 implements AA,BB{

	@Override
	public void play() {
		System.out.println("demo2 play");
	}
	
	public static void main(String[] args) {
		
		test(new Demo3());
		test2(new Demo3());
	}
	
	public static void test(AA aa){
		aa.play();
	}
	
	public static void test2(BB bb){
		bb.play();
	}

}

interface AA{
	void play();
}

interface BB{
	void play();
}
