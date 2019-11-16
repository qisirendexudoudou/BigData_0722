package com.atguigu.java3;

import java.util.Date;

/*
 	equals方法：
 	
 	说明：
 		1.Object中的equals方法
 			 public boolean equals(Object obj) {
        		return (this == obj);
    		 }
    	
    	2.像String，Date等核心类库中的类都重写了equals方法，用来比较内容。
    	
    	3.往往我们调用equals方法时，是想比较内容。所以我们在自定义类中
    		会重写equals方法。如果不重写调用的是Object中的equals方法比较的是地址值。
 		
 	
 	[面试题]equals和==的区别？
 		== ：如果比较的是基本数据类型，那么比较的就是该变量中内容。
 			 如果比较的是引用数据类型，那么比较的是对象的地址值。（两个对象是否指向同一块内存）
 		equals : 如果没有重写equals方法调用的是Object中的equals方法比较的是地址值。
 				 如果我们重写了equals方法往往用来比较内容。
 */
public class EqualsTest {

	public static void main(String[] args) {
		
		Person p = new Person("aa", 18);
		Person p2 = new Person("aa",18);
		
		
		System.out.println("---------------------------");
		System.out.println(p.equals(p2));
		System.out.println("---------------------------------");
		
		String s = new String("aaaa");
		boolean bo = p.equals(s);//双引号引起来的都被认为是String类的实例
		bo = p.equals(p);
		System.out.println(bo);
		
		System.out.println("------------------ == -----------------------");
		
		System.out.println(5 == 5);//比的是数据的内容
		System.out.println(p2 == p);//false - 比较的是对象的地址值
		Person p3 = p2;
		System.out.println(p3 == p2);//true
		
		System.out.println("---------------------------------------------");
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		//String中重写了equals方法，用来比较内容
		System.out.println(s1.equals(s2));//true
		
		
	}
}












