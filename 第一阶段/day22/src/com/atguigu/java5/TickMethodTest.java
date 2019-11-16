package com.atguigu.java5;



/*
 	方式二 ： 同步方法
 		
 	权限修饰符  synchronized   返回值类型  方法名（形参列表）{
 		操作共享数据的代码;
 	}
 	
 	说明：
 		1.实现Runnable的方式同步方法默认锁是this。
 			继承Thread同步方法默认锁是this,所以需要加staitc将默认的锁变成当前类的运行时类的对象。
 */
public class TickMethodTest {
	public static void main(String[] args) {
		/*
		MyRunnable mr = new MyRunnable();
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
			
			if(!saleTick()){
				return;
			}
			
		}

	}
	
	/**
	 * 同步监视器 ： 默认锁是this
	 * 
	 * 同步方法被static修饰 ： 同步监视器默认是当前类的运行时类的对象（MyThr.class）。
	 */
	public static synchronized boolean saleTick(){
		if (tick > 0) {
			// 卖票
			System.out.println(Thread.currentThread().getName() + "=====" + tick);
			tick--;
			return true;
		} else {
			return false;
		}
	}

}

class MyRunnable implements Runnable {

	// 票 - 共享资源
	private int tick = 100;

	@Override
	public void run() {

		while (true) {
			if(!saleTick()){
				return;
			}
		}

	}
	
	/*
	 * 同步方法 ： 操作共享数据
	 * 
	 * 同步监视器 ： 默认锁是this
	 */
	public synchronized boolean saleTick(){
		if (tick > 0) {
			// 卖票
			System.out.println(Thread.currentThread().getName() + "=====" + tick);
			tick--;
			return true;
		} else {
			return false;
		}
	}

}
