package com.atguigu.lgl;

//继承Thread类

class TestLuo3 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ "--" + i);
		}
	}
}
public class MakeThread1_2 {
	public static void main(String[] args) {
		//主线程
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ "==" + i);
		}
				
		//普通创建
		new TestLuo3().start();
		
		//匿名对象
		new Thread(){
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+ "++" + i);
				}
			};
		}.start();
	}

}
