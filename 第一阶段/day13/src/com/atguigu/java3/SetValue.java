package com.atguigu.java3;

/*
 	赋值方式 ： 1.默认值   2.显示赋值   3.构造器赋值   4.对象名.方法名 ，对象名.属性名  5.代码块
 	
 	赋值顺序 ： 1 -> 2,5(谁在前面谁先赋值) -> 3 -> 4
 */
public class SetValue {

	public static void main(String[] args) {
		new Number().show();
	}
}

/*
 	1.执行语句是从上到下依次执行的。
 */
class Number{
	
	//多个代码块：从上到下
	{
		a = 20;
//		b = a + 10; //如果代码块在属性的前面，代码块只能对属性执行赋值操作
	}
	
	
	//多个属性 ：从上到下依次执行
	//创建对象时： 1.先声明属性   2.再进行赋值操作 ：①先看属性前有没有代码块如果有就代码块先操作 ，然后才是显示赋值的操作
	int a = 10;
	int b = a;
	

	
	
	public void show(){
		System.out.println(a);
	}
}
