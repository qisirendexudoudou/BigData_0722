package com.atguigu.java3;

import java.util.concurrent.locks.ReentrantLock;

public class TickBlockTest {
	public static void main(String[] args) {

		
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
		

		
		
	}
}


class MyRun implements Runnable {

	// 票 - 共享资源
	private int tick = 100;
	private ReentrantLock lock = new ReentrantLock();

	@Override
	public void run() {

		while (true) {

			lock.lock(); //上锁
			try{
				if (tick > 0) {
					// 卖票
					System.out.println(Thread.currentThread().getName() + "=====" + tick);
					tick--;
				} else {
					return;
				}
			}finally{
				lock.unlock();//解锁
			}

		}

	}

}