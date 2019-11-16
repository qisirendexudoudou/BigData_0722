package com.atguigu.lgl;

// 两个线程交替打印100 - 1
public class Make100_1 {
	public static void main(String[] args) {
		MyRun2 mr2 = new MyRun2();
		
		Thread t1 = new Thread(mr2);
		Thread t2 = new Thread(mr2);
		
		t1.setName("窗口1");
		t2.setName("窗口2");
		
		t1.start();
		t2.start();
	}

}

class MyRun2 implements Runnable{
	private int number = 1;
	Make100_1 m1 = new Make100_1();
	

	@Override
	public void run() {
		while (true) {
		synchronized (m1) {
			m1.notify();
			if (number <= 100) {
				System.out.println(Thread.currentThread().getName() + "---" +number);
				number++;				
				try {
					m1.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				return;
		}
		}

	}
	}
}