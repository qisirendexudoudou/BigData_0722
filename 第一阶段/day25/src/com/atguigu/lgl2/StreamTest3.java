package com.atguigu.lgl2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;


//stream的终止操作
public class StreamTest3 {
	
	static List<Person> list = new ArrayList<>();
	static{
		list.add(new Person("aa", 18, 100));
		list.add(new Person("abc", 30, 80));
		list.add(new Person("cdb", 30, 80));
		list.add(new Person("bca", 30, 60));
		list.add(new Person("eeff", 16, 59));
	}
	
	//3-收集
	/*
	 * collect(Collector c)	将流转换为其他形式。
	 * 接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
	 */
	@Test
	public void test3(){
		String[] names={"aa","cc","bb"};
		List<String> collect = Arrays.stream(names).collect(Collectors.toList());
		System.out.println(collect);
	}
	
	@Test
	public void test3_3(){
		List<String> collect = list.stream().map(p->p.name).collect(Collectors.toList());
		System.out.println(collect);
	}
	
	
	
	
	//2-规约
	/*
	 * 	reduce(T iden, BinaryOperator b)	可以将流中元素反复结合起来，得到一个值。返回 T
		reduce(BinaryOperator b)	可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
	 */
	@Test
	public void test2(){
		Integer[] numbers = {1,2,3,4,5};
		Optional<Integer> reduce = Arrays.stream(numbers).reduce((t,u)->t+u);
		System.out.println(reduce.get());
		
		Integer reduce2 = Arrays.stream(numbers).reduce(2, (t,u)->t+u);
		System.out.println(reduce2);
	}
	
	@Test
	public void test2_2(){
		Optional<Integer> reduce = list.stream()
		.map(p->p.score)
		.reduce((t,u)->t+u);
		System.out.println(reduce.get());
	}
	
	
	
	//1-匹配与查找
	/*
	 * 	allMatch(Predicate p)	检查是否匹配所有元素
		anyMatch(Predicate p)	检查是否至少匹配一个元素
		noneMatch(Predicate  p)	检查是否没有匹配所有元素
		findFirst()	返回第一个元素
		findAny()	返回当前流中的任意元素
		count()	返回流中元素总数
		max(Comparator c)	返回流中最大值
		min(Comparator c)	返回流中最小值
		forEach(Consumer c)	内部迭代(使用 Collection 接口需要用户去做迭代，称为外部迭代。
							相反，Stream API 使用内部迭代——它帮你把迭代做了)
	 */
	@Test
	public void test1(){
		boolean allMatch = list.stream().allMatch(p->p.age>18);
		System.out.println(allMatch);
		System.out.println("-----------------");
		
		boolean anyMatch = list.stream().anyMatch(p->p.age>18);
		System.out.println(anyMatch);
		System.out.println("-----------------");
		
		boolean noneMatch = list.stream().noneMatch(p->p.age>18);
		System.out.println(noneMatch);
		System.out.println("-----------------");
		
		Optional<Person> findFirst = list.stream().sorted((o1,o2)->o1.age-o2.age).findFirst();
		System.out.println(findFirst.get());
		System.out.println("-----------------");
		
		Optional<Person> findAny = list.stream().findAny();
		System.out.println(findAny.get());
		System.out.println("-----------------");
		
		Optional<Integer> max = list.stream().map(p->p.age).max((o1,o2)->o1-o2);
		System.out.println(max.get());
		System.out.println("-----------------");
		
		Optional<Integer> min = list.stream().filter(p->p.score>60).map(p->p.age).min((o1,o2)->o1-o2);
		System.out.println(min.get());
		
	}
}
