package com.atguigu.java;

//该类中的代码需要三遍
/*
 	面向对象：
 	
 	一 面向对象学习的三条主线：
 		1.类及类的成员 ： 属性，方法，构造器，代码块，内部类
 		2.面向对象的三大特性 ： 封装性，继承性，多态性 
 		3.其它关键字 ：this,super,interface,final,static......
 		
 	二 面向过程 vs 面向对象
 	      面向过程：强调的是功能行为
 	      面向对象 ：强调具备了功能的对象
 	 
 	三 Java语言最基本的两个元素
 	  类 ： 抽象的概念上的定义。是对一类事物的描述
 	  对象：是由类派生出来的（new 出来的），是具体的实实在在的个体。
 	  
 	四 类的成员 ：属性和方法
 		属性 = field = 成员变量
 		(成员)方法 = 函数 = method
 		
 	五 面向对象的落地实现：
 	  1.创建一个类，并在类中提供必要的属性和方法
 	  2.由类派生出对象。（创建对象）
 	  3.调用对象中的属性和方法。（对象名.属性名/方法名）
 	  
 	六 内存分析：
 		1.同一个类创建的多个对象，每个对象独自拥有一份属性。当修改其中一个对象的属性的值后，其它对象的该属性不会受到影响
 */

//创建一个类
class Person{
	//属性
	String name;
	int age;
	char sex;
	
	//方法
	public void run(){
		System.out.println(name + "跑起来");
	}
	
	public void say(){
		System.out.println(name + "在说话" + "我今年" + age);
	}
}



public class OOP {

	public static void main(String[] args) {
		//创建对象 - 是由类派生出来的(new 出来的)
		Person p = new Person(); //p叫作对象名
		//创建类的对象 、创建类的实例 、类的实例化
		Person p2 = new Person();
		
		System.out.println("-----------调用属性和方法----------------");
		
		Person person = new Person();
		//调用属性 ： 对象名.属性名
		person.name = "小龙哥"; //给属性赋值
		person.age = 18;
		//获取属性的值
		String name = person.name;
		System.out.println("name=" + name);
		//调用方法 ：对象名.方法名
		person.run();
		person.say();
		
		System.out.println("-----------内存分析----------------");
		
		Person per = new Person();
		per.name = "小龙哥";
		per.age = 18;
		
		Person per2 = new Person();
		per2.name = "强哥";
		per2.age = 50;
		
		
		Person per3 = per;
		per3.name = "王飞龙";
		
		
		per2 = new Person();
		
		//同一个类创建的多个对象，每个对象独自拥有一份属性。当修改其中一个对象的属性的值后，其它对象的该属性不会受到影响
		System.out.println(per.name);//王飞龙
		System.out.println(per2.name);//null
		System.out.println(per3.name);//王飞龙
		
	}
}











