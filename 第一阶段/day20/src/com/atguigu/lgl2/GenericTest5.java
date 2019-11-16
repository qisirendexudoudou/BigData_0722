package com.atguigu.lgl2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class GenericTest5 {
	
	//通配符的限制
	@Test
	public void test2(){
		
	}
	
	public void show2(List<? extends Number> list) {
	}
	
	//通配符的使用
	@Test
	public void test1(){
		
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("aa");
	list1.add("bb");
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(12);
	list2.add(23);
	
	show(list1);
	System.out.println("--------------------");
	show(list2);

	}
	
	public void show(List<?> list){
//		list.add(null);
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
