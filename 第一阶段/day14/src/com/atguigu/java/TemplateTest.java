package com.atguigu.java;

/**
 * 模板设计模式 ：  相同的部分放在父类中，
 * 不同的部分在父类中定义成抽象方法，让子类去重写。
 * @author Administrator
 *
 */

abstract class SuperClass{
	public void codeTime(){
		//currentTimeMillis : 获取当前时间（到1970年1月1日0时0分0秒）所对应的毫秒数
		//1.代码开始运行的时间
		long start = System.currentTimeMillis();
		//2.执行要计算的代码
		this.run(); //多态 - 对象是谁调用的就是谁的run方法
		//3.代码结束的时间
		long end = System.currentTimeMillis();
		//4.计算时间差
		System.out.println("time=" + (end - start));
	}
	
	public abstract void run(); //没有方法体
}


class Computer extends SuperClass{
	@Override
	public void run() {
		for (int i = 1; i < 10000; i++) {
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
	}
}
public class TemplateTest {

	public static void main(String[] args) {
		
		SuperClass sc = new Computer();
		sc.codeTime();
//		sc.run();
	}
}
