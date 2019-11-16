package com.atguigu.java4;

/**
 * 
 * 解决线程安全问题的方式 ：
 * 
 * 方式一 ： 同步代码块
 * 
 * 格式 ：synchronized (同步监视器、同步锁) 
 * 		 { 
 * 			操作共享数据的代码。
 * 		 } 
 * 		1.同步监视器可以是任意类的对象。所有的线程应该使用同一把锁。
 * 		2.继承Thread的方式同步监视器不能使用this,实现Runnable的方式同步监视器可以使用this
 * 
 * 方式二 ： 同步方法
 * 		
 * 
 */
public class TickBlockTest {
	public static void main(String[] args) {

		/*
		MyRun mr = new MyRun();
		// 开启三个窗口
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);

		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		// 启动线程
		t1.start();
		t2.start();
		t3.start();
		*/
		
		System.out.println("--------------------继承Thread---------------------------");
		
		MyThr t1 = new MyThr();
		MyThr t2 = new MyThr();
		MyThr t3 = new MyThr();
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		// 启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}

class MyThr extends Thread {

	// 票 - 共享资源
	private static int tick = 100; //多个对象共同拥有一份类变量
	private static Object obj = new Object();
	
	@Override
	public void run() {

		while (true) {
			synchronized (MyThr.class) {
				if (tick > 0) {
					// 卖票
					System.out.println(Thread.currentThread().getName() + "=====" + tick);
					tick--;
				} else {
					return;
				}
			}
		}

	}

}

class MyRun implements Runnable {

	// 票 - 共享资源
	private int tick = 1000;

	@Override
	public void run() {

		while (true) {

			synchronized (this) {
				if (tick > 0) {
					// 卖票
					System.out.println(Thread.currentThread().getName() + "=====" + tick);
					tick--;
				} else {
					return;
				}

			}

		}

	}

}