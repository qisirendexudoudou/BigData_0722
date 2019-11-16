package com.atguigu.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

/*
 	增强for循环（foreach循环）：
 	
 	格式：
 		for(元素的类型  变量名 ： 数组、集合的对象){
 		
 		}
 	作用 ： 用来遍历数组和集合中的元素。（只能遍历数组和集合中的元素）
 */
public class ForeachTest {
	
	/*
	 * 注意：
	 */
	@Test
	public void test3(){
		String[] names = {"cangjie","longge","bojie","qiangge"};
		
		
/*		for (int i = 0; i < names.length; i++) {
			names[i] = "yinge"; //直接对数组进行操作
		}*/
		
		
		/*
		 * 1.从names取出元素赋值给name
		 * 2.修改name的值并不会影响数组中的元素。
		 * 例：
		 * 	 String name = names[0];
		 *   name = "yingge";
		 */
		for (String name : names) {
			name = "yinge"; //修改的是局部变量的内容
		}
		
		System.out.println(Arrays.toString(names));
	}
	
	@Test
	public void test2(){
		Collection c = new ArrayList();
		c.add("aaa");
		c.add("ccc");
		c.add("fff");
		c.add("ddd");
		//遍历集合中的元素
		for(Object obj : c){
			System.out.println(obj);
		}
	}

	@Test
	public void test(){
		String[] names = {"cangjie","longge","bojie","qiangge"};
		//使用增强for循环遍历数组中的元素
		for(String name : names){
			System.out.println(name);
		}
	}
}
