package com.atguigu.lgl;

/**
 * 创建线程的方式之一：  继承Thread类
 1)  写一个类继承Thread并重写Thread类中的run方法
 2)  创建Thread子类对象，即创建了线程对象。
 3)  调用线程对象start方法：启动线程，调用run方法。

 */

class TestLuo extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+ "===" + i);
		}
	}
}

public class MakeThread1 {

	public static void main(String[] args) {
		
		//普通创建Thread子类的对象
		TestLuo t1 = new TestLuo();
		t1.start();

		//创建Thread子类的匿名内部类
		new TestLuo(){
			public void run() {
				for (int i = 0; i <=100; i+=2) {
					System.out.println(Thread.currentThread().getName()+"+++" + i);
				}
			};
		}.start();
		
		//主线程
		for (int i = 0; i <= 100; i+=2) {
			System.out.println(Thread.currentThread().getName()+"---" + i);
		}
	}
}

