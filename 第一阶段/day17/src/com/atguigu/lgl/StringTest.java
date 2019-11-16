package com.atguigu.lgl;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void test(){
		String s = "abc";
		String s2 = "abc";
		
		String s3 = new String("abcd");
		String s4 = new String("abcd");
		
		System.out.println(s==s2);//true
		System.out.println(s3==s4);//false
		
		String s5 = s4;
		System.out.println(s4==s5);//true
		
	}
	
	@Test
	public void test2(){
		Person p1 = new Person("小许",14);
		Person p2 = new Person("小许",14);
		
		System.out.println(p1==p2);//false
		System.out.println(p1.name==p2.name);//true
	}
	
	@Test
	public void test3(){
		String s = "abc";
		String s2 = "abc";
		
		System.out.println(s==s2);//true
		s2 += "cc";
		System.out.println(s==s2);//false
		s2.replace('a', 'C');
		System.out.println(s==s2);//false
		s2="cc";
		System.out.println(s==s2);//false
	}

	@Test
	public void test4(){
		String s = "hellojava";
		String s2 = "hello";
		String s3 = "java";
		String s4= "hello" + "java";
		String s5 = "hello" + s3;
		String s6 = s2 + "java";
		String s7 = s2 + s3;
		//intern()会去常量池中查找（s2+s3）结果的内容，如果常量池中存在则直接将该对象赋值给s8，如果常量池中没有则再去创建一个新的对象
		String s8 = (s2 + s3).intern();
		
		System.out.println(s==s4);//true
		System.out.println(s==s5);//false
		System.out.println(s==s6);//false
		System.out.println(s==s7);//false
		System.out.println(s5==s6);//false
		System.out.println(s==s8);//true
		
		
		
	}
}
