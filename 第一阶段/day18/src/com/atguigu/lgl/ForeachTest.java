package com.atguigu.lgl;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class ForeachTest {
	
	//遍历数组
	@Test
	public void test1(){
		int[] numbers = {1,2,3,4,5};
		for (int i : numbers) {
			System.out.println(i);
		}
	}
	
	//遍历集合
	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("ddd");
		c.add("fff");
		
		for (Object object : c) {
			System.out.println(object);
		}
	}
	
	
}
