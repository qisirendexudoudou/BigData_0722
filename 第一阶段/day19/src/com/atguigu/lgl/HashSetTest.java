package com.atguigu.lgl;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HashSetTest {
	public class SetTest {
		@Test
		public void test3(){
			HashSet set = new HashSet();
			Person p1 = new Person("aa", 18);
			set.add(p1);
			
			Person p2 = new Person("aa", 18);
			set.add(p2);
			
			System.out.println(set);
			
			System.out.println(p1.hashCode());
			System.out.println(p2.hashCode());
		}
		
		/*
		 * HashSet
		 */
		@Test
		public void test2(){
			HashSet set = new HashSet();
			set.add("aaa");
			set.add("bbb");
			set.add("ccc");
			set.add("ddd");
			
			System.out.println(set);
		}

		/*
		 * 无序的不可重复的
		 */
		@Test
		public void test(){
			Set set = new HashSet();
			set.add("aaa");
			set.add("bbb");
			set.add("ccc");
			set.add("ddd");
			set.add("ddd");
			set.add("ddd");
			set.add("ddd");
			System.out.println(set);
		}
	}

}
