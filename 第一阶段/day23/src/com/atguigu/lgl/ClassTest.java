package com.atguigu.lgl;

import org.junit.Test;

//Class类的创建
public class ClassTest {
	@Test
	public void test() throws Exception{
		//方式一：类名.class
		Class p1 = Person.class;
		//方式二：对象名.getClass()
		Person person = new Person();
		Class p2 = person.getClass();
		//方式三：Class.forName(全类名)
		Class p3 = Class.forName("com.atguigu.lgl.Person");
		
		//方式四：类名加载.loasClass(全类名)
		
		ClassLoader classLoader = this.getClass().getClassLoader();
		Class p4 = classLoader.loadClass("com.atguigu.lgl.Person");
		
		
		System.out.println(p1==p2);
		System.out.println(p3==p4);
		System.out.println(p1==p4);
	}

}

class Person{}
