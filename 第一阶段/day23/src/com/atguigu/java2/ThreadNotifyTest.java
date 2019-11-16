package com.atguigu.java2;


/**
 * wait()：令当前线程挂起并放弃CPU、同步资源，使别的线程可访问并修改共享资源，而当前线程排队等候再次对资源的访问
 * notify()：唤醒正在排队等待同步资源的线程中优先级最高者结束等待 
 * notifyAll ()：唤醒正在排队等待资源的所有线程结束等待.
 * 
 * 注意 ： 这三个方法只能在同步方法和同步代码块中使用。
 * 注意 ： notify,notifyAll,wait调用的是同步监视器对象中的方法。
 * 
 * [面试题]sleep和wait的区别是什么？
 * 1.sleep睡眠时不会释放锁。wait睡眠时会释放锁。
 * 2.wait只能在同步代码块同步方法中使用。sleep没有这个限制。
 * 3.sleep是Thread中的方法，wait是Object中的方法。
 * 4.sleep会自动唤醒，wait需要被notify/notifyAll唤醒。o
 */
public class ThreadNotifyTest {


	public static void main(String[] args) {

		MyRunnable mr = new MyRunnable();
		// 开启三个窗口
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);

		t1.setName("窗口1");
		t2.setName("窗口2");

		// 启动线程
		t1.start();
		t2.start();
	}
}

class MyRunnable implements Runnable {

	// 票 - 共享资源
	private int tick = 100;

	@Override
	public void run() {

		
			synchronized (this) {
				
				notify();
				
				System.out.println(Thread.currentThread().getName());
				
				try {
					wait();//1.当前线程挂起（睡眠）会释放锁。
					
//					Thread.sleep(10000);//1.当前线程挂起（睡眠）不会释放锁
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + "------结束-----");
			}
		

	}

}
