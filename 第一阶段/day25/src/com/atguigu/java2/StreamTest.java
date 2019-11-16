package com.atguigu.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import org.junit.Test;


/*
 	
说明：是数据渠道，用于操作数据源（集合、数组等）所生成的元素序列。“集合讲的是数据，Stream讲的是计算！”

 注意：
 	①Stream 自己不会存储元素。
	②Stream 不会改变源对象。相反，他们会返回一个持有结果的新Stream。
	③Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行。

 */
public class StreamTest {

	static List<Person> list = new ArrayList<>();
	static{
		list.add(new Person("aa", 18, 100));
		list.add(new Person("adc", 20, 50));
		list.add(new Person("ddcc", 30, 90));
		list.add(new Person("eeff", 16, 59));
	}
	
	/*
	 * 演示
	 */
	@Test
	public void test(){
		list.stream().filter(p -> p.age >= 20).forEach(System.out::println);
	}
	
	/*
	 * 创建Stream
	 */
	@Test
	public void test2(){
		//1.通过集合创建Stream
		Stream<Person> stream = list.stream();
		//2.通过数组创建Stream - Arrays.stream()
		String[] names = {"aa","cc","dd"};
		Stream<String> stream2 = Arrays.stream(names);
		//3.通过Stream.of()
		Stream<Integer> stream3 = Stream.of(1,2,3,4,5,6,7);
	}
	
	/*
	 * 创建无限流
	 *  迭代
		public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f) 
		生成
		public static<T> Stream<T> generate(Supplier<T> s) 

	 */
	@Test
	public void test4(){
		/*
		Stream.generate(new Supplier<Double>() {

			@Override
			public Double get() {
			
				return Math.random();
			}
		}).forEach(System.out::println);
		*/
		
		Stream.generate(Math::random).forEach(System.out::println);
	}
	@Test
	public void test3(){
		/*
		 * 第一个参数 ： 0是初始值
		 */
		/*
		Stream.iterate(0, new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				System.out.println("=====" + t);
				return t + 1;
			}
		})
		.limit(5) //限制数据的个数
		.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		*/
		
		//lambda
//		Stream.iterate(0, t -> t + 1).forEach(t -> System.out.println(t));
		//方法的引用
		Stream.iterate(0, t -> t + 1).forEach(System.out::println);
	}
}














