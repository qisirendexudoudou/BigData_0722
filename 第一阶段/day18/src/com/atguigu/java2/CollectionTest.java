package com.atguigu.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

/*
 	一 存储对象的容器： 数组，集合
 	
 	二1.数组在内存存储方面的特点：
		1.数组初始化以后，长度就确定了。
		2.数组声明的类型，就决定了进行元素初始化时的类型
	  2.数组在存储数据方面的弊端：
		1.数组初始化以后，长度就不可变了，不便于扩展
		2.数组中提供的属性和方法少，不便于进行添加、删除、插入等操作，且效率不高。同时无法直接获取存储元素的个数
		3.数组存储的数据是有序的、可以重复的。---->存储数据的特点单一
		
	三  集合分为两个体系 ： Collection接口（单列集合）和 Map接口（双列集合）
	
	四 
		|-----Collection(单列集合)
			|-----List: 存储的元素是有序的，可重复的
			|-----Set: 存储的元素是无序的，不可重复的

	五 Collection API
 */
public class CollectionTest {
	
	/*
	  10、获取集合对象的哈希值
	hashCode() - (先理解成地址值，同一个对象的哈希值是相同的，不同的对象的哈希值是不同的)
	 11、遍历
	iterator()：返回迭代器对象，用于集合遍历
	 */
	@Test
	public void test5(){
		Person p = new Person("aa",18);
		System.out.println(p.hashCode());
		System.out.println(p.hashCode());
		System.out.println(p.hashCode());
		
		Person p2 = new Person("aa",18);
		System.out.println(p2.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p2.hashCode());
	}
	
	/*
	  8、集合是否相等
	boolean equals(Object obj)
	 9、转成对象数组
	Object[] toArray()
	
	 */
	@Test
	public void test4(){
		//equals()比较的是两个集合元素的个数，顺序，内容。只要有一个不符合就为false
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("ccc");
		Collection c2 = new ArrayList();
		c2.add("aaa");
		c2.add("ccc");
		c2.add("ccc");
		System.out.println(c.equals(c2));
		
		//9、转成对象数组Object[] toArray()
		Object[] array = c.toArray();
		System.out.println(Arrays.toString(array));
	}
	
	/*
	 	6、删除
	boolean remove(Object obj) ：通过元素的equals方法判断是否是要删除的那个元素。只会删除找到的第一个元素
	boolean removeAll(Collection coll)：取当前集合的差集
	 7、取两个集合的交集
	boolean retainAll(Collection c)：把交集的结果存在当前集合中，不影响c

	 */
	@Test
	public void test3(){
		//boolean remove(Object obj) ：通过元素的equals方法判断是否是要删除的那个元素。只会删除找到的第一个元素
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("ccc");
		c.add(new Person("ccc",18));
		
//		c.remove("ccc");
//		c.remove(new Person("ccc",18));
//		System.out.println(c);
		
		
		//boolean removeAll(Collection coll)：取当前集合的差集(删除coll和当前集合交集的部分（相同的元素）)
//		Collection c2 = new ArrayList();
//		c2.add("aaa");
//		c2.add("ccc");
//		c2.add("ddd");
//		c.removeAll(c2);
		
		
		//boolean retainAll(Collection c)：把交集的结果存在当前集合中，不影响c (保留c和当前集合中交集的部分（相同的元素）)
		Collection c2 = new ArrayList();
		c2.add("aaa");
		c2.add("ccc");
		c2.add("ddd");
		c.retainAll(c2);
		
		System.out.println(c);
		System.out.println(c2);
		
		
	}

	/*
	 1、添加元素
	add(Object obj)
	addAll(Collection coll)
	2、获取有效元素的个数
	int size()
	3、清空集合
	void clear()
	4、是否是空集合
	boolean isEmpty()
	5、是否包含某个元素
	boolean contains(Object obj)：是通过元素的equals方法来判断是否是同一个对象
	boolean containsAll(Collection c)：也是调用元素的equals方法来比较的。拿两个集合的元素挨个比较。
	注意 ： 我们向Collection添加自定义类的对象，那么该对象所在的类必须重写equals方法。
	 */
	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("ccc");
		c.add("ddd");
		c.add("fff");
		c.add(new Person("cangjie", 18));
		c.add(new String("aabb"));
		
		//boolean contains(Object obj)：是通过元素的equals方法来判断是否是同一个对象
		boolean contains = c.contains("ccc");
		//当我们调用contains方法时，会去调用传入到这个方法中的实参所在类的equals方法和当前集合中所有的元素进行内容的比较。
		contains = c.contains(new Person("cangjie", 18));
//		contains = c.contains(new String("aabb"));
		System.out.println(contains);
		
		
		
		System.out.println("----------------------------------------------------------");
		
		//boolean containsAll(Collection c)：也是调用元素的equals方法来比较的。拿两个集合的元素挨个比较。
		Collection c2 = new ArrayList();
		c2.add("ccc");
		c2.add("ccc");
		c2.add("ccc");
		c2.add("ccc");
		c2.add("ccc");
//		c2.add("eee");
		boolean bo = c.containsAll(c2);
		System.out.println(bo);
	}
	@Test
	public void test(){
		//多态
		Collection c = new ArrayList();
		//add(Object o)添加元素
		c.add("ccc");
		c.add(111); //自动装箱
		
		Collection c2 = new ArrayList();
		c2.add(1);
		c2.add(2);
		
		//addAll(Collection c) :将c集合中的元素分别添加到当前集合中
		c.addAll(c2);
		
		//3、清空集合void clear()
		c.clear();
		
		System.out.println(c);
		//size() :当前集合中元素的个数
		System.out.println(c.size());
//		4、是否是空集合boolean isEmpty()
		System.out.println(c.isEmpty());
		
	}
}
























