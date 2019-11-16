package com.atguigu.lgl;

import java.util.ArrayList;
import java.util.List;

public class Collection__ListTest {

	public static void main(String[] args) {
		
		new ArrayList();//底层创建了一个长度为10的数组
		new ArrayList(20);//创建了一个长度为20 的数组
		System.out.println("----------------------");
		
		List list = new ArrayList();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("bb");
		list.add("cc");
		System.out.println(list);
		System.out.println("----------------------");
		
		list.add(0, "AA");//在0位置插入AA元素
		System.out.println(list);
		System.out.println("----------------------");
		
		List list2 = new ArrayList();
		list2.add("mm");
		list2.add("nn");
		boolean addAll = list.addAll(list2);//将list2中的所有元素添加进来
		System.out.println(addAll);//返回结果
		System.out.println(list);
		
//		boolean addAll2 = list.addAll(1, list2);//从1位置开始，将list2中的所有元素添加进来
//		System.out.println(addAll2);//返回结果
//		System.out.println(list);
		System.out.println("----------------------");
		
		System.out.println(list.get(5));//获取指定2位置的元素
		System.out.println(list.indexOf("bb"));//返回bb在集合中首次出现的位置
		System.out.println(list.lastIndexOf("bb"));//返回bb在集合中末次出现的位置
		System.out.println(list.remove(2));//移除指定2位置的元素，并返回此元素
		System.out.println(list);
		System.out.println(list.set(0, "luogaolong"));//设置指定0位置的元素为luogaolong
		System.out.println(list);
		System.out.println(list.subList(0,2));//返回从0到2位置的子集合 (左闭右开)

	}
}
