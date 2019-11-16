package com.atguigu.lgl;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

/**
 	Iterator（）: 返回迭代器（Iterator接口）实现类的对象
 	
 	Iterator迭代器中的方法：
 			next():
 					1.指针下移
 					2.返回指针指向的元素
 			hashNext（）：判断是否还有下一个元素，如果有返回true
 			
 */



public class Iterator {
		@Test
		public void test(){
			Collection c = new ArrayList();
			c.add("aaa");
			c.add("bbb");
			c.add("ccc");
			
			//遍历集合中的元素
			java.util.Iterator iterator = c.iterator();//c.iterator()每调用一次就返回一个新的对象。
//			System.out.println(iterator.next());
//			System.out.println(iterator.next());
//			System.out.println(iterator.next());
			
			System.out.println("-------------");
			
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
