package com.atguigu.lgl;

import com.atguigu.lgl.Person3.A3;
import com.atguigu.lgl.Person3.B3;

//内部类


public class InnerClassTest {
	public static void main(String[] args) {
		//创建非静态内部类的对象
		Person3 p = new Person3();
		Person3.A3 a3 = p.new A3();
		a3.test();
		
		//创建静态内部类的对象
		Person3.B3 b3 = new Person3.B3();
		b3.test();
		
		
	}
	

		

}


//外部类
class Person3{
	int age=1;
	static int score=100;
	
	//非静态内部类
	class A3{
		int age = 2;
		public void test(){
			//调用外部类的属性
			System.out.println(Person3.this.age);
			//调用外部类的方法
			Person3.this.demo();
		}
	}
	
	//静态内部类  --只能调用外部类的类变量和静态方法
	static class B3{
		public void test(){
			//调用外部类的属性
			System.out.println(Person3.score);
			//调用外部类的方法
			Person3.say();
		}
	}
	
	public void demo(){
		System.out.println("demo");
	}
	
	public static void say(){
		System.out.println("static function");
	}
}












