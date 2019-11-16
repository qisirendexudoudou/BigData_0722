package com.atguigu.java2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapAPI {

	/**
	 * Set keySet()：返回所有key构成的Set集合
		Collection values()：返回所有value构成的Collection集合
		Set entrySet()：返回所有key-value对构成的Set集合

	 */
	@Test
	public void test5(){
		HashMap map = new HashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		map.put("ccc", "CCC");
		
		Set keySet = map.keySet();
		for (Object key : keySet) {
			System.out.println(key);
		}
		
		System.out.println("---------------");
		
		Collection values = map.values();
		for (Object value : values) {
			System.out.println(value);
		}
		System.out.println("---------------");
		
		Set entrySet = map.entrySet();
		for (Object entry : entrySet) {
			Map.Entry e = (Map.Entry) entry;
			System.out.println(e.getKey() + "-----" + e.getValue());
		}
	}
	
	/**
	 * Object get(Object key)：获取指定key对应的value
		boolean containsKey(Object key)：是否包含指定的key
		boolean containsValue(Object value)：是否包含指定的value
		int size()：返回map中key-value对的个数
		boolean isEmpty()：判断当前map是否为空
		boolean equals(Object obj)：判断当前map和参数对象obj是否相等

	 */
	@Test
	public void test4(){
		HashMap map = new HashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "BBB");
		
		HashMap map2 = new HashMap();
		map2.put("bbb", "BBB");
		map2.put("aaa", "AAA");
		
		System.out.println(map.equals(map2));
		
	}
	@Test
	public void test3(){
		HashMap map = new HashMap();
		map.put("aaa", "AAA");
		map.put("ccc", new Student("小龙哥", 18));
		
		//Object get(Object key)：获取指定key对应的value
		Object value = map.get("aaa");
		System.out.println(value);
		
		//boolean containsKey(Object key)：是否包含指定的key
		System.out.println(map.containsKey("aaa"));
		
		//boolean containsValue(Object value)：是否包含指定的value
		System.out.println(map.containsValue(new Student("小龙哥", 18)));
	}
	
	/**
	 *  Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
		void putAll(Map m):将m中的所有key-value对存放到当前map中
		Object remove(Object key)：移除指定key的key-value对，并返回value
		void clear()：清空当前map中的所有数据

	 */
	@Test
	public void test2(){
		HashMap map = new HashMap();
		map.put("aaa", "AAA");
		//key中存放的对象所在的类必须重写equals和hashCode方法
		map.put(new Person("强哥", 10), "qiangge");
		
//		HashMap map2 = new HashMap();
//		map2.put("bbb", "BBB");
//		map2.put("ccc", "CCC");
//		map2.put("ddd", "DDD");
//		map.putAll(map2);
//		System.out.println(map);
		
		
		
		//Object remove(Object key)：移除指定key的key-value对，并返回value
//		Object value = map.remove(new Person("强哥", 10));
//		System.out.println("map=" + map);
//		System.out.println("value=" + value);
		
		map.clear();
		System.out.println();
		
	}
}
