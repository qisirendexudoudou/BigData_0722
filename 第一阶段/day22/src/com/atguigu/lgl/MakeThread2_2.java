package com.atguigu.lgl;

// 创建线程的方式之二：  实现Runnable接口


class TestLuo4 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ "--" + i);
		}
	}
}

public class MakeThread2_2 {

	public static void main(String[] args) {
		//主线程
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ "++" + i);
		}
		
		
		//普通
		TestLuo4 testLuo4 = new TestLuo4();
		Thread thread = new Thread(testLuo4);
		thread.start();
		
		//匿名对象
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+ "==" + i);
				}
			}
		}).start();

	}
}
