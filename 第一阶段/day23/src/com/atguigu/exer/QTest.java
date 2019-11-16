package com.atguigu.exer;

import java.util.Random;
import java.util.Scanner;

/*
 在main方法中创建并启动两个线程。第一个线程循环随机打印100以内的整数，
 直到第二个线程从键盘读取了“Q”命令。

 */
public class QTest {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				boolean isFlag = true;
				Random random = new Random();
				while (isFlag) {
					/*
					 * random.nextInt(100) : [0,100)
					 */
					System.out.println(random.nextInt(100));
					
					//睡一秒
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						return;
					}
				}
			}
		});
		t.start();
		
		
		//主线程
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if ("q".equals(s)) {
			t.interrupt();//杀死t线程
		}
	}
}
