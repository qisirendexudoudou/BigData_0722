package com.atguigu.lgl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;



public class CollectionTest {
	
	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add("aa");
		c.add("cc");
		c.add("dd");
		c.add(11);//基本数据类型需要转成包装类才能放入集合中
		System.out.println(c.size());//输出集合中的元素个数
		System.out.println("---------------------------");
		
		Collection c2 = new ArrayList();
		c2.add("bb");
		c.addAll(c2);
		System.out.println(c);
		System.out.println("---------------------------");
		
		System.out.println(c2);
		c2.clear();
		System.out.println(c2);
		System.out.println("---------------------------");
		
		System.out.println(c2.isEmpty());
		System.out.println("---------------------------");
		
		System.out.println(c.contains("cc"));
		System.out.println("---------------------------");
		
		Collection c3 = new ArrayList();
		c3.add("dd");
		c3.add("ee");
		System.out.println(c.containsAll(c3));//也是调用元素的equals方法来比较的。拿两个集合的元素挨个比较。
											  //注意 ： 我们向Collection添加自定义类的对象，那么该对象所在的类必须重写equals方法。
		System.out.println("---------------------------");
		
		
		System.out.println(c);
		System.out.println(c.remove("cc")); //判断要删除的元素是否存在，如果存在删除找到的第一个元素并返回true，否则返回false
		System.out.println(c);
		System.out.println("---------------------------");
		
		
		Collection c4 = new ArrayList();
		c4.add("ee");
		c4.add("bb");
		System.out.println(c);
		System.out.println(c4);
		System.out.println(c.removeAll(c4));//取当前集合的差集给c，并且返回true，否则返回false
		System.out.println(c);
		System.out.println(c4);//不影响c4集合中元素
		
//		System.out.println(c.retainAll(c4));//取当前集合的交集给c，并且返回true，否则返回false
//		System.out.println(c);
//		System.out.println(c4);//不影响c4集合中元素
		System.out.println("---------------------------");

		Collection c5 = new ArrayList();
		c5.add("ee");
		c5.add("bb");
		System.out.println(c);
		System.out.println(c5);
		System.out.println(c.equals(c5));//equals()比较的是两个集合元素的个数，顺序，内容。只要有一个不符合就为false
		System.out.println("---------------------------");
		
		System.out.println("++++");
		Object[] array = c.toArray();//转成对象数组Object[] toArray()
		System.out.println(Arrays.toString(array));
		System.out.println("---------------------------");
		
		
		System.out.println(c);
		System.out.println(c.hashCode());//获取集合对象的哈希值,先理解成地址值，同一个对象的哈希值是相同的，不同的对象的哈希值是不同的
		System.out.println(c.hashCode());
		System.out.println(c5.hashCode());
		System.out.println(c5.hashCode());
		System.out.println("---------------------------");
		
		System.out.println(c);
		//方式一
		for (Object o : c) {//foreach循环
			System.out.println(o);
		}
		//方式二
		Iterator it = c.iterator();
		while (it.hasNext()) {//hasNext() : 判断是否还有下一个元素，如果有返回true
			System.out.println(it.next());//next() : 1.指针下移   2.返回指针指向的元素
		}
		
		
		
	}	
	

}
