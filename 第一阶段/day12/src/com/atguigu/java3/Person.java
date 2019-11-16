package com.atguigu.java3;



public class Person {

	String name;
	int age;
	
	
	public Person() {
		super();
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		
		return name + " " + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Person){
			//向下转型
			Person p = (Person) obj;
			//比较内容
			return p.age == this.age && this.name.equals(p.name);
		}
		return false;
	}
	
	
	
	
}
