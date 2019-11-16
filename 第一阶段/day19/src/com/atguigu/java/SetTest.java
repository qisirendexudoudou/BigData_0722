package com.atguigu.java;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.junit.Test;

/*
 	|----Set
 		|-----HashSet:Set的主要实现类
 			|-----LinkedHashSet:LinkedHashSet继承了HashSet,底层实现原来和HashSet一样。LinkedHashSet遍历元素的时候
	  					可以安照添加元素的顺序进行遍历，因为底层维护了一张链表用来记录元素添加的顺序。
 		|-----TreeSet: 可以对添加的元素（的指定的属性）进行排序
 */
public class SetTest {
	
	/**
	 * TreeSet :可以对添加的元素（的指定的属性）进行排序
	   	说明：
	   		1.TreeSet中添加的元素的类型必须一致。
	   		2.TreeSet的底层是红黑树
	   	
	   	排序的方式 ： 定制排序  vs 自然排序
	   	
	   	自然排序：
	   		1.自定义一个类实现Comparable接口
	   		2.重写compareTo方法
	   		3.在方法中安照指定的属性进行排序
	   		4.向集合中添加元素即可
	   		
	   	思考： 1.定制排序和自然排序都存在的情况下谁起作用？
	   		 2.定制排序和自定排序哪个更灵活？
	 */
	
	/**
	 * 定制排序：
	  		1.创建Comparator实现类的对象
	  		2.重写compare方法
	  		3.在compare方法中安照指定的属性进行排序
	  		4.将Comparator实现类的对象作为实参传递到TreeSet的构造器中
	  		5.将对象添加到集合中即可
	 */
	@Test
	public void test4(){
		//创建匿名内部类的对象
		Comparator ct = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Cat && o2 instanceof Cat){
					Cat c1 = (Cat) o1;
					Cat c2 = (Cat) o2;
					return c1.age - c2.age;
				}
				return 0;
			}
		};
		
		
		TreeSet set = new TreeSet(ct);
		set.add(new Cat("cc", 2));
		set.add(new Cat("aa", 1));
		set.add(new Cat("dd", 3));
		set.add(new Cat("ff", 4));
		
		System.out.println(set);
	}
	
	/**
	 * 自然排序
	 */
	@Test
	public void test3(){
		TreeSet set = new TreeSet();
		set.add(new Dog("aa", 2));
		set.add(new Dog("aa", 30));
		set.add(new Dog("aa", 5));
		set.add(new Dog("cc", 1));
		set.add(new Dog("dd", 3));
		set.add(new Dog("ff", 4));
		
		System.out.println(set);
	}
	
	
	
	@Test
	public void test2(){
		
		TreeSet set = new TreeSet();
//		set.add("aaa");
//		set.add("fff");
//		set.add("eee");
//		set.add("ddd");
//		set.add("ccc");
		
		set.add(11);
		set.add(1);
		set.add(5);
		set.add(6);
		set.add(2);
		
		System.out.println(set);
	}

	/**
	 * LinkedHashSet: LinkedHashSet继承了HashSet,底层实现原来和HashSet一样。LinkedHashSet遍历元素的时候
	 * 		可以安照添加元素的顺序进行遍历，因为底层维护了一张链表用来记录元素添加的顺序
	 */
	@Test
	public void test(){
		LinkedHashSet set = new LinkedHashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		
		System.out.println(set);
	}
}
