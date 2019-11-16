package com.atguigu.java4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 
Executors.newCachedThreadPool()：创建一个可根据需要创建新线程的线程池(有空闲的线程直接使用，没有就创建新的线程)
Executors.newFixedThreadPool(n); 创建一个可重用固定线程数的线程池
Executors.newSingleThreadExecutor() ：创建一个只有一个线程的线程池
Executors.newScheduledThreadPool(n)：创建一个线程池，它可安排在给定延迟后运行命令或者定期地执行。

 */
public class ThreadPoolTest {

	public static void main(String[] args) {
		
		// 创建了一个线程池
		ExecutorService tp = Executors.newCachedThreadPool();
		// 线程池的使用 - 开启一个线程没有返回值
		tp.execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName() + "====" + i);
				}
			}
		});

		//开启一个线程：有返回值
		tp.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
		tp.shutdown();
		
		
		/*
		//调用线程
		SingleThreadPool.getInstance().execute(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName() + "====" + i);
				}
			}
		});
		//调用线程
		SingleThreadPool.getInstance().execute(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName() + "====" + i);
				}
			}
		});
		*/
	}
}
