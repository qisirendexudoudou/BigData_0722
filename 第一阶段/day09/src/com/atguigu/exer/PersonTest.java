package com.atguigu.exer;

/*
 * 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。

修改上题中类和构造器，增加name属性,使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
 */
class Person{
	int age;
	String name;
	
	//构造器 - 创建对象时会调用构造器
	public Person(){
		age = 18;
	}
	
	public Person(String n,int a){
		name = n;
		age = a;
	}
	
	public void info(){
		System.out.println(name + " " + age);
	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.info();
		System.out.println("---------------------------");
		
		Person p = new Person("志玲", 18);
		p.info();
	}
}
