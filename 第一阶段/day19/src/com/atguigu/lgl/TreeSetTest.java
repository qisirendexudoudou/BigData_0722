package com.atguigu.lgl;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

import junit.framework.ComparisonCompactor;

/**
		TreeSet: 可以对添加的元素（的指定的属性）进行排序
		
		说明：
			1.TreeSet中添加的元素的类型必须一致。
	   		2.TreeSet的底层是红黑树
	   		
	   	排序的方式：
	   		1.自然排序：
	   				1.自定义一个类实现Comparable接口
	   				2.重写compareTo方法
	   				3.在方法中安照指定的属性进行排序
	   				4.向集合中添加元素即可
	   		2.定制排序：
	   				1.创建Comparator实现类的对象
	  				2.重写compare方法
	  				3.在compare方法中安照指定的属性进行排序
	  				4.将Comparator实现类的对象作为实参传递到TreeSet的构造器中
	  				5.将对象添加到集合中即可
	   		
 */
public class TreeSetTest {
	
	//定制排序
	@Test
	public void test2(){
		Comparator ct = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Cat && o2 instanceof Cat) {
					Cat c1 = (Cat) o1;
					Cat c2 = (Cat) o2;
					
					return c1.age - c2.age;
				}
				return 0;
			}
		};
		
		TreeSet set = new TreeSet(ct);
		set.add(new Cat("aa", 1));
		set.add(new Cat("cc", 4));
		set.add(new Cat("dd", 2));
		set.add(new Cat("bb", 3));
		System.out.println(set);
	}
	
	
	//自然排序
	@Test
	public void test(){
		TreeSet set =  new TreeSet();
		
/*		//按照年纪排序
		set.add(new Dog("aa", 1));
		set.add(new Dog("cc", 5));
		set.add(new Dog("bb", 3));
		set.add(new Dog("bb", 4));
		set.add(new Dog("bb", 2));
		*/
		
/*		//按照姓名排序
		set.add(new Dog("aa", 1));
		set.add(new Dog("cc", 5));
		set.add(new Dog("bb", 3));
		set.add(new Dog("ee", 4));
		set.add(new Dog("dd", 2));*/
		
		//名字一样时，按照年纪排序
		set.add(new Dog("bb", 1));
		set.add(new Dog("cc", 5));
		set.add(new Dog("bb", 3));
		set.add(new Dog("bb", 4));
		set.add(new Dog("aa", 2));
		System.out.println(set);
	}
	
	
	
	
	
	
	
	
	
	

}
