package com.atguigu.java2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 通配符的使用：
 * 
 * 格式 ： ？
 * 理解 ： ？是所有泛型类型的父类
 * 
 * 注意： 1.使用了通配符的集合只能添加null
 * 	    2.使用了通配符的集合可以遍历所有的元素，但是获取元素的类型都是Object类型
 * 
 * 通配符的限制：
 * 	<? extends Comparable>只允许泛型为实现Comparable接口的实现类的引用调用
 *  <? super Number> : 泛型的类型只能是Number及Number的父类
 *  <? extends Number> : 泛型的类型只能是Number及Number的子类
 */
public class GenericTest5 {
	/**
	 * 通配符的限制
	 */
	@Test
	public void test2() {
		ArrayList<Number> list = new ArrayList<>();

		ArrayList<Object> list2 = new ArrayList<>();
		
		ArrayList<Integer> list3 = new ArrayList<>();

		show2(list);
//		show2(list2);
		show2(list3);
		
		show3(list);
		show3(list2);
//		show3(list3);
	}
	
//	<? extends Comparable>只允许泛型为实现Comparable接口的实现类的引用调用

	//<? super Number> : 泛型的类型只能是Number及Number的父类
	public void show3(List<? super Number> list) {
	}
	
	//<? extends Number> : 泛型的类型只能是Number及Number的子类
	public void show2(List<? extends Number> list) {
	}

	/**
	 * 通配符的使用
	 */
	@Test
	public void test() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(111);
		list2.add(222);
		
		
		ArrayList<Double> list3 = new ArrayList<Double>();
		list3.add(12.3);

		show(list);
		show(list2);
		show(list3);
	}

	
	public void show(List<?> list) {
		list.add(null);
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
