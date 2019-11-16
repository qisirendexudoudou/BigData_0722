package com.atguigu.lgl;

public class StaticTest2 {
	public static void main(String[] args) {
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		
		System.out.println(Student.count);
		
		
		System.out.println("---------------");
		Dog dog = new Dog("小许", 12);
		dog.info();
		Dog dog2 = new Dog("小许2", 14);
		dog2.info();
		Dog dog3 = new Dog("小许3", 17);
		dog3.info();
		
	}


}

//需求 ： 统计当前类创建的对象的个数
class Student{
	static int count;
	
	public Student(){
		++count;
	}
}

//需求：给Dog对象中的id自动赋值（实现自增的效果）
class Dog{
	 int id;
	String name;
	int age;
	static int count;
	
	
	public Dog(String name, int age) {
		id = ++count;
		this.name = name;
		this.age = age;
	}


	public Dog(){
		
	}
	
	public void info(){
		System.out.println("id = " + id + "  name = "+ name + "  age = " +age);
	}
}










