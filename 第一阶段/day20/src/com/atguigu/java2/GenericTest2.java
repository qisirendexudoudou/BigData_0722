package com.atguigu.java2;

import org.junit.Test;

/**
	自定义泛型类，泛型接口，泛型方法
 */
public class GenericTest2 {
	
	/*
	 * 自定义泛型接口
	 */
	@Test
	public void test4(){
		
		class A implements MyInterface<String>{
			@Override
			public void setE(String e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String getE() {
				// TODO Auto-generated method stub
				return null;
			}
		}
		
		MyInterface<String> m = new MyInterface<String>(){

			@Override
			public void setE(String e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String getE() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}
	/*
	 * 通过子类指明父类的泛型类型
	 * 方式一 : 子类在继承父类的时候就指明父类的泛型类型
	 * 方式二 : 通过创建子类的对象时候指明父类的泛型类型
	 */
	@Test
	public void test3(){
		SubClass<Integer> sc = new SubClass<Integer>();
		
	}
	/*
	 * 自定义泛型类
	 */
	@Test
	public void test2(){
		Student<String, Integer, Double> student 
				= new Student<String,Integer,Double>();
		
	}

	/*
	 * 自定义泛型类
	 */
	@Test
	public void test(){
		
		Person<String> person = new Person<String>();
		person.setT("aaa");
		String name = person.getT();
		System.out.println(name);
		
		Person<Integer> p2 = new Person<Integer>();
		p2.setT(1111);
	}
}
