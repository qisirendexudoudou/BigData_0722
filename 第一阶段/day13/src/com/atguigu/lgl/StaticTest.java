package com.atguigu.lgl;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class StaticTest {
	public static void main(String[] args) {
		//类名.类变量名    对象名.类变量名
		Person.country = "中国";
		Person person = new Person();
		person.name = "小许";
		person.show();
		person.info();
		
		System.out.println("------------------");
		Person person2 = new Person();
		person2.name = "小罗";
		person2.age = 14;
		person2.show();
		person2.info();
		
		System.out.println("-----------");
		person2.country = "中华人民共和国";
		person.show();
		person.info();
		
		person2.show();
		person2.info();
		
		Person.show();
		person.show();
		
		
	}

}

class Creature{
	int age;
}

class Person extends Creature{
	//实例变量
	String name;
	int age;
	//类变量
	static String country;
	
	//静态方法
	public static void show(){
		System.out.println("show" + country);
//		System.out.println(name);
		//静态方法不能调用实例变量，因为加载的时机不同
		//静态方法是类加载的时候加载的
		//实例变量是new对象的时候加载的
		//类加载优先于对象的创建
		
//		info();
		//静态方法中不能调用非静态方法
		
//		System.out.println(this.name);
//		System.out.println(super.name);
		//静态方法中不能使用this和super关键字
	}
	
	//非静态方法
	public void info(){
		//非静态方法中可以调用类变量
		System.out.println("name = " + name + "age = " + age + "country = " + country);
		//非静态方法中可以调用静态方法
		show();
	}
}