package com.atguigu.lgl;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

/*
 * 函数式接口：只包含一个抽象方法的接口
 * 可以再接口上使用@FunctionalInterface 注解来检查它是否是一个函数式接口
 */


//java提供的四大函数式接口
public class FunctionalTest {

	
	//方法 ： 有参无返回值
	@Test
	public void test1(){
		
		Consumer<String> con1 = t -> System.out.println(t);
	}
	
	//方法 : 无参有返回值
	@Test
	public void test2(){
		Supplier<String> con2 = () -> "aaa";
	}
	
	//方法 ： 有参有返回值
	@Test
	public void test3(){
		Function<String,Boolean> con3 = t -> "aa".equals(t);
	}
	
	//方法： 有参 有返回值（boolean）
	@Test
	public void test4(){
		Predicate<Integer> con4 = t -> false;
	}
	
	
}
