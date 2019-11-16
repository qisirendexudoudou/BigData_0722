package com.atguigu.java;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

/*
 	函数式接口 ： 只包含一个抽象方法的接口，称为函数式接口。

	我们可以在一个接口上使用 @FunctionalInterface 注解，这样做可以检查它是否是一个函数式接口
 */
public class FunctionalTest {
	
	/*
	 * Java提供的四大函数式接口
	 */
	@Test
	public void test2(){
		//方法 ： 有参无返回值
		new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				
			}
		};
		
		Consumer<String> con = t -> System.out.println(t);
		
		
		System.out.println("----------------------------");
		
		//方法 : 无参有返回值
		new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		Supplier<String> sup = () -> "aaa";
		
		System.out.println("----------------------------");
		//方法 ： 有参有返回值
		new Function<String, Boolean>() {

			@Override
			public Boolean apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		Function<String,Boolean> fun = t -> "aaa".equals(t);
		
		System.out.println("----------------------------");
		
		//方法 ： 有参 有返回值（boolean）
		new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		Predicate<Integer> prd = t -> false;
	}

	@Test
	public void test(){
		
		new Comparable<String>() {

			@Override
			public int compareTo(String o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		System.out.println("------------lambda---------------");
		
		Comparable<String> con = o -> 1;
	}
}

@FunctionalInterface 
interface MyInterface{
	void say();
}
