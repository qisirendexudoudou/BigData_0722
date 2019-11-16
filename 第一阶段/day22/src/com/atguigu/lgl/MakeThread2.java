package com.atguigu.lgl;

/**
 * 创建线程的方式之二：  实现Runnable接口
 
1）写一个具体类，实现Runnable接口。在类中实现   Runnable接口中的run方法。
2)创建这个类的对象 将对象作为实际参数传递给Thread类的构造方法中, 创建线程对象。
3）调用线程对象的start方法：开启线程，调用Runnable接口子类的run方法。
 */


class TestLuo2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+ "===" + i);
		}
	}
	
}

public class MakeThread2 {
	public static void main(String[] args) {
		//普通创建对象
		TestLuo2 tl2 = new TestLuo2();
		Thread td1 = new Thread(tl2);
		td1.start();
		
		//创建匿名内部类
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <=100; i++) {
					System.out.println(Thread.currentThread().getName()+"+++" + i);
				}
			}
		}).start();
		
		//主线程
		for (int i = 0; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+"---" + i);
		}

	}
}
