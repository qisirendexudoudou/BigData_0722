package com.atguigu.lgl;

//创建一个类
class Person3{ 
	
	//属性
	String name; 
	int age;
	
	//方法
	public void run(){
		System.out.println("name = " + name);
	}
	
	public void say(){
		System.out.println("age = " + age);
	}
	
}


public class oop_Luo2 {
	public static void main(String[] args) {
		//创建对象 (创建类的实例)(类的实例化)
		Person3 p1 = new Person3();
		
		//调用属性和方法
		p1.name = "小罗";
		p1.age = 18;
		
		//调用方法
		p1.run();
		p1.say();
		
		System.out.println("-------面向对象的内存分析------");
		
		Person3 p2 = new Person3();	
		p2.name = "小许";
		p2.age = 17;
		
		Person3 p3 = p2;
		
		System.out.println("p2.name = " + p2.name);
		System.out.println("p3.name = " + p3.name);
		System.out.println("-----------");
		
		p3.name = "haha";
		System.out.println("p2.name = " + p2.name);
		System.out.println("p3.name = " + p3.name);
		System.out.println("-----------");
		
		Person3 p4 = p2;
		p4 = new Person3();
		
		p4.name = "haode";
		System.out.println("p2.name = " + p2.name);
		System.out.println("p3.name = " + p3.name);
		System.out.println("p4.name = " + p4.name);
		System.out.println("-----------");
		
		
		
			
	}
	
	
}
