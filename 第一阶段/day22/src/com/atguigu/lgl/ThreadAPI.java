package com.atguigu.lgl;

/**
void start():  启动线程，并执行对象的run()方法
run(): 线程在被调度时执行的操作
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

static  void  yield()：线程让步
	暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
	若队列中没有同优先级的线程，忽略此方法
join() ：当某个程序执行流中调用其他线程的 join() 方法时，调用线程将被阻塞，
		直到 join() 方法加入的 join 线程执行完为止   
		低优先级的线程也可以获得执行 
static  void  sleep(long millis)：(指定时间:毫秒)
	令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后重排队。
	抛出InterruptedException异常
stop(): 强制线程生命期结束
boolean isAlive()：返回boolean，判断线程是否还活着

interrupt(); //杀死其它线程（线程的死亡通知）
isInterrupted() : 如果线程被杀死返回true,否则返回false

 */

class TestLuo5 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" --- " + i );
		}
	}
}


public class ThreadAPI {
	public static void main(String[] args) {
		
		Thread thread = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+" -- " + i );
				}
			}
		};
		thread.setName("线程1");
		thread.start();
		
		Thread thread2 = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					//线程让步
//					if (i == 20) {
//						Thread.yield();
//					}
					
					
					//线程插入join（）方法
//					if (i == 20) {
//						try {
//							thread.join();
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
					
					
					//线程睡眠
//					if (i == 20) {
//						try {
//							thread.sleep(10000);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
					
					//杀死进程
					thread.interrupt();
					
					
					System.out.println(Thread.currentThread().getName()+" ======= " + i );
				}
			}
		};
		thread2.setName("线程2");
		thread2.start();
		
		
		
//		TestLuo5 testLuo5 = new TestLuo5();
//		Thread thread = new Thread(testLuo5);		
//		thread.start();
//		System.out.println(thread.currentThread().getName());
//		thread.start();
//		System.out.println(thread.getPriority());
//		thread.setPriority(6);
//		System.out.println(thread.getPriority());
	}

}