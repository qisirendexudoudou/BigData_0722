package com.atguigu.java2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**

	Map(双列集合)：
	
	一 Map的体系结构：
	
		|-----Map
			|-----HashMap:
			
				|-----LinkedHashMap
				
			|-----TreeMap:
			
			|-----Hashtable:
			
				|-----Properties:
	
	二 说明：
		1.Map中存放的是健值对（key-value）。
		2.Map中所有的key可以看成是Set的集合，无序的不可重复的。
				key中存放的自定义类的对象必须重写equals和hashCode方法。
		3.Map中所有的value可以看成Collection的集合，无序的可重复的。
				value中存放的自定义类的对象必须重写equals方法。
		4.Map中的key和value（健值对）可以看成是一个一个的Entry（Node）。Entry是无序的且不可重复的。
				Entry在数组中的位置是由key来决定的。
	
	三 Set和Map的关系
		1.HashSet的底层就是HashMap,向HashSet中存放数据（必须重写equals和hashCode）其实就是存放到了HashMap的key中。
		
	
	四 HashMap的构造器：
		new HashMap() : 底层创建了一个长度为16的Node类型的数组，
		加载因子为0.75（16 * 0.75 = 12元素的个数超过12时就会进行扩容）。当我们添加第13个元素时，
		底层会进行扩容，扩容为原来的2倍。同时将原数组中的内容重新放到（重新计算在新数组中的位置）新的数组中。
		

	五 [面试题]HashMap的底层实现原理？
		当我们通过空参的构造器创建对象时，底层会创建一个长度为16加载因子为0.75的Node类型的数组。
		当我们向该容器中添加（k1,v1）时，会先通过调用k1的hashCode方法得出的哈希值来确定该元素在数组中存放的位置。
		如果该位置上没有其它元素则直接存入。如果该位置上已经存在其它元素(k2,v2)时，会调用k2的equals方法和k1进行比较。
		如果返回值为false则说明内容不同，将以链表的形式将该对象存放在该位置上。如果返回值为true,则说明内容相同那么v1覆盖v2。
		(在jdk1.8之后如果链表上的数量达到8时会将链表改成红黑树)
		

	六 为什么要扩容2倍？（扩展）
		
		p = tab[i = n - 1 & hash])  : n - 1 & hash是用来算元素存放的位置。n是数组的长度
		扩容2倍后的数字 ： n = 16  32  64
		
	x	0000			x2  0010
		1111				1101
		-----				----
		0000				0000
		
	x	0010			x2 0011
		1111			   1101
		----			--------
		0010			   0001
		
	x	1111
		1111
		----
		1111
	
	说明：
		1.x可以是 0 ~ 15之间任意的二进制和 15（1111）做&运算那么也能得到（0~15）之间的任意数值
		2.x2可以是0~15之间任意的二进制和（1101）做&运算那么得到结果中永远不可能得到2,3....等数值，也就是该索引位置将永远不可能存放数据，造成内存浪费。
 */
public class MapTest {
	
	@Test
	public void test2(){
		
	}
	

	@Test
	public void test(){
		HashMap map = new HashMap();
		map.put("aaa", "AAA");
		map.put("aaa", "AAAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		map.put("ddd", "DDD");
		
		System.out.println(map);
	}
}













