package com.atguigu.java;

/*
 	多态性：
 	
 	
 	一 多态性的前提 ：1.要有继承关系  2.要有方法的重写  3.要父类的引用指向子类的对象
 	
 	二 属性是否有多态性 ：属性没有多态性 （通过谁的引用调用的属性，那么属性就是那个引用类型中的）
 	
 	
 */
public class PersonTest2 {

	public static void main(String[] args) {
		
		//父类的引用指向子类的对象
		Person p = new Woman();
		p.show();
		p.say();
		
		System.out.println("---------------调用属性--------------");
		//属性没有多态性
		System.out.println(p.name);
		
		/*
		 * 常犯的错误 ： ClassCastException
		 */
		Object obj = new String("aaa");
		String s = (String) obj;
		System.out.println(s);
//		Number n = (Number) obj;
//		Woman w = (Woman) obj;
//		Man m = (Man) obj;
	}
	
}







