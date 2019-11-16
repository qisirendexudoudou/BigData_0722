package com.atguigu.lgl;

/*
	this关键字 ： 表示当前对象
 */
public class ThisTestLuo {
	public static void main(String[] args) {
		Cat cat = new Cat(1);
		cat.setAge(10);
		System.out.println(cat.getAge());
		System.out.println("--------------------");
		
		cat.show();
		System.out.println("--------------------");
		cat.test();
		cat.info();
		
		System.out.println("--------------------");
		Cat cat2 = new Cat(15, "erha");
		cat2.info();
		
		
		System.out.println("------------this说明------------");
		Test test = new Test();
		test.say();
		System.out.println();
		Test test2 = new Test();
		test2.say();
		
	}

}

class Cat{
	private int age;
	private String name;
	
	//调用构造器
	public Cat(int age){
		this.age = age;
	}
	
	public Cat(int age,String name){
		this(age);
		this.name = name;
	}
	
	//调用属性和方法
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}

	public void test(){
		System.out.println("wodetian");
		this.show();
	}
	
	public void show(){
		System.out.println("i haha ");
	}
	
	public void info(){
		System.out.println("name = " + name + "age = " + age);
	}
}


class Test{
	public void say(){
		System.out.println("this == " + this);
	}
}
