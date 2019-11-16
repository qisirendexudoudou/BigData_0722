package com.atguigu.java;

/**

	程序(program) :指一段静态的代码
	进程(process) :是程序的一次执行过程，或是正在运行的一个程序。
	线程(thread) : 一个进进程可以有多个线程。每个线程可以单独完成一个功能。
	

	
 */
public class ThreadTest {

	/**
	 * 
	 * 注意 ： 线程这一章所有的练习全部在main方法中完成，不要在单元测试中去测试会有问题。
	 */
	public static void main(String[] args) {
		
		//演示 ：一个程序在做两件事情
		new Thread(){
			@Override
			public void run() {
				while(true){
					System.out.println("杀毒中......");
				}
			}
		}.start();
		
		new Thread(){
			public void run() {
				while(true){
					System.out.println("清理垃圾中......");
				}
			}
		}.start();
	}
}

















