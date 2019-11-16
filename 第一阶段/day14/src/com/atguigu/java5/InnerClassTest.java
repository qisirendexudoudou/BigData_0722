package com.atguigu.java5;

import com.atguigu.java5.Person.B;

/*
 	类的成员之 ： 内部类
 	
 	说明 ： 在一个类A中定义一类B，类A叫作外部类，类B叫作内部类。
 	
 	内部类 ： 成员内部类  vs 局部内部类
 	
 	成员内部类 ： 静态(成员)内部类  vs 非静态(成员)内部类
 	
 	类作为内部类 ：1.可以被static修饰   2.可以使用四种权限修饰符  3.类可以有的结构内部类都有。
 	
 	学习的内容：
 		1.如何创建内部类的对象？
 			创建非静态内部类的对象 : 外部类的对象.new 内部类()
 			创建静态内部类的对象 : new 外部类名.内部类名()
 		2.内部类如何调用外部类的成员？
 			非静态内部类调用外部类的成员 ： 外部类名.this.属性名/方法名
 			静态内部类调用外部类的成员 ： 外部类名.类变量名/静态方法名
 				注意： 静态内部类 - 只能调用外部类的类变量和静态方法
 		3.如何使用局部内部类？
 */


public class InnerClassTest {

	public static void main(String[] args) {
		//1 创建非静态内部类的对象
		Person p = new Person(); //创建外部类的对象
		Person.A a = p.new A();
		a.test();
		
		System.out.println("-----------------------------");
		
		
		//2.创建静态内部类的对象
		Person.B b = new Person.B();
		b.test();
		
		System.out.println("-----------------------------");
		
		InnerClassTest ict = new InnerClassTest();
		//多态
		SuperInterface sc = ict.show();
		//注意：不能向下转型因为无法识别子类（实现类）的类型
		sc.info();
	}
	
	//思考：如何获取局部内部类的对象？
	/*
	 * 1.让内部类去实现（继承）该方法可以实别的接口（类）
	 * 2.创建该内部类的对象并返回（多态）
	 * 3.注意：获取到的对象不能向下转型。
	 */
	public SuperInterface show(){
		//局部内部类
		class C implements SuperInterface{
			public void info(){
				System.out.println("C info");
			}
			
		}
		
		return new C();
	}
	
}

interface SuperInterface{
	void info();
}

//外部类
class Person{

	public int age = 10;
	public static int score = 20;
	
	//非静态内部类
	class A{
		public int age = 11;
		public void test(){
			//调用外部类的属性
			System.out.println(Person.this.age + " " + Person.this.score);
			//调用外部类的方法
			Person.this.demo();
			System.out.println("A test");
		}
	}
	
	//静态内部类 - 只能调用外部类的类变量和静态方法
	static class B{
		public void test(){
			//调用外部类的类变量
			System.out.println(Person.score);
			//调用外部类的静态方法
			Person.info();
			System.out.println("B test");
		}
	}
	
	public void demo(){
		System.out.println("person demo");
	}
	
	public static void info(){
		System.out.println("person static info");
	}
}

