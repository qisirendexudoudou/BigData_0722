package com.atguigu.java2;

/**

	需求 ： 两个线程交替打印100 - 1
 */
public class ThreadNotifyTest2 {

	public static void main(String[] args) {
		
		MyRun mr = new MyRun();
		Thread t = new Thread(mr);
		Thread t2 = new Thread(mr);
		
		t.setName("强哥");
		t2.setName("龙哥");
		
		
		t2.start();
		t.start();
	}
}

class MyRun implements Runnable{

	private int number = 100;
	private Object obj = new Object();
	
	@Override
	public void run() {
		while(true){
			synchronized (obj) {
				//注意 ： notify,notifyAll,wait调用的是同步监视器对象中的。
				obj.notify();
				
				if(number > 0){
					System.out.println(Thread.currentThread().getName() + "=====" + number);
					number--;
					
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
//					System.out.println("===="  + Thread.currentThread().getName() + "溜了溜了");
				}else{
					return;
				}
				
			}
		}
	}
	
}
