	package com.atguigu.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.junit.Test;

/*
 * Stream中间操作
 */
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
	/*
	  sorted()——自然排序
	  sorted(Comparator com)——定制排序

	 */
	@Test
	public void test5(){
		list.stream()
//			.sorted((o1,o2) -> o1.age - o2.age)
			.sorted((o1,o2) -> o1.name.compareTo(o2.name))
			.forEach(System.out::println);
	}
	
	/*
	 *  map(Function f)——接收一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素。
		
		flatMap(Function f)——接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。

	 */
	//练习：获取员工姓名长度大于3的员工的姓名。
	@Test
	public void test4(){
		list.stream()
			.map(p -> p.name)
			.filter(name -> name.length() > 3)
			.forEach(System.out::println);
	}
	@Test
	public void test3(){
		String[] names = {"xiaocang","cangjie","bojie"};
		//需求：将每一个名字中的字符变成大写
		Arrays.stream(names)
//			.flatMap(name -> Arrays.stream(name.split(""))) //将每一个元素切成数组后，再将数组转成流并返回
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
			/*
			.map(new Function<Person, Integer>() {

				@Override
				public Integer apply(Person t) {
					return t.age;
				}
				*/
			.map(t -> t.age)
			.filter(t -> t >= 20)
			.forEach(System.out::println);
	}
	
	/*
	 *  filter(Predicate p)——接收 Lambda ， 从流中排除某些元素。
		limit(n)——截断流，使其元素不超过给定数量。
		skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
		distinct()——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素

	 */
	@Test
	public void test(){
		list.stream()
			.filter(p -> p.score >= 60) //过滤
			.limit(5) //截断流，使其元素不超过给定数量。
			.skip(2) //跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
			.distinct() //去重
			.forEach(System.out::println);
	}
}






