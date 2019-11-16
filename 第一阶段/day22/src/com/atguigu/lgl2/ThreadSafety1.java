package com.atguigu.lgl2;


//同步代码块
public class ThreadSafety1 {
	public static void main(String[] args) {

/*	//实现Runnable
	MyRun safe1 = new MyRun();	
	
	Thread t1 = new Thread(safe1);
	Thread t2 = new Thread(safe1);
	Thread t3 = new Thread(safe1);
	
	t1.setName("窗口1");
	t2.setName("窗口2");
	t3.setName("窗口3");
	
	t1.start();
	t2.start();
	t3.start();*/
	
	
	//继承Runnable
	MyThr t1 = new MyThr();
	MyThr t2 = new MyThr();
	MyThr t3 = new MyThr();
	
	t1.setName("窗口1");
	t2.setName("窗口2");
	t3.setName("窗口3");

	t1.start();
	t2.start();
	t3.start();
	

}
}

//方式二 继承Runnable
class MyThr extends Thread{
	//多个对象共同拥有一份类变量
	private static int tick = 100; //共享资源   票数100   票号：1-100
	
	@Override
	public void run() {
		
		while(true){
		synchronized (MyThr.class) {
//		synchronized (this) {
			if (tick >0) {
				System.out.println(Thread.currentThread().getName() + " -- " + tick);
				tick--;
			}else {
				return;
			}
			}	
		}
	}
	
}


//方式一   实现Runnable
class MyRun implements Runnable{

	private int tick = 100; //共享资源   票数100   票号：1-100
	@Override
	public void run() {
		
		while(true){
//		synchronized (MyRun.class) {
		synchronized (this) {
			if (tick >0) {
				System.out.println(Thread.currentThread().getName() + " -- " + tick);
				tick--;
			}else {
				return;
			}
			}	
		}
	}
}