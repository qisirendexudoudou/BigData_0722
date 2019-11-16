package com.atguigu.java2;

import java.util.Arrays;

import org.junit.Test;

public class StringBufferTest2 {

	/**
	 	StringBuffer构造器（熟悉）：
	 	new StringBuffer();//通过空参构造器创建对象，底层会创建一个长度为16的数组
	 	new StringBuffer("hellojava");1.将构造器中的内容存放到当前容器中 2.会创建一个数组长度为（字符串内容的长度+16）的数组。
	 	new StringBuffer(50);//底层创建了一个长度为50的数组（可以指定底层数组的长度）
	 */
	@Test
	public void test(){
		
		StringBuffer sb = new StringBuffer();//通过空参构造器创建对象，底层会创建一个长度为16的数组
		new StringBuffer(50);//底层创建了一个长度为50的数组（可以指定底层数组的长度）
		//1.将构造器中的内容存放到当前容器中 2.会创建一个数组长度为（字符串内容的长度+16）的数组。
		StringBuffer sb2 = new StringBuffer("hellojava");
		System.out.println(sb2.length());
		
	}
	
	/**
	 * 扩容 ：当我们通过一个空参的构造器去创建对象时，底层会默认创建一个长度为16的数组。
	 * 当我们向容器中添加第17个元素时，底层会自动扩容，扩容为原来的2倍+2，再把原来数组中的内容复制新的数组中。
	 */
	@Test
	public void test2(){
		StringBuffer sb = new StringBuffer();
		sb.append("aaaaaa");
		System.out.println(sb.length());
	}
	
	/**
	 * Arrays.copyOf(c, 20);
	 * 创建一个新的数组长度为20，同时将c数组中的内容全部复制到新的数组中
	 */
	@Test
	public void test3(){
		char[] c = {'a','b'};
		
		c = Arrays.copyOf(c, 20);
		
		System.out.println(c.length);
		System.out.println(Arrays.toString(c));
	}
}







