package com.atguigu.java2;

public class ValueTransferTest3 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.age = 10;
		
		Dog dog2 = dog;
		dog2.age = 20;
		
		System.out.println(dog.age);//20
		System.out.println(dog2.age);//20
		
		System.out.println("-------------------------------------------");
		
		int m = 10;
		int n = m;
		n = 30;
		
		System.out.println("m=" + m); // 10
		System.out.println("n=" + n); // 30
		
	}
}

class Dog{
	
	int age;
}
