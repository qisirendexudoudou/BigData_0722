package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.TreeMap;

import org.junit.Test;

/**
 
 	Map(双列集合)：
	
	一 Map的体系结构：
	
		|-----Map
			|-----HashMap:Map的主要实现类,线程不安全的。key和value可以存储null值
			
				|-----LinkedHashMap：LinkedHashMap是HashMap的子类，底层和HashMap一样。
	  						可以安照元素添加的顺序进行遍历。因为底层维护了一张链表记录了元素添加的顺序。
				
			|-----TreeMap:TreeMap可以对key中的元素安照指定的属性进行排序。（不能对value排序）
			
			|-----Hashtable:古老的实现类，线程安全的，key和value不可以存储null值
			
				|-----Properties:Properties的key和value都是String类型，一般用来读取配置文件。
				
				
	[面试题]HashMap和Hashtable的区别？
	
	说明：
		1.LinkedHashSet的底层就是LinkedHashMap
		2.TreeSet的底层就是TreeMap,向TreeSet添加的元素其实添加到了TreeMap的key中。
 */
public class MapTest {
	/**
	 * 读取配置文件的内容
	 * @throws FileNotFoundException 
	 */
	@Test
	public void test4(){
		FileInputStream fis = null;
		try {
			//1.创建Properties对象
			Properties ps = new Properties();
			//2.创建流的对象
			 fis = new FileInputStream("person.properties");
			//3.加载流
			ps.load(fis);
			//4.读取内容
			String username = ps.getProperty("username");
			String password = ps.getProperty("password");
			System.out.println(username + "-" + password);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			
			try {
				if(fis != null){
					//5.关流 - 关闭资源
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	/**
	 * TreeMap:TreeMap可以对key中的元素安照指定的属性进行排序。（不能对value排序）
	 * 
	 * TreeMap排序的方式 ： 自然排序  vs 定制排序
	 */
	@Test
	public void test3(){
		TreeMap map = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		map.put(new Dog("aaa",2), 12);
		map.put(new Dog("ccc",1), 10);
		map.put(new Dog("bbb",3), 120);
		map.put(new Dog("ddd",4), 1);
		System.out.println(map);
	}
	
	/**
	 * LinkedHashMap是HashMap的子类，底层和HashMap一样。
	 * 可以安照元素添加的顺序进行遍历。因为底层维护了一张链表记录了元素添加的顺序。
	 */
	@Test
	public void test2(){
		LinkedHashMap map = new LinkedHashMap();
		map.put("aaa", "AAA");
		map.put("bbb", "AAA");
		map.put("ccc", "AAA");
		map.put("ddd", "AAA");
		map.put("eee", "AAA");
		
		System.out.println(map);
	}

	@Test
	public void test(){
		HashMap map = new HashMap();
		map.put(null, null);
		
		System.out.println("--------------------");
		
		Hashtable table = new Hashtable();
		table.put(null, "aaa");//key和value不可以存储null值
	}
}











