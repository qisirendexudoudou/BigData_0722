package com.atguigu.java2;

/**
	接口（interface）:
	
	格式 ： interface 接口名{}
	
	说明：
		1.接口和类是并列的关系
		2.接口中可以有常量和抽象方法（jdk1.8之前）。
		3.接口不能被实例化
		4.类和接口的关系 ： 类  implements 接口1，接口2 .....   (类可以实现接口而且是多实现)
		5.当类实现接口后必须重写接口中的所有抽象方法，如果不想重写可以将该类设置成抽象类
		6.接口和接口的关系 ： 接口1 extends 接口2，接口3..... (接口和接口是继承关系而且是多继承)
		7.类和类之间是单继承，类和接口之间是多实现。接口和接口之间是多继承。
		8.接口和类之间的多态性 ：详见InterfaceTest2.java
 */

//接口
interface MyInterface{
	//常量
	public static final int SCORE = 100;
	String name ="ccc"; //常量 - 默认省略了public static final
	//抽象方法
	public abstract void test();
	void show(); //抽象方法 ： 默认省略了public abstract
}

interface A{
	void say();
}

interface B{
	void info();
}

/**
 *  接口和接口的关系 ： 接口1 extends 接口2，接口3..... (接口和接口是继承关系而且是多继承)
 */
interface C extends A,B{
	
}

public class InterfaceTest implements C{

	public static void main(String[] args) {
		//接口不能被实例化
//		new MyInterface();
		System.out.println(MyInterface.SCORE);
//		MyInterface.name = "ddd"; //不能对常量进行操作
	}

	

	/**
	 * 当类实现接口后必须重写接口中的所有抽象方法，如果不想重写可以将该类设置成抽象类
	 */
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}
	
}
