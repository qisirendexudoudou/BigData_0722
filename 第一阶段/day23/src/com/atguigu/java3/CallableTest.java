package com.atguigu.java3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
	创建线程方式三 ：实现Callable接口
	
 */
public class CallableTest {

	public static void main(String[] args) throws Exception, Exception {
		
		//4.创建Callable实现类的对象
		MyCallable mc = new MyCallable();
		//5.创建FutureTask的对象并将Callable实现类的对象作为实参传到FutureTask的构造器中
		FutureTask<String> ft = new FutureTask<>(mc);
		//6.创建Thread对象并将FutureTask的对象作为实参传到Thread的构造器中
		Thread t = new Thread(ft);
		//7.调用start方法
		t.start();
		
		
		
		//获取分线程返回的数据
		String str = ft.get();//1.返回分线程 的结果   2.阻塞当前线程
		System.out.println(str);
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "=====" + i);
		}
		
		
	}
}
//1.自定义一个类并实现Callable接口
class MyCallable implements Callable<String>{

	//2.重写call方法
	@Override
	public String call() throws Exception {
		
		//3.在call方法中去实现需要在分线程中实现的功能
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "=====" + i);
		}
		return "abc";
	}
	
}
