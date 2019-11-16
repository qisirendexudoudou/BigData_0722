package com.atguigu.lgl;


//接口
interface MyInterface{
	//常量
	public static final int age = 1;
	//抽象方法
	public abstract void say();
}

//定义接口
interface Ia{
	void say();
}

interface Ib{
	
}

//接口的多继承
interface CC extends Ia,Ib{
	
}


public class InterfaceTest implements Ia {
	public static void main(String[] args) {
		Ia ia = new Ia(){
			@Override
			public void say() {
			System.out.println("接口匿名实现类的匿名对象");
			}
		};
		ia.say();
	}

	@Override
	public void say() {
		System.out.println("类实现接口后必须重写接口中所有的抽象的方法");
	}

}
