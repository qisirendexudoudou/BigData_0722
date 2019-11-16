package com.atguigu.lgl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//实现Callable接口
public class MakeThreadTest {
	public static void main(String[] args) throws Exception, Exception {
		MyCall myCall = new MyCall();
		FutureTask<String> ft = new FutureTask<>(myCall);
		Thread t = new Thread(ft);
		t.start();
		
		System.out.println(ft.get()); 
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "=====" + i);
		}
		
		
	}

}


class  MyCall implements Callable<String>{

	@Override
	public String call() throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "=====" + i);
		}
		return "finish.";
	}
	
}