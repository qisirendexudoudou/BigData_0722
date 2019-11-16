package com.atguigu.java4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
	对线程的二次封装（理解）
 */
public class SingleThreadPool {

	private SingleThreadPool(){
		
	}
	
	private static SingleThreadPool st = new SingleThreadPool();
	
	private static ExecutorService tp = Executors.newCachedThreadPool();
	
	
	public static SingleThreadPool getInstance(){
		return st;
	}
	
	/*
	 * 调用线程的方法
	 */
	public void execute(Runnable runnable){
		tp.execute(runnable);
	}
}
