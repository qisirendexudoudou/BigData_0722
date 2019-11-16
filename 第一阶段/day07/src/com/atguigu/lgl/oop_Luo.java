package com.atguigu.lgl;


/*
 	1.面向对象的三条主线
 			类及类的成员：属性、方法、构造器、代码块、内部类
 			面向对象的三大特性：封装行、继承性、多态性
 			其他关键字; this、super、impert......
 	
 	2.java的两个基本元素
 			类:对一类事物的描述
 			对象：由类派生出来的实实在在的具体的个例（new 出来的）
 			
 	3.类的成员
 			属性: 成员变量 = field
 			方法： 函数 = method = 成员方法
 			
 	4.面向对象的实现
 			（1）创建一个类，并且在类中提供必要的属性和方法
 			（2）创建对象（new 一个实例）
 			（3）调用对象的属性和方法 （对象名.属性名/方法名）
 			
 	5.内存分析
 			 由同一个类创建的多个对象，每个对象拥有一份独立的属性；
 			 修改其中一个对象的属性的值以后，其他对象的属性的值不会受到影响
 			
 */			

class Person{   //创建类
	//定义属性
	String name; 
	int age;
	//定义方法
	public void run(){
		System.out.println(name + " say he is running!");
	}
	
	public void info(){
		System.out.println(name + " is " + age + " years old!" );
	}
}

public class oop_Luo {
	public static void main(String[] args) {
		
		//创建对象
		Person p1 = new Person();
		
		//调用属性
		p1.name = "luogaolong";
		p1.age = 22;
		
		//调用方法
		p1.run();
		p1.info();
		
	}


}
