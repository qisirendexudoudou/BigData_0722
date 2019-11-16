package com.atguigu.lgl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//线程池
public class ThreadPoolTest {

	public static void main(String[] args) throws Exception, Exception {
		
		//现新建一个线程池
		ExecutorService tp = Executors.newCachedThreadPool();
	
		//线程池的使用2 -- 开启一个线程有返回值
		Future<String> s1 = tp.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName() + "====" + i);
				}
				return "finish";
			}
		});
		System.out.println(s1.get());
		
		//线程池的使用 --开启一个线程没有返回值
		tp.execute(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName() + "====" + i);
				}
			}
		});
		
		tp.shutdown();
	}
}
