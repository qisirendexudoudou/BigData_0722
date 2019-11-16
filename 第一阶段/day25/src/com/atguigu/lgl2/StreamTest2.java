package com.atguigu.lgl2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


//Stream中间操作
public class StreamTest2 {

	static List<Person> list = new ArrayList<>();
	static{
		list.add(new Person("aa", 18, 100));
		list.add(new Person("adc", 20, 50));
		list.add(new Person("ddcc", 30, 90));
		list.add(new Person("abc", 30, 80));
		list.add(new Person("abc", 30, 80));
		list.add(new Person("bca", 30, 60));
		list.add(new Person("eeff", 16, 59));
	}
	
	//3.排序
	/*
	 * sorted()——自然排序
	 * sorted(Comparator com)——定制排序
	 */
	@Test
	public void test4(){
		list.stream()
			.sorted((o1,o2)->o1.age-o2.age)
			.forEach(System.out::println);
		System.out.println("-----------------");
		
		list.stream()
		.sorted((o1,o2)->o1.score-o2.score)
		.forEach(System.out::println);
		System.out.println("-----------------");

	}
	@Test
	public void test5(){
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("hh");
		list2.add("aa");
		list2.add("cc");
		list2.add("bb");
		
		list2.stream()
			.sorted()
			.forEach(System.out::println);
}
	
	
	//2.映射
	/*
	 * flatMap(Function f)	接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
	 * map(Function f)	接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
	 */
	@Test
	public void test3(){
		String[] names = {"xiaocang","cangjie","bojie"};
		//需求：将每一个名字中的字符变成大写
		Arrays.stream(names)
			.flatMap((String name) -> {
				String[] ns = name.split("");
				return Arrays.stream(ns);
			})
			.map(x -> x.toUpperCase()) //转换
			.forEach(System.out::println);
	}
	
	@Test
	public void test2(){
		list.stream()
			.map(p -> p.name)
			.filter(name -> name.length() >3)
			.forEach(System.out::println);
	}
	
	
	
	
	
	/*  1.1-筛选与切片
	  	filter(Predicate p)	接收 Lambda ， 从流中排除某些元素
		distinct()	筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
		limit(long maxSize)	截断流，使其元素不超过给定数量
		skip(long n)	跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
	 */
	@Test
	public void test1(){
		list.stream()
			.filter(p -> p.age >=20)
			.distinct()
			.limit(3)
			.skip(2)
			.forEach(System.out::println);
	}
	
}
