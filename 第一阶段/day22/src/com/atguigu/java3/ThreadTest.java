package com.atguigu.java3;

public class ThreadTest {

	public static void main(String[] args) {
		
		Thread t = new Thread(){
			@Override
			public void run() {
				System.out.println("线程1");
			}
		};
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				System.out.println("线程2");
			}
		};
		
		t.start();
		t2.start();
	}
}