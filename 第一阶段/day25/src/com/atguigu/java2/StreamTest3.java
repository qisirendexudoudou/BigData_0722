package com.atguigu.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import org.junit.Test;

public class StreamTest3 {
	static List<Person> list = new ArrayList<>();
	static{
		list.add(new Person("aa", 18, 100));
		list.add(new Person("abc", 30, 80));
		list.add(new Person("cdb", 30, 80));
		list.add(new Person("bca", 30, 60));
		list.add(new Person("eeff", 16, 59));
	}
	/*
	 * collect(Collector c)——将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
练习1：查找工资大于6000的员工，结果返回为一个List或Set

	 */
	@Test
	public void test7(){
		String[] names = {"aa","cc","dd"};
		
		List<String> collect = Arrays.stream(names)
			.collect(Collectors.toList());
		
		System.out.println(collect);
	}
	/*
	 *  reduce(T identity, BinaryOperator)——可以将流中元素反复结合起来，得到一个值。返回 T  
		练习1：计算1-10的自然数的和
		reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
		练习2：计算公司所有员工工资的总和

	 */
	@Test
	public void test6(){
		
		//计算所有人的年纪的和
		Optional<Integer> reduce = list.stream()
			.map(p -> p.age)
			.reduce((a,b) -> a + b);
		System.out.println(reduce.get());
		
		//计算所有的成绩的总和
		list.stream()
			.map(p -> p.score)
			.reduce((a,b)->a + b);
		
		//计算1-10的自然数的和
//		计算公司所有员工工资的总和
			
			
	}
	@Test
	public void test5(){
		Integer[] numbers = {1,2,3,4,5};
		Integer reduce = Arrays.stream(numbers)
			.reduce(10, (t,u)-> t + u);
		System.out.println(reduce);
	}
	@Test
	public void test4(){
		
		Integer[] numbers = {1,2,3,4,5};
		/*
		Optional<Integer> reduce = Arrays.stream(numbers)
			.reduce(new BinaryOperator<Integer>() {
				
				//t的值是上一次该方法的返回值
				//u是集合中的每一个元素
				@Override
				public Integer apply(Integer t, Integer u) {
					System.out.println("t=" + t + " u=" + u);
					return t + u;
				}
			});
		*/
		
		Optional<Integer> reduce = Arrays.stream(numbers)
			.reduce((t,u)-> t + u);
		System.out.println(reduce.get());
		
	}
	/*
	 *  allMatch(Predicate p)——检查是否匹配所有元素。练习：是否所有的员工的年龄都大于18
		anyMatch(Predicate p)——检查是否至少匹配一个元素。练习：是否存在员工的工资大于 10000
		noneMatch(Predicate p)——检查是否没有匹配的元素。练习：是否存在员工姓“雷”
		findFirst——返回第一个元素
		findAny——返回当前流中的任意元素
		count——返回流中元素的总个数
		max(Comparator c)——返回流中最大值
		练习：返回最高的工资：
		min(Comparator c)——返回流中最小值
		练习：返回最低工资的员工
		forEach(Consumer c)——内部迭代
	 */
	/*
	 * 练习：返回最低工资的员工
	 */
	@Test
	public void test3(){
		Optional<Person> min = list.stream()
			.min((o1,o2) -> o1.score - o2.score);
		System.out.println(min.get());
	}
	/*
	 * 练习：返回最高的成绩：
	 */
	@Test
	public void test2(){
		Optional<Integer> max = list.stream()
			.map(p -> p.score)
			.max((o1,o2) -> o1-o2);
		System.out.println(max.get());
	}
	@Test
	public void test(){
		boolean allMatch = list.stream()
			.allMatch(p -> p.age > 18);
		System.out.println(allMatch);
		
		boolean anyMatch = list.stream().anyMatch(p -> p.age < 18);
		System.out.println(anyMatch);
		
		boolean noneMatch = list.stream().noneMatch(p -> "雷".equals(p.name));
		System.out.println(noneMatch);
		
		Optional<Person> findFirst = list.stream().findFirst();
		System.out.println(findFirst.get());
		
		long count = list.stream().count();
		System.out.println(count);
		
		Optional<Person> max = list.stream().max((o1,o2) -> o1.age - o2.age);
		System.out.println(max.get());
	}
}
