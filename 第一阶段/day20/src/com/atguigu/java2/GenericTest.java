package com.atguigu.java2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import com.atguigu.java.Dog;

/**
	
	泛型：
	
	一  泛型在集合中的使用
	
	二   自定义泛型类，泛型接口，泛型方法
	
	三   通配符的使用
 */
public class GenericTest {
	
	@Test
	public void test3(){
		
		TreeSet<String> set = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return -o1.compareTo(o2);
			}
		});
		set.add("aaa");
	}
	
	/**
	 * 集合中使用泛型的案例
	 * 
	 * 1.可以在初始化的时候指明泛型的类型
	 * 2.在初始化的时候指明了泛型的类型，那么该类中凡是使用到了泛型的地方都被具体化了。（指明的泛型类就决定了类中泛型的类型）
	 * 3.在初始化的时候如果没有指明泛型的类型，那么默认为Object。
	 */
	@Test
	public void test2(){
		//当前集合中只能添加String类型的对象
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.set(0, "ccc");
		String str = list.get(0);
		System.out.println(list);
		for (String string : list) {
			System.out.println(string.toUpperCase());
		}
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(111);
		list2.set(0, 222);
		
		//------------------------------
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("aa", 111);
		map.put("cc", 222);
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key);
		}
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "------" + entry.getValue());
		}
		
		
	}

	/**
	 * 集合中没有使用泛型的案例
	 */
	@Test
	public void test(){
		
		List list = new ArrayList();
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		Object obj = list.get(0);
		
		
		showInfo(list);
		System.out.println(list);
	}
	
	//需求：将字符串的内容转成大写
	public void showInfo(List list){
		for (Object obj : list) {
			String str = (String) obj;
			System.out.println(str.toUpperCase());
		}
	}
}

















