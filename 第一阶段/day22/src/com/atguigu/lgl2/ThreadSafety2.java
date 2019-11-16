package com.atguigu.lgl2;

//同步方法
public class ThreadSafety2 {
	public static void main(String[] args) {
/*		//实现Runnable
		MyRun3 myRun3 = new MyRun3();
		Thread t1 = new Thread(myRun3);
		Thread t2 = new Thread(myRun3);
		Thread t3 = new Thread(myRun3);
		
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		t1.start();
		t2.start();
		t3.start();*/
		
		
		//继承Thread
		MyThr3 t1 = new MyThr3();
		MyThr3 t2 = new MyThr3();
		MyThr3 t3 = new MyThr3();
		
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		t1.start();
		t2.start();
		t3.start();
	}

}
//继承Thread
class MyThr3 extends Thread{

	private static int tick = 100;
	
	@Override
	public void run() {
		while (true) {
			if (!show()) {
				return;
			}
		}
		
	}
	
	public  static synchronized boolean show(){
		if (tick > 0) {
			System.out.println(Thread.currentThread().getName()+ "--" + tick);
			tick--;
			return true;
		}else{
			return false;
		}
	}
	
}


//实现Runnable
class MyRun3 implements Runnable{
	private int tick = 100;

	@Override
	public void run() {
		while (true) {
			if (!show()) {
				return;
			}
		}
		
	}
	
	public synchronized boolean show(){
		if (tick > 0) {
			System.out.println(Thread.currentThread().getName()+ "--" + tick);
			tick--;
			return true;
		}else{
			return false;
		}
	}
	
	
}
