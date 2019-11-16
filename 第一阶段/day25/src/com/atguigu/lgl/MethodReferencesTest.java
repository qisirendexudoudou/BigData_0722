package com.atguigu.lgl;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.print.attribute.standard.PrinterState;

import org.junit.Test;

/*
 * 		对象::实例方法名
		类::静态方法名
		类::实例方法名
 */
public class MethodReferencesTest {

	//对象::实例方法名
	@Test
	public void test1(){
		new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
	}
	//lambda表达式
	Consumer<String> c1 = t->System.out.println(t);
	//方法的引用
	PrintStream ps = System.out;
	Consumer<String> c2 = ps::println;
	
	
	//类::静态方法名
	@Test
	public void test2(){
		new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		
		//lambda表达式
		Function<String, Integer> c1 = t-> Integer.parseInt(t);
		//方法的调用
		Function<String, Integer> c2 = Integer::parseInt;
		
		
		
	}
	
	
	
	//类::实例方法名
	@Test
	public void test3(){
		
		new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		
		//lambda表达式
		Comparator<String> c1 = (o1,o2)-> o1.compareTo(o2);
		//方法的引用
		Comparator<String> c2 = String::compareTo;
	}
	
	
	
	
	
}
