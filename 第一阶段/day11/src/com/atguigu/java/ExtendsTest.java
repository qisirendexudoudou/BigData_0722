package com.atguigu.java;

/*
 * 	//敲一遍
 	面向对象特性之 ： 继承性
 	
 	格式：
 		A extends B : A 继承（扩展） B
 		A ： 子类(SubClass)
 		B : 父类(SuperClass),基类，超类
 		
 	说明：
 		1.子类继承父类以后就拥有了父类中的属性和方法。
 			子类除了可以继承父类中的属性和方法外，还可以在本类中自定义属性和方法。
 		2.由于封装性的原因父类中的属性一旦被私有化后，子类不能再直接调用父类中的属性。但是子类确实继承到了该属性。
 		3.一个子类只能有一个父类。一个父类可以有多个子类。
 		4.子类和父类存在"is a"的关系
 		5.子父类的关系是相对而言的。父类分为：直接父类和间接父类。
 		6.子类不仅可以继承直接父类中的属性和方法还可以继承间接父类中的属性和方法。
 		7.一个类如果没有显示的继承其它类那么默认继Object类.（Object是所有类的父类）
 		
 	继承性的好处 ： 1.减少了代码的冗余   2.提高了代码的扩展性   3.为多态提供了前提
 */

class Creature{
	
	boolean islive;
}

class Person extends Creature{
	//属性
	String name;
	private int age;
	
	//构造器 - 不能被子类继承
	public Person(){
		
	}
	
	//方法
	public void show(){
		System.out.println("person" + age);
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
}

class Student extends Person{
//	String name;
//	int age;
	int schoolId;
	
	public void setName(String n){
		this.name = n;
	
	}
	public void info(){
		System.out.println("student info");
	}
}


public class ExtendsTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "思聪同鞋";
		student.schoolId = 10;
		student.setAge(20);
		//思考 ： 有没有继承到父类中私有的属性 - 继承到了
//		student.age = 10;
//		student.info();
		
		//思考：子类有能不能继承到“父类的父类”中的属性和方法？可以
		student.islive = true;
		
		student.show();
		
		System.out.println("------------------------------------------------");
		//调用的是Object中的方法
		student.toString();
	}
}










