package com.atguigu.lgl2;

import org.junit.Test;

//自定义泛型类 泛型接口 泛型方法
public class GenericTest2 {
	
	
	//自定义泛型接口
	@Test
	public void test2(){
		
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
		
		MyInterface<String> m = new MyInterface<String>() {

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
	
	
	
	//自定义泛型类
	@Test
	public void test1(){
		
//		Person<String> p1 = new Person<String>();
//		p1.setT("aa");
//		System.out.println(p1.getT());
//		
//		Person<Integer> p2 = new Person<Integer>();
//		p2.setT(12);
//		System.out.println(p2.getT());
		
		Person<Integer, String> p1 = new Person<Integer,String>();
		p1.setT(1);
		p1.setI("aa");
		
		System.out.println(p1.getT() + " " + p1.getI());
		
		
		
		
		
	}
}
