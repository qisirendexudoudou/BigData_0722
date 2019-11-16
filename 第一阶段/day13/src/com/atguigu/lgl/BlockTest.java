package com.atguigu.lgl;

public class BlockTest {
	public static void main(String[] args) {
		Dog2 dog2 = new Dog2();
		dog2.show();
		System.out.println("------------");
		Dog2 dog22 = new Dog2();
		
	}

}

class Dog2{
	int age;
	static int sex;
	
	//非静态代码块1
	{
		System.out.println("非静态代码块1  " + age+ "  " +sex);
	}
	
	//非静态代码块2
	{
		System.out.println("非静态代码块2  " + age+ "  " +sex);
	}
	
	//静态代码块--不能调用实例变量和非静态方法
	static {
		System.out.println("静态代码块1！！！！ ");
	}
	
	//静态代码块2
	static {
		System.out.println("静态代码块2！！！！ ");
	}
	
	public Dog2(){
		System.out.println("Dog2()");
	}
	
	
	public void info(){
		//局部代码块 --好处：不用等到方法结束在让局部变量出栈
		{
			int a =10;
		}
		int b=10;
		
	}
	
	public static void show(){
		System.out.println("show static");
	}
	
	
}