package com.atguigu.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class CollectionsTest {
	
	/**
	 * Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
Object min(Collection)
Object min(Collection，Comparator)
int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
void copy(List dest,List src)：将src中的内容复制到dest中
boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值

	 */
	@Test
	public void test2(){
		List list = new ArrayList();
		list.add("aaa");
		list.add("ddd");
		list.add("bbb");
		list.add("ccc");
		list.add("ccc");
		list.add("ccc");
		
		//Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
		System.out.println(Collections.max(list));
		
		//int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
		System.out.println(Collections.frequency(list, "ccc"));
		
		System.out.println("----------------------------------------");
		//void copy(List dest,List src)：将src中的内容复制到dest中
		List list2 = new ArrayList();
//		Collections.copy(list2, list);
		
		copy(list2, list);
		System.out.println(list2);
		
		System.out.println("------------------------------");
		//boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
		Collections.replaceAll(list, "ccc", "CCC");
		System.out.println(list);
		
	}
	
	public void copy(List dest,List src){
		//1.校验 是否为null
		//2.元素的复制
		for (Object object : src) {
			dest.add(object);
		}
	}

	/**
	 * reverse(List)：反转 List 中元素的顺序
shuffle(List)：对 List 集合元素进行随机排序
sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换

	 */
	@Test
	public void test(){
		List list = new ArrayList();
//		list.add("aaa");
//		list.add("ddd");
//		list.add("bbb");
//		list.add("ccc");
		list.add(new Person(100, "aaa"));
		list.add(new Person(80, "ccc"));
		list.add(new Person(90, "ddd"));

		
//		reverse(List)：反转 List 中元素的顺序
//		Collections.reverse(list);
//		System.out.println(list);
		
		//shuffle(List)：对 List 集合元素进行随机排序
//		Collections.shuffle(list);
//		System.out.println(list);
		
		//sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
//		Collections.sort(list);
//		System.out.println(list);
		
		
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Person && o2 instanceof Person){
					Person p1 = (Person) o1;
					Person p2 = (Person) o2;
					return p1.id - p2.id;
				}
				return 0;
			}
		});
		
		
		//swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
//		Collections.swap(list, 0, 3);
		
		System.out.println(list);
	}
}










