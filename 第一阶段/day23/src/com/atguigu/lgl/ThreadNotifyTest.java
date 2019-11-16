package com.atguigu.lgl;

import javax.swing.plaf.SliderUI;

//线程的通信
public class ThreadNotifyTest {

	public static void main(String[] args) {
		MyRun mr = new MyRun();
		
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);
		
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}


class MyRun implements Runnable{

	@Override
	public void run() {
		
		synchronized (this) {
			
		notify();
		System.out.println(Thread.currentThread().getName());
		
		try {
			wait();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "------结束-----");
		}
	}
	
}