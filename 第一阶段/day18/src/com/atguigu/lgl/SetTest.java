package com.atguigu.lgl;

import java.util.HashSet;

import org.junit.Test;

public class SetTest {
	
	@Test
	public void test2(){
		HashSet set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		
		System.out.println(set);
	}
	@Test
	public void test(){
		HashSet set = new HashSet();
		Person p1 = new Person("xiaoxu", 12);
		Person p2 = new Person("xiaoxu", 12);
		
		set.add(p1);
		set.add(p2);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
