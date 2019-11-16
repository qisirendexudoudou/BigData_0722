package com.atguigu.java;

import org.junit.Test;

/**

	String(字符串) ：String是一个不可变的字符序列
	
	说明：
		1.String类被final所修饰，该类不能被继承
		2.String类实现了Serializable接口，实现了Serializable接口那么该类的对象就可以被序列化。
				序列化后就可以将该对象写入到磁盘中。可以将该对象进行前后台的传递。
		3.String实现了Comparable接口，可以比较内容。
		4.String实现了CharSequence接口，可以获取字符串的长度，获取指定索引位置上的字符等操作
		5.String底层其实就是一个char[],且该数组被final所修饰。
	
	[面试题]String str = new String("xyz")创建了几个对象？2个
		
 */
public class StringTest {
	
	/**
		 *  在字符串拼接的过程中只要有变量参与运算，那么就会调用StringBuilder中的toString方法会通过new的方法创建
		 *  	一个新的String对象。（只要有变量参与运算一定会在堆中创建对象）
	 */
	@Test
	public void test4(){
		String s = "hellojava";
		String s2 = "hello";
		String s3 = "java";
		String s4 = "hello" + "java"; //"hellojava"
		String s5 = "hello" + s3;
		String s6 = s2 + "java";
		String s7 = s2 + s3;
		/*
		 * intern()会去常量池中查找(s2+s3)结果的内容，如果常量池中存在则直接将该对象赋值给s8.如果常量池中没有再去创建一个新的对象。
		 */
		String s8 = (s2 + s3).intern();
		
		System.out.println(s == s4);//true
		System.out.println(s == s5);//false
		System.out.println(s == s6);//false
		System.out.println(s == s7);//false
		System.out.println(s5 == s6);//false
		
		System.out.println(s == s8);//true
	}
	
	/**
	 * String是一个不可变的字符序列 : 就算字符串进行内容的追加，通过方法进行内容修改，重新赋值都会产生一个新的字符串
	 */
	@Test
	public void test3(){
		String s = "abc";
		String s2 = "abc";
		System.out.println(s == s2);//true
//		s2 += "ccc";
//		System.out.println(s == s2);//false
		
//		s2 = s2.replace('a', 'A');
//		System.out.println(s == s2);//false
		
		s2 = "ccc";
		System.out.println(s == s2);//false
	}
	
	@Test
	public void test2(){
		Person p1 = new Person("xiaoloongge", 18);
		Person p2 = new Person("xiaoloongge", 18);
		
		System.out.println(p1 == p2);//false
		System.out.println(p1.name == p2.name);//true
	}

	@Test
	public void test(){
		String s = "abc";
		String s2 = "abc";
		
		String s3 = new String("ccc");
		String s4 = new String("ccc");
		
		//上面的两种方式有什么区别？
		
		System.out.println(s == s2);//true
		System.out.println(s3 == s4);//false
	}
}


















