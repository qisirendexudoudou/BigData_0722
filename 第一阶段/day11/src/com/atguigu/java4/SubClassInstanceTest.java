package com.atguigu.java4;

/**
	子类对象的实例化过程(了解)：
	
	结果上：只要子类继承了父类，那么就子类就获取了父类中的属性和方法。那么子类就可以调用父类中的属性和方法。
	
	过程上 ：当创建子类的对象时，子类一定会调用父类中的构造器，间接父类的构造器......Object类的构造器
			 从面JVM会将这些类加载到内存中。从而就可以调用父类中的属性和方法了。
			 
	总结 ： 自始之终我们只认为创建了子类一个对象
 */
public class SubClassInstanceTest {

	public static void main(String[] args) {
//		new B().showInfo();
		
		new C();
	}
}

class A{
	int score;
	public A(){
		System.out.println("a");
	}
	public void showInfo(){
		System.out.println("showInfo");
	}
}
class B extends A{
	public B(){
		System.out.println("b");
	}
}

class C extends B{
	public C(){
		System.out.println("c");
	}
}
