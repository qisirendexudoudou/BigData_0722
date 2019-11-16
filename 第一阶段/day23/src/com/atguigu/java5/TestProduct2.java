package com.atguigu.java5;

/**

	生产者消费者（两个线程操作共享数据，一个线程减，一个线程加，范围始终在[1-20]）
 */
class Clerk2 { // 售货员
	private int product = 0;

	/**
	 * 进货
	 */
	public synchronized void addProduct() {
		if (product >= 20) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			product++;
			System.out.println("生产者生产了第" + product + "个产品");
			notifyAll();
		}
	}
	/**
	 * 卖货
	 */
	public synchronized void getProduct() {
		if (this.product <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("消费者取走了第" + product + "个产品");
			product--;
			notifyAll();
		}
	}
}
public class TestProduct2 {
	public static void main(String[] args) {
		Clerk2 clerk = new Clerk2();
		
		
		new Thread(new Runnable() {
			
			public void run() {
				System.out.println("消费者开始取走产品");
				while (true) {
					try {
						Thread.sleep((int) Math.random() * 1000);
					} catch (InterruptedException e) {
					}
					clerk.getProduct();
				}
			}
		}).start();
		
		
		new Thread(new Runnable() {
			
			public void run() {
				System.out.println("生产者开始生产产品");
				while (true) {
					try {
						Thread.sleep((int) Math.random() * 1000);
					} catch (InterruptedException e) {
					}
					clerk.addProduct();
				}
			}
		}).start();
		
	}
}





