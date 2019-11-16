package com.atguigu.lgl2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamTest {

	static List<Person> list = new ArrayList<>();
	static{
		list.add(new Person("aa", 18, 100));
		list.add(new Person("adc", 20, 50));
		list.add(new Person("ddcc", 30, 90));
		list.add(new Person("eeff", 16, 59));
	}	

	@Test
	public void test(){
		list.stream()
			.filter(p -> p.age >= 20)
			.forEach(System.out::println);
		System.out.println("---------");
		
		list.stream()
			.filter(p -> p.score >= 60)
			.forEach(System.out::println);
	}
	
	/*
	 * 创建stream的几种方式
	 */
	@Test
	public void test2(){
		//集合
		Stream<Person> stream = list.stream();
		//数组
		String[] names = {"a","b","c"};
		Stream<String> stream2 = Arrays.stream(names);
		//Stream.of()
		Stream<Integer> stream3 = Stream.of(1,2,3);
	}
	
	/*
	 * 创建无限流
	 	迭代
		public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f) 
		生成
		public static<T> Stream<T> generate(Supplier<T> s) 
	 */
	@Test
	public void test3(){
		Stream.iterate(0,t -> t+1).forEach(System.out::println);
	}
	
	@Test
	public void test4(){
		Stream.generate(Math::random).forEach(System.out::println);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
