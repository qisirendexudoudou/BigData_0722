package com.atguigu.lgl;

import org.junit.Test;

public class ThreadTest1 {

	public static void main(String[] args) {
		Thread thread = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + " = " + i);
				}
			}
		};
		
		System.out.println("默认线程名： " + thread.currentThread().getName());
		thread.setName("线程1");

		
		System.out.println("优先级的默认值为： "+ thread.getPriority());
		thread.setPriority(8);
		System.out.println("优先级的修改值为：  "+ thread.getPriority());
		thread.start();
	}
}
