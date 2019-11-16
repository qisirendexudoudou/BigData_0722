package com.atguigu.java3;

/*
 	类的成员之 ： 代码块
 	
 	作用 ： 对Java类或对象进行初始化
 	
 	格式：
 		{}
 	注意：代码块只能被static修饰
 	
 		静态代码块：
 			1.静态代码块是随着类的加载而加载的，且只加载一次。
 			2.静态代码块的执行优先于非静态代码块。
 			3.静态代码块可以有多个，执行顺序是从上到下依次执行。
 			4.静态代码块中不能调用实例变量和非静态方法
 			
 		非静态代码块
			1.非静态代码块是随着对象的创建而加载的
			2.非静态代码块优先构造器的执行
			3.非静态代码块可以有多个，执行顺序是从上到下依次执行。
			4.非静态代码块中可以调用类变量和静态方法。
			
			
		注意：
			使用静态代码块初始化的特点 ： 类加载的时候只加载（初始化）一次。
					（如果是构造器初始化，每创建一个对象就会初始化一次。
					如果是静态方法进行初始化，那么每调用一次方法初始化一次）
			
 */	
public class BlockTest {

	public static void main(String[] args) {
		new Dog();
		new Dog();
		new Dog();
//		Dog.show();
	}
}

class Dog{
	int age;
	static int sex;
	//非静态代码块
	{
		System.out.println("非静态代码块1" + age + " " + sex);
		show();
	}
	/*
	{
		System.out.println("非静态代码块2");
	}
	{
		System.out.println("非静态代码块3");
	}
	*/
	
	//静态代码块 - 不能调用实例变量和非静态方法
	static {
		System.out.println("静态代码块1" + " " + sex);
//		info();
		show();
	}
	/*
	static {
		System.out.println("静态代码块2");
	}
	static {
		System.out.println("静态代码块3");
	}
	*/
	
	public Dog(){
		System.out.println(" Dog()");
	}
	
	public void info(){
		
		//局部代码块 - 好处是不用等到方法结束再让局部变量出栈。
		{
			int a = 10;
		}
		
		int b = 10; 
		while(true){
			System.out.println("cccccc");
		}
	}
	
	public static void show(){
		System.out.println("show static");
	}
	
}















