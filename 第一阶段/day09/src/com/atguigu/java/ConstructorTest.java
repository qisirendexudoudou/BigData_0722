package com.atguigu.java;

/*
 * 	//敲一遍
 	类的成员之 ： 构造器(构造方法)
 	
 	作用 : 1.创建对象  2.给对象进行初始化
 	
 	格式 ： 权限修饰符  类名(形参列表){
 				执行语句;
 		 }
 		 
 	说明：
 		1.当一个类中没有显示的声明构造器时，系统会默认提供该类的一个空参构造器。
 		2.当一个类中如果显示的定义了一个构造器时，那么系统将不会再提供默认的空参构造器。
 		3.在一个类中可以定义多个构造器，彼此之间构成重载。
 		
 	特点：
 		1.构造器只能被调用一次。（调用一次就创建一个对象，创建一个对象时只调用一次）
 		
 	思考 ：构造器的使用？
 		 1.给属性赋值 - 只能赋值一次。（虽然可以能过构造器给属性赋值，但是还是需要set方法。因为后期有可能会修改属性的值）
 		 2.初始化 - 构造器只能被调用一次，那么凡是只能被执行一次的代码，都可以放在构造器中。
 		
 	总结：
 		创建对象必调构造器。
 */

class Animal {

	String name;
	int age = 10; // 显示赋值
	int legs;
	int sex;

	// 构造器
	public Animal() {
		System.out.println("Animal()");
	}

	// 构造器 - 给对象进行初始化
	public Animal(String n, int a, int l, int s) {
		// 给属性赋值
		name = n;
		age = a;
		legs = l;
		sex = s;
	}

	// 构造器
	public Animal(String desc) {
		System.out.println(" Animal(String desc)" + desc);
	}

	public void setName(String n) {
		name = n;

	}

	public void setAge(int a) {
		age = a;
	}

	public void setLegs(int l) {
		legs = l;
	}

	public void setSex(int s) {
		sex = s;
	}

	public void info() {
		System.out.println(name + " " + age);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		// 思考：如何调用构造器
		Animal animal = new Animal("我是小龙哥我怕谁"); // 创建对象

		System.out.println("----------------------------------");

		Animal animal2 = new Animal();

		System.out.println("------------------------------------");
		// 通过构造器给属性赋值 - 只能赋值一次
		Animal animal3 = new Animal("二哈", 3, 4, 0);
		animal3.info();

		// 通过set方法给属性赋值 - 可以赋值多次
		Animal animal4 = new Animal();
		animal4.setName("aa");
		animal4.setAge(10);
		animal4.setLegs(4);
		animal4.setSex(0);

	}
}
