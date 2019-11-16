package com.atguigu.java;


//敲一遍
class A{
	int score;
}

class B extends A{
	int state;
}

class C extends A{
	int sex;
}


public class ExtendsTest2 {

	public static void main(String[] args) {
		
		A a = new A();
		a.score = 10;
		
		B b = new B();
		b.state = 5;
		
		C c = new C();
		c.sex = 1;
		
		System.out.println(b.score + " " + b.state);//0,5
		
		System.out.println(c.sex + " " + c.score); // 1,0
	}
}


