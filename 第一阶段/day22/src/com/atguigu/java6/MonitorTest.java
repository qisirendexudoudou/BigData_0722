package com.atguigu.java6;

/**

	同步监视（锁）：
 */


class Computer{

	/*
	 * this
	 */
	public synchronized void show(){
		
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() +"show========");
		}
	}
	/*
	 * this
	 */
	public synchronized void show2(){
		
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() +"show222222222222222222222");
		}
	}
	
	/*
	 * Computer.class
	 */
	public static synchronized void info(){
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() +"info========================");
		}
	}
	
	/*
	 * Computer.class
	 */
	public static synchronized void info2(){
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + "info222222222222222222222222222");
		}
	}
	
}


public class MonitorTest {

	public static void main(String[] args) {
		
/*		//同一个对象 同一把锁
		Computer computer = new Computer();
		
		Thread t = new Thread(){
			public void run() {
				computer.show();
			}
		};
		
		Thread t2 = new Thread(){
			public void run() {
				computer.show2();
			}
		};
		
		t.start();
		t2.start();*/
		
		
		
/*		//new了两个Comper 不是同一把锁
		Thread t = new Thread(){
			public void run() {
				new Computer().show();
			}
		};
		
		Thread t2 = new Thread(){
			public void run() {
				new Computer().show2();
			}
		};
		
		t.start();
		t2.start();*/
		
/*		//static修饰的和是不是new几个兑现报告无关
		Computer computer = new Computer();
		
		Thread t = new Thread(){
			public void run() {
				computer.info();
			}
		};
		
		Thread t2 = new Thread(){
			public void run() {
				computer.info2();
			}
		};
		
		t.start();
		t2.start();*/
		

		Thread t = new Thread(){
			public void run() {
				new Computer().info();
			}
		};
		
		Thread t2 = new Thread(){
			public void run() {
				new Computer().info2();
			}
		};
		
		t.start();
		t2.start();
	}
}



