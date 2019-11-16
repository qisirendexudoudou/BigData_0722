package com.atguigu.java;

/**
	
创建线程方式一 ： 继承Thread
	
	说明：
		1.自定义一个类并继承Thread
		2.重写run方法
		3.在run方法中实现需要在分线程中实现的功能
		4.创建Thread子类的对象
		5.调用start方法
		
 创建线程方式二： 实现Runnable接口
	 说明：
	 	1.自定义一个类并实现Runnable接口
	 	2.重写run方法
	 	3.在run方法中实现需要在分线程中实现的功能
	 	4.创建Runnable接口实现类的对象
	 	5.创建Thread类的对象，并将Runnable接口实现类的对象作为实参传递到Thread构造器中
	 	6.调用start方法

[面试题]继承Thread和实现Runnable哪种方式好？
		单继承多实现 ：实现的方式更好一些，因为就算实现了接口还可以再继承其它的类。
		线程同步：
			 1.共享资源 ： 继承Thread中的共享资源必须使用static修饰，用来保证所有的对象共同拥有。
			 			实现Runnable的方式并不需要。
			 2.同步监视器 ： 继承Thread同步监视器不能使用this。实现Runnable同步监视器可以使用this
			 3.同步方法 ： 实现Runnable的方式同步方法默认锁是this
			 		继承Thread方式同步方法默认锁是this,所以需要加static将锁改成当前类的运行时类的对象。
	 	
 */
public class ThreadTest2 {

	public static void main(String[] args) {
		//4.创建Thread子类的对象
		MyThread mt = new MyThread();
		//5.调用start方法
		mt.start();//作用 ：1.开启分线程  2.调用run方法
		
		//思考 ： 能不能调用run方法？不行
//		mt.run();这是错误调用run方法并没有开启分线程
		
		//思考 ：如何开启多个线程？再次创建Thread子类对象并调用start方法即可
//		mt.start();错误，start不能调用多次否则会抛异常
//		MyThread mt2 = new MyThread();
//		mt2.start();
		
		
		//在主线程中执行的代码。
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i + "------垃圾清理中........");
//		}
		
		//--------------------------使用匿名内部类的方式开启分线程-------------
		new Thread(){
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i + "------垃圾清理中........");
				}
			}
		}.start();
	
		
	}
}



//1.自定义一个类并继承Thread
class MyThread extends Thread{
	
	//2.重写run方法
	@Override
	public void run() {
		//3.在run方法中实现需要在分线程中实现的功能
		for (int i = 0; i < 100; i++) {
			//Thread.currentThread().getName() 获取当前线程的名字
			System.out.println(Thread.currentThread().getName() + "==" + i + "=====杀毒中........");
		}
	}
}
