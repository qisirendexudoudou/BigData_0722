package com.atguigu.lgl;

//		构造器

public class ConstructorTestLuo {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.show();
		System.out.println("-------------");
		Animal animal2 = new Animal("二哈", 1, 4, 0);
		animal2.show();
		System.out.println("-------------");
		Animal animal3 = new Animal("lala", 1, 4, 1);
		animal3.show();
		System.out.println("----------------");
		animal3.setAge(17);
		animal3.show();
	}


}

class Animal{
	String name;
	int age;
	int legs;
	int sex;
	
	//默认的构造器
	public Animal(){
		System.out.println("这是默认的构造器");
	}
	
	//显示的构造器并且初始化对象
	public Animal(String name,int age,int legs,int sex){
		this.name = name;
		this.age = age;
		this.legs = legs;
		this.sex = sex;
	}
	
	//show方法
	public void show(){
		System.out.println(" name = "+ name + " age = "+ age + " legs = "+ legs + " sex = "+ sex);
	}
	
	//set-get方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
}	