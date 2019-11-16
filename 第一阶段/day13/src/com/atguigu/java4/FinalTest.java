package com.atguigu.java4;

/*
 	关键字: final
 	
 	[面试题]请简述final关键字？
 	
 	final修饰方法 ：final修饰的方法不能被重写
 	
 	final修饰类：final修饰的类不能被继承。像String,StringBuilder这些类都被final修饰
 	
 	final修饰属性 ：final修饰的属性的值不能被修改。final修饰的属性叫作常量。
 	
 	final修饰的属性可以赋值的方式 : 1.显示赋值  2.代码块赋值   3.构造器赋值
 */
class A{
	public  void show(){
		
	}
}

class B extends A{
	final int age;
	
	{
		age = 10;
		//如果某些代码在创建对象时必须进行调用，那么放在代码块中比较合适
	}
	{
		
	}
	
	public B(){
//		age = 10;
	}
	
	//必须保证创建对象时一定能给final修饰的属性赋值才可以
	public B(int c){
//		age = 10;
		this();
	}
	
	public void setAge(int age){
//		this.age = age;
	}
	
	public void show(){
		
	}
}
public class FinalTest {

}


