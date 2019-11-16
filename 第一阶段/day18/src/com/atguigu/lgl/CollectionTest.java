package com.atguigu.lgl;

import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class CollectionTest {
	
	@Test
	public void test(){
		//terator()：返回迭代器对象，用于集合遍历
		
	}
	
/*	@Test
	public void test(){
		Person p = new Person("aa", 12);
		System.out.println(p.hashCode());
		System.out.println(p.hashCode());
		System.out.println(p.hashCode());//同一个对象的哈希值是相同的，不同的对象的哈希值是不同的)
		
		Person p2 = new Person("aa", 12);
		System.out.println(p2.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p2.hashCode());
		
	}*/
	
	
/*	@Test
	public void test(){
		Collection c = new ArrayList();
		c.add("aa");
		c.add("bb");
		c.add("cc");
		Collection c2 = new ArrayList();
		c2.add("bb");
		c2.add("cc");
		System.out.println(c.equals(c2));//equals()比较的是两个集合元素的个数，顺序，内容。只要有一个不符合就为false
		
		//转成对象数组Object[] toArray()
		Object[] array = c2.toArray();
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
	}*/
	
/*	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		
		boolean remove = c.remove("aaaa");//通过元素的equals方法判断是否是要删除的元素，只会删除找到的第一个元素
		System.out.println(remove);
		System.out.println(c);
		
		Collection c2 = new ArrayList();
		c2.add("bbb");
		c2.add("eee");
		
//		c.removeAll(c2);//取当前集合的差集  c2中不受影响
//		System.out.println(c);
//		System.out.println(c2);
		
		c.retainAll(c2);
		System.out.println(c);
		System.out.println(c2);
		
		
		
		
		
	}*/

	/*	@Test
	public void test(){
		
		//add.(object o)添加元素
		Collection c = new ArrayList();//多态
		c.add("aaa");
		c.add(11);//自动装箱
		System.out.println(c);
		
		//addall(Collection c):将集合c中的元素分别添加到当前集合中
		Collection c2 = new ArrayList();
		c2.add("bbcb");
		c.addAll(c2);
		System.out.println(c);
		
		c.clear();//清空集合
		System.out.println(c);
		
		System.out.println(c.isEmpty());//判断是否是空集合
		
		Collection c3 = new ArrayList();//多态
		c3.add("aaa");
		c3.add("bbb");
		c3.add("ccc");	
		c3.add(new Person("xiaoxu", 14));
		c3.add(new String("abcd"));
		System.out.println(c3);
		//是否包含某个元素
		boolean contains = c3.contains("aaa");
		System.out.println(contains);//通过元素的equals方法来判断是否是同一个对象
		contains = c3.contains(new Person("xiaoxu", 14));
		System.out.println(contains);//通过调用元素的equals方法来判断，两个集合中的元素挨个比较
		contains = c3.contains(new String("abcd"));
		System.out.println(contains);

		
	}*/
}
