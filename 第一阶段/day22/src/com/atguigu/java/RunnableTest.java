package com.atguigu.java;

/**

	 实现线程方式-实现Runnable接口
	 
	 说明：
	 	1.自定义一个类并实现Runnable接口
	 	2.重写run方法
	 	3.在run方法中实现需要在分线程中实现的功能
	 	4.创建Runnable接口实现类的对象
	 	5.创建Thread类的对象，并将Runnable接口实现类的对象作为实参传递到Thread构造器中
	 	6.调用start方法
 */
public class RunnableTest {

	public static void main(String[] args) {
		//4.创建Runnable接口实现类的对象
		MyRunnable mr = new MyRunnable();
		//5.创建Thread类的对象，并将Runnable接口实现类的对象作为实参传递到Thread构造器中
		Thread t = new Thread(mr);
		//6.调用start方法
		t.start();
		
		//思考：如何开启多个线程？再创建Thread对象即可
//		Thread t2 = new Thread(mr);
//		t2.start();
//		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(Thread.currentThread().getName() + " ==== " + i);
//		}
		
		System.out.println("------------------匿名内部类的方式--------------------------");
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + " ==== " + i);
				}
			}
		}).start();
	}
}

//1.自定义一个类并实现Runnable接口
class MyRunnable implements Runnable{

	//2.重写run方法
	@Override
	public void run() {
		//3.在run方法中实现需要在分线程中实现的功能
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " ==== " + i);
		}
		
	}
	
}
