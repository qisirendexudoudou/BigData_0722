package com.atguigu.java;

/**
 	//敲一遍
	给属性赋值的方式 ：默认值，显示赋值 ，构造器赋值，对象名.方法名/对象名.属性名
	
	属性赋值的顺序 ： 默认值 -> 显示赋值 -> 构造器赋值  -> 对象名.方法名/对象名.属性名
 */
public class SetFieldValue {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
//		cat.setAge(30);
		
		System.out.println(cat.age);
	}
}

class Cat{
	
	int age = 10;
	
	//给属性赋值
	public Cat(int a){
		age = a;
	}
	
	public Cat(){
		
	}
	
	public void setAge(int a){
		age = a;
	}
}
