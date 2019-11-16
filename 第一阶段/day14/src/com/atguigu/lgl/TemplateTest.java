package com.atguigu.lgl;

//模板设计模式：相同的部分放在父类中，不同的部分在父类中定义成抽象方法，让子类去重写
public class TemplateTest {
	public static void main(String[] args) {
		SuperClass sc = new Computer();
		sc.codeTime();

}
}

abstract class SuperClass{

	public void codeTime(){
	long start = System.currentTimeMillis();
	run();
	long end = System.currentTimeMillis();
	System.out.println("time=" + (end - start));
	
}
	public abstract void run();
}

class Computer extends SuperClass{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
	}
}