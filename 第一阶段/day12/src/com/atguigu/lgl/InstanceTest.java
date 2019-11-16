package com.atguigu.lgl;

public class InstanceTest {
	public static void main(String[] args) {
		InstanceTest instanceTest = new InstanceTest();
		instanceTest.method(new Person());
		System.out.println();
		instanceTest.method(new Student());
		System.out.println();
		instanceTest.method(new Graduate());
		
		System.out.println("-----------------------------");
		
		InstanceTest instanceTest2 = new InstanceTest();
		instanceTest2.method2(new Person());
		System.out.println();
		instanceTest2.method2(new Student());
		System.out.println();
		instanceTest2.method2(new Graduate());	
	}
	public void method(Person e ){
		System.out.println(e.getInfo());
	}	
	
	public void method2(Person e){
		if (e instanceof Person) {
			System.out.println("a person");
		}
		if (e instanceof Student) {
			System.out.println("a student");
		}
		if (e instanceof Graduate) {
			System.out.println("a graduate");
		}
	}
}

//父类
class Person {
	protected String name="person";
	protected int age=50;
	public String getInfo() {
	          return "Name: "+ name + "\n" +"age: "+ age;
	}
}

//子类
class Student extends Person {
	protected String school="pku";
	public String getInfo() {
  	          return  "Name: "+ name + "\nage: "+ age 
	          + "\nschool: "+ school;
	}	
}


//子类
class Graduate extends Student{
	public String major="IT";
	public String getInfo()
	{
		return  "Name: "+ name + "\nage: "+ age 
	          + "\nschool: "+ school+"\nmajor:"+major;
	}
}


