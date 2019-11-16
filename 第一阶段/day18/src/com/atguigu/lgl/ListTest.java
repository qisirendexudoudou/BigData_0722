package com.atguigu.lgl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTest {
	
	
	@Test
	public  void test2(){
		new ArrayList();//底层创建了一个长度为10的数组
		new ArrayList(20);//底层创建了一个长度为20的数组
	}
	
	@Test
	public void test(){
		List list = new ArrayList();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		System.out.println(list);
		
//		list.add(0, "11");
//		System.out.println(list);
		
//		List list2 = new ArrayList();
//		list2.add("22");
//		list2.add("33");
//		list.addAll(1, list2);
//		System.out.println(list);
//				
//		System.out.println(list.get(2));
//		list.add("bb");
////		System.out.println(list.indexOf("bb"));
//		System.out.println(list.lastIndexOf("bb"));
		
//		System.out.println(list.remove(0));
//		System.out.println(list);
		
//		System.out.println(list.set(0, 1111));
//		System.out.println("-----");
//		System.out.println(list);
		
		System.out.println(list.subList(0, 2));//左闭右开
		
		
		
		
		
		
		
		
		
		
	}

}
