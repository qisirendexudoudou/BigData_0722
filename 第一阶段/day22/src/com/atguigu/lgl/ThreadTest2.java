package com.atguigu.lgl;

import org.junit.Test;

public class ThreadTest2 {
	
	//运动时类的对象
	@Test
	public void test(){
		Class c1 = Person.class;
		Class c2 = Person.class;
		
		System.out.println(c1==c2);
	}

	
}

class Person{}


