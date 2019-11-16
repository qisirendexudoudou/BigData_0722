package com.atguigu.lgl2;

//同步代码块
public class ThreadSafety1_2 {
	public static void main(String[] args) {
		
/*		//实现Runnable
		MyRun2 myRun2 = new MyRun2();
		
		Thread t1 = new Thread(myRun2);
		Thread t2 = new Thread(myRun2);
		Thread t3 = new Thread(myRun2);
		
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		
		t1.start();
		t2.start();
		t3.start();*/
		
		//继承Thread
		MyThr2 t1 = new MyThr2();
		MyThr2 t2 = new MyThr2();
		MyThr2 t3 = new MyThr2();
		
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

//继承Thread
class MyThr2 extends Thread{
	public static int stick = 100;

	@Override
	public void run() {
		while (true) {
			synchronized (MyThr2.class) {
				if (stick > 0) {
					System.out.println(Thread.currentThread().getName()+"---"+stick);
					stick--;
				}else {
					return;
				}	
			}
		}
	}
}


//实现Runnable
class MyRun2 implements Runnable{
	
	private int stick = 100;
	@Override
	public void run() {
		while (true) {
			synchronized (MyRun.class) {
				if (stick > 0) {
					System.out.println(Thread.currentThread().getName()+"---"+stick);
					stick--;
				}else {
					return;
				}	
			}
		}
	}
}