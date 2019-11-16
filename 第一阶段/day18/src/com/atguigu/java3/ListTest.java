package com.atguigu.java3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 	Collection子接口之 ： List接口
 	
 	|----List: 存储的元素是有序的可重复的
 		|-----ArrayList: ArrayList是List的主要实现类，底层是使用数组（数组查找快，增删慢）。线程是不安全的。
 		|-----LinkedList: LinkedList是线程不安全的，底层是一个双向链表(查找慢，增删快)。
 		|-----Vector: 古老的实现类，底层使用的是数组，线程安全的。
 		
 	[面试题] List的实现类有哪些？有什么不同？
 	
 	[面试题] ArrayList的底层实现？
 			当我们通过空参构造器创建对象时，底层会创建一个长度为10的数组。当我们向容器中添加第11个元素时
 			底层会进行扩容，扩容为原来的1.5倍。同时将原来数组中的内容复制到新的数组中。
 */
public class ListTest {
	
	/*
	 * ArrayList的构造器
	 */
	@Test
	public void test4(){
		new ArrayList();//底层创建了一个长度为10的数组
		new ArrayList(20); //创建一个长度为20的数组
	}
	
	@Test
	public void test3(){
		ArrayList list = new ArrayList();
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
//		list.clear();
		
//		System.out.println(list.size());
	}
	
	/**
	 * 面试题
	 */
	@Test
	public void test2(){
		List list = new ArrayList();
		list.add(1);//装箱
		list.add("ccc");
		
//		list.remove(1);//思考 ： 根据内容删除，还是索引值删除 : 根据索引值删除
		list.remove(new Integer(1));//根据内容删除
		
		System.out.println(list);
	}

	/**	
	 * 容器中的API ： 增，删，改，查，插，元素的个数
	 * 
	 * void add(int index, Object ele):在index位置插入ele元素
boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
Object get(int index):获取指定index位置的元素
int indexOf(Object obj):返回obj在集合中首次出现的位置
int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
Object remove(int index):移除指定index位置的元素，并返回此元素
Object set(int index, Object ele):设置指定index位置的元素为ele
List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合

	 */
	@Test
	public void test(){
		List list = new ArrayList();
		list.add("aaa");
		list.add("ccc");
		list.add("ccc");
		System.out.println(list);
		
		
		//void add(int index, Object ele):在index位置插入ele元素
//		list.add(0,"AAA");
//		System.out.println(list);
		
		//boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
//		List list2 = new ArrayList();
//		list2.add("111");
//		list2.add("222");
//		list.addAll(0, list2);
		
		
		//Object get(int index):获取指定index位置的元素
//		Object obj = list.get(0);
//		System.out.println(obj);
		
		
		//int indexOf(Object obj):返回obj在集合中首次出现的位置
//		int index = list.indexOf("ccc");
//		System.out.println(index);
		
		
		//int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
//		int index = list.lastIndexOf("ccc");
//		System.out.println(index);
		
		//Object remove(int index):移除指定index位置的元素，并返回此元素
//		Object obj = list.remove(0);
//		System.out.println("list=" + list);
//		System.out.println("obj=" + obj);
		
		
		//Object set(int index, Object ele):设置指定index位置的元素为ele
//		Object obj = list.set(0, "AAA");
//		System.out.println("list=" + list);
//		System.out.println("obj=" + obj);
		
		
		//List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合 (左闭右开)
		List subList = list.subList(0, 2);
		System.out.println(subList);
	}
}
















