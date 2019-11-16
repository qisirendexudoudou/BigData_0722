package com.atguigu.lgl;

import java.security.Permissions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.atguigu.java.Person;

/**
 * Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
Object min(Collection)
Object min(Collection，Comparator)
int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
void copy(List dest,List src)：将src中的内容复制到dest中
boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值

 */
public class CollectionsTest {

	@Test
	public void test2(){
		List list = new ArrayList();
		list.add("aa");
		list.add("cc");
		list.add("bb");
		list.add("cc");
		
//		System.out.println(Collections.max(list));
//		System.out.println(list);
//		System.out.println("-------------------------------");

		
//		List list2 = new ArrayList();
//		list2.add(new Dog(12,"xiaoxu"));
//		list2.add(new Dog(15,"haha"));
//		list2.add(new Dog(14,"hehe"));
//		list2.add(new Dog(11,"xixi"));
//		System.out.println(list2);
//		Object max = Collections.max(list2, new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				if (o1 instanceof Dog && o2 instanceof Dog) {
//					Dog d1 = (Dog) o1;
//					Dog d2 = (Dog) o2;
//					return d1.age - d2.age;
//				}
//				return 0;
//			}
//		});
//		System.out.println(max);
		
		System.out.println(Collections.min(list));
		
		System.out.println(Collections.frequency(list, "cc"));
		
		Collections.replaceAll(list, "cc", "GG");
		System.out.println(list);
		
		
	}
	
	
	/**
		reverse(List)：反转 List 中元素的顺序
		shuffle(List)：对 List 集合元素进行随机排序
		sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
		sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
		swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换

	 */
	@Test
	public void test1(){
		List list = new ArrayList();
		list.add("aa");
		list.add("cc");
		list.add("bb");
		list.add("cc");
		list.add("dd");
//		Collections.reverse(list);
//		System.out.println(list);
//		System.out.println("---------------");
		
//		Collections.shuffle(list);
//		System.out.println(list);
//		System.out.println("---------------");
		
//		Collections.sort(list);
//		System.out.println(list);
//		System.out.println("---------------");
		
//		List list2 = new ArrayList();
//		list2.add(new Dog("haha", 12));
//		list2.add(new Dog("hehe", 11));
//		list2.add(new Dog("xixi", 13));
//		list2.add(new Dog("enen", 14));
//		
//		Collections.sort(list, new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				if (o1 instanceof Dog && o2 instanceof Dog) {
//					Dog d1 = (Dog) o1;
//					Dog d2 = (Dog) o2;
//					return d1.age-d2.age;
//				}
//				return 0;
//			}
//		});
//	System.out.println(list2);
		
		System.out.println(list);
		Collections.swap(list, 0, 4);
		System.out.println(list);
	}
	
	
}
