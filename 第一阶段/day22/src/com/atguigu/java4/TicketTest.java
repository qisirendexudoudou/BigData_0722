package com.atguigu.java4;

/**

	线程安全问题：当三个线程卖票的时候，会发生重票0票负票的问题。
	
	发生线程安全问题的原因 ： 因为多个线程操作共享数据，当某个线程在操作共享数据时，其它的线程也操作了共享数据那么就会发生线程安全问题
	
	解决方式 ： 当某个线程在操作共享数据时，不允许其它线程再操作共享数据。等正在操作共享数据的线程执行完毕再允许其它线程进行操作。
	
	
 */
public class TicketTest {

	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		//开启三个窗口
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);
		
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		
		//启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}

class MyRunnable implements Runnable{

	//票 - 共享资源
	private int tick = 100;
	
	@Override
	public void run() {
		
		while(true){
			
			if(tick > 0){
				//卖票
				System.out.println(Thread.currentThread().getName() + "=====" + tick);
				tick--;
			}else{
				return;
			}
			
		}
		
	}
	
}

