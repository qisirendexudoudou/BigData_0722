package com.atguigu.java5;

public class TestProduct {
	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		Thread productorThread = new Thread(new Productor(clerk));
		Thread consumerThread = new Thread(new Consumer(clerk));
		productorThread.start();
		consumerThread.start();
	}
}

class Clerk { // 售货员
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

/**
 * 生产者（一个线程）制造产品
 * @author Administrator
 *
 */
class Productor implements Runnable { // 生产者
	Clerk clerk;

	public Productor(Clerk clerk) {
		this.clerk = clerk;
	}

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
}

/**
 * 消费者（一个线程）：消费产品
 * @author Administrator
 *
 */
class Consumer implements Runnable { // 消费者
	Clerk clerk;

	public Consumer(Clerk clerk) {
		this.clerk = clerk;
	}

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
}
