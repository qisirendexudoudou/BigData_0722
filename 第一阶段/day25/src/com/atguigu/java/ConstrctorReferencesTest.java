package com.atguigu.java;

import java.util.function.Function;

import org.junit.Test;

/*
 	构造器引用：
 	
 */
public class ConstrctorReferencesTest {
	
	/*
	 * 数组引用
	 */
	@Test
	public void test2(){
		new Function<Integer, Person[]>() {

			@Override
			public Person[] apply(Integer t) {
				
				return new Person[t];
			}
		};
		
		System.out.println("------lambda-----");
		
		Function<Integer,Person[]> fun = t -> new Person[t];
		
		System.out.println("---------数组的引用-----------");
		
		fun = Person[]::new;
		
		Person[] apply = fun.apply(5);
	}

	/*
	 * 构造器引用
	 */
	@Test
	public void test(){
		
		/*
		 * 第一个条件 ： 方法的形参刚好是对象的实参
		 * 第二个条件 ：创建的对象正好是方法的返回值类型
		 */
		new Function<Integer, Person>() {

			@Override
			public Person apply(Integer t) {
				
				return new Person(t);
			}
		};
		
		System.out.println("-----------lambda------------");
		
		Function<Integer, Person> fun = t -> new Person(t);
		
		System.out.println("----------构造器引用--------------------");
		
		fun = Person::new;
		
	}
}

class Person{
	int age;
	
	public Person(int age){
		this.age = age;
	}
}
