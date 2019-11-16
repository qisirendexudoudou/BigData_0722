package com.atguigu.java2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/*
 	iterator（） : 返回迭代器（Iterator接口）实现类的对象
 	
 	Iterator迭代器中的方法:
 		next() : 1.指针下移   2.返回指针指向的元素
 		hasNext() : 判断是否还有下一个元素，如果有返回true
 */
public class IteratorTest {
	
	/*
	 * 大家常犯的错误
	 */
	@Test
	public void test3(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("ccc");
		c.add("eee");
		c.add("fff");
		
		Iterator iterator = c.iterator();
		
		while(iterator.next() != null){
			System.out.println(iterator.next());
		}
		
	}

	
	/*
	 * 大家常犯的错误
	 */
	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("ccc");
		c.add("eee");
		c.add("fff");
		
		//下面的代码不对 ：c.iterator()每调用一次就返回一个新的对象。
//		while(c.iterator().hasNext()){
//			System.out.println(c.iterator().next());
//		}
	}

	@Test
	public void test(){
		
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("ccc");
		c.add("eee");
		c.add("fff");
		
		//遍历集合中的元素：
		Iterator iterator = c.iterator();
		//next() : 1.指针下移   2.返回指针指向的元素
//		Object obj = iterator.next();
//		System.out.println(obj);
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
		//注意：有x个元素，可以调用x次next()，一旦超过x次就会发生异常
//		System.out.println(iterator.next());
		
		
		//hasNext() : 判断是否还有下一个元素，如果有返回true
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}













