package com.atguigu.java4;

import org.junit.Test;

/**
 * 
 * 运行时类的对象
 *
 */
public class ClassTest {

	@Test
	public void test(){
	
		//类信息只有一份，类信息都是Class类的对象
		Class clazz = Person.class;
		Class clazz2 = Person.class;
		
		System.out.println(clazz == clazz2);
	}
}


class Person{
	
}
