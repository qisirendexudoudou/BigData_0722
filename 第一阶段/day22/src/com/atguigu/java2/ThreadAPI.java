package com.atguigu.java2;

/*
 void start():  启动线程，并执行对象的run()方法
run():  线程在被调度时执行的操作
String getName():  返回线程的名称
void setName(String name):设置该线程名称
static currentThread(): 返回当前线程


线程的优先级控制
MAX_PRIORITY（10）;    
MIN _PRIORITY （1）;  
NORM_PRIORITY （5）;
涉及的方法：
getPriority() ：返回线程优先值 
setPriority(int newPriority) ：改变线程的优先级
线程创建时继承父线程的优先级
 */
public class ThreadAPI {

	public static void main(String[] args) {
		
		/*
		Thread t = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "====" + i);
				}
			}
		};
		//设置线程的名字
		t.setName("线程1");
		t.start();
		*/
		
		MyThread mt = new MyThread("线程1");
		MyThread mt2 = new MyThread("线程2");
		
		//设置线程1的优先级为最高
//		mt.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(mt.getPriority()); //获取线程的优先级
		System.out.println(mt2.getPriority());
		
		mt.start();
		mt2.start();
		
		
	}
}

class MyThread extends Thread{
	
	public MyThread(String name){
		super(name); //调用父类有参构造器
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "====" + i);
		}
	}
}
