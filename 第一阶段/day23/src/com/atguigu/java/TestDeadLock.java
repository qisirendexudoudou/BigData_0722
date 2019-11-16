package com.atguigu.java;

/*
 * 不同的线程分别占用对方需要的同步资源不放弃，都在等待对方放弃自己需要的同步资源，就形成了线程的死锁
 * 
 * 解决方案：
 * 		1.当某一个线程等待的时间超过指定时间后就让该线程结束。（超时时间）
 * 		2.尽量避免多个线程使用共同的多把锁。
 * 
 * 检测死锁工具 ： bin/jconsole (连接 -> 连接 -> 检测死锁）
 */
public class TestDeadLock {
	static StringBuffer s1 = new StringBuffer();
	static StringBuffer s2 = new StringBuffer();

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				
				synchronized (s1) {
					s2.append("A");
					
					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (s2) {
						s2.append("B");
						System.out.print(s1);
						System.out.print(s2);
					}
				}
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				
				synchronized (s2) {
					s2.append("C");
					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (s1) {
						s1.append("D");
						System.out.print(s2);
						System.out.print(s1);
					}
				}
				
			}
		}.start();
	}
}
