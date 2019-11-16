package com.atguigu.java3;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/*
 	Collection子接口之 ：Set
 	
 	|------Set: 存储的元素是无序的且不可重复的
 		|------HashSet:
 			|------LinkedHashSet:
 		|------TreeSet:
 		
 	说明：
 		1.无序性 ： 无序性不是指的随机性，指的是调用hashCode方法算出的哈希值决定了当前元素所存放的位置
 						（哈希值不是有序的，同一个对象无论算多少次都是同一个值）。
 		2.不可重复：调用该元素的equals方法如果为true则说明内容相同，如果为false则说明内容不同。
 		
 
 	[面试题]HashSet的底层实现原理？
 		当我们向HashSet中添加元素时，会先调用该对象所在类的hashCode方法算出的哈希值，来决定该元素所存放的位置。
 		如果该位置上没有其它元素则直接放入。如果该位置上已经存在其它元素。会调用该对象的equals方法进行内容比较。
 		如果返回值为true,则说明内容相同那么该对象不允许存放。如果返回值为false,则说明两个对象不一样将以链表的形式
 		存放该对象。
 */
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
