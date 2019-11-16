package com.atguigu.java3;

/*
 	////该类中的代码需要二遍
 	方法的重载 （overload）：同一个类中相同的方法名不同的形参列表构成方法的重载
 	
 	两同一不同：同一个类，同一个方法名。
 		不同的形参列表。
 		
 	不同的形参列表 ：形参的个数，顺序，类型不同
 	
 	方法的重载和权限修饰符，返回值类型，形参的名字无关。
 	
 	如何确定调用的是哪个方法 ：方法名　＋ 形参列表（看形参和实参的类型）
 	
 */
public class OverloadTest {

	public static void main(String[] args) {
		
		OverloadTest ot = new OverloadTest();
		ot.add(10, 10);
	}
	
	/*
	public void add(int a,int c){
		System.out.println("int,int");
	}
	*/
	
	public void add(float a,float c){
		System.out.println("double,double");
	}
	
	public void add(double a,double c){
		System.out.println("double,double");
	}
	
	public void add(int a,int b,int c){
		System.out.println(a + b + c);
	}
	
	public void add(double a,char c){
		
	}
	
	/*
	 * 方法的重载和权修饰符没关系
	private void add(double a,char c){
		
	}
	*/
	
	/*
	 * 方法的重载和返回值类型没关系
	public int add(double a,char c){
		return a + c;
	}
	*/
	
	/*
	 * 方法的重载和形参的名字没有关系
	public void add(double aa,char cc){
		
	}
	*/
	
}
