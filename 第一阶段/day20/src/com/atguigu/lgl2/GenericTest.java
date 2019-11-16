package com.atguigu.lgl2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class GenericTest {
	
	//集合中使用泛型
	/**
	 * 1.可以在初始化的时候指明泛型的类型
	 * 2.在初始化的时候指明了泛型的类型，那么该类中凡是使用到了泛型的地方都被具体化了。（指明的泛型类就决定了类中泛型的类型）
	 * 3.在初始化的时候如果没有指明泛型的类型，那么默认为Object。
	 */
	@Test
	public void test2(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("cc");
		list.add("bb");
		list.set(0, "AA");
		System.out.println(list.get(0));
		
		for (String str : list) {
			String up = str.toUpperCase();
			System.out.println(up);
		}
		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "aa");
		map.put(3, "gg");
		map.put(2, "bb");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(key);
		}
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + "  "  + entry.getValue() );
		}
	
	}
	
	
	
	

	//不使用泛型将字符串的内容转换为大写
	@Test
	public void test1(){
		List list = new ArrayList();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		show(list);
	}
	
	public void show(List list){
		for (Object obj : list) {
			String str = (String) obj;
			String up = str.toUpperCase();
			System.out.println(up);
		}
	}
}
