package com.atguigu.java2;

public class MethodTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.name = "哈士奇";
		
		
		Dog dog2 = new Dog();
		dog2.name = "金毛";
		
		dog.show();
		dog2.show();
	}
	
}

class Dog{
	String name;
	
	/*
	 * 	1.方法的信息在方法区
	 	2.调用方法时，会在栈中生成栈帧
	 	--------上面的了解------------------------
	 	3.方法中的局部 变量在栈中
	 	4.谁调用的方法，那么方法中的属性就是谁的
	 */
	public void show(){
		System.out.println(name);
	}
}
