package com.atguigu.exer4;


class Animal{
	
	String name;
	int age;
	
	public Animal(){
		
	}
	
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("this======" + this);
	}
}

class Dog extends Animal{
	
	int legs;
	
	public Dog(){
		
	}
	
	public Dog(int legs,String name,int age){
		super(name, age);//通过调用父类的构造器给属性赋值
		this.legs = legs;
		System.out.println("this======" + this);
	}
}

public class AnmalTest {

	public static void main(String[] args) {
		Dog dog = new Dog(4,"土狗",2);
		System.out.println("dog========" + dog);
		System.out.println(dog.name + " " + dog.age + " " + dog.legs);
	}
}
