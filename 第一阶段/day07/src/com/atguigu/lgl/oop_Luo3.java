package com.atguigu.lgl;

public class oop_Luo3 {

	public static void main(String[] args) {
		Per person1 = new Per();
		person1.name = "小许";
		person1.age = 18;
		
		person1.info();
		
		Per person2 = new Per();
		person2.name = "小小许";
		person2.age = 16;
		
		Per person3 = person2;
		person2.age = 15;
		
		System.out.println("p2.age = " + person2.age);
		System.out.println("p3.age = " + person3.age);
		System.out.println("---------------");
		
		Per person4 = person2;
		person4 = new Per();
		person4.name = "luozi";
		
		System.out.println("p2.name = " + person2.name);
		System.out.println("p3.name = " + person3.name);
		System.out.println("p4.name = " + person4.name);
		System.out.println("---------------");
		
		
	}
}

class Per{
	String name;
	int age;
	
	public void info(){
		System.out.println("name = " + name + " age = " + age);
	}
	
}