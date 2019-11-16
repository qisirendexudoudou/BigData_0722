package com.atguigu.java2;


/**
	static关键字 ：
	
	static可以修饰 ： 属性，方法，代码块，内部类
	
	变量的分类 ： 局部变量 vs 成员变量（属性）
	属性 ： 实例变量   vs 类变量（static修饰的属性）
	
	static修饰属性（类变量）：
		1.同一个类的对象各自拥有一份实例变量，共同拥有一份类变量。
		2.当某个对象对类变量进行修改后，其它的对象看到的都是修改后的内容。
		3.类变量是随着类的加载而加载的。实例变量是创建对象的时候才加载的。（类加载优先于对象的创建）
		4.调用类变量 ： 类名.类变量名，对象名.类变量名

	static修饰方法（静态方法）：
		1.静态方法是随着类的加载而加载的
		2.调用静态方法 ：对象名.静态方法名  类名.静态方法名
		3.静态方法中不能调用非静态方法和实例变量。非静态方法中可以调用类变量和静态方法。
		4.静态方法中不能使用this和super关键字
		
	
	static修饰属性的场景：
		1.如果所有对象都需要共同拥有该属性，那么该属性使用static修饰
		2.如果该属性为常量那么使用static修饰 ：   public static final double PI = 3.14159265358979323846;
	
	static修饰方法的场景：
		1.如果该方法为工具类中的方法那么使用static修饰。
		2.有时候为了调用类变量也会将该方法设置为静态方法。
	
 */

class Creature{
	int age;
}
class Person extends Creature{
	//实例变量
	String name;
	int age;
	//类变量
	static String country;
	
	/*
	 * 静态方法
	 */
	public static void show(){
		System.out.println("show" + country);
		//静态方法不能调用实例变量 - 因为加载的时机不同（静态方法是类加载的时候加载的，
		//实例变量是创建对象的时候加载的。类加载优先于对象的创建）
//		System.out.println(name);
		
		//静态方法中不能调用非静态方法
//		info();
		
		//静态方法中不能使用this和super
//		System.out.println(this.name);
//		System.out.println(super.age);
		
	}
	
	/*
	 * 非静态方法 : 可以调用类变量的
	 */
	public void info(){
		System.out.println(name + " " + age + " " + country);
		show(); //可以调用静态方法
	}
}


public class StaticTest {
	
	public static void main(String[] args) {
		
		//类名.类变量名，对象名.类变量名
		Person.country = "大中国";
		
		Person person = new Person();
		person.name = "健林";
		person.age = 50;
//		person.country = "中国";
		person.info();
		
		Person person2 = new Person();
		person2.name = "马云";
		person2.age = 50;
//		person2.country = "中国";
		person2.info();
		
		System.out.println("--------------------调用静态方法---------");
		//对象名.静态方法名  类名.静态方法名
		person.show();
		Person.show();
		
		
	}
}















