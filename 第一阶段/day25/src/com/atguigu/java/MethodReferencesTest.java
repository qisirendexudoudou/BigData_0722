package com.atguigu.java;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.Test;

/*
	1. 当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用！
	2. 方法引用可以看做是Lambda表达式深层次的表达。换句话说，方法引用就是Lambda表达式，
			也就是函数式接口的一个实例，通过方法的名字来指向一个方法，可以认为是Lambda表达式的一个语法糖。
	3.要求：实现接口的抽象方法的参数列表和返回值类型，必须与方法引用的方法的参数列表和返回值类型保持一致！
	4.格式：使用操作符 “::” 将类(或对象) 与 方法名分隔开来。
		如下三种主要使用情况：
		对象::实例方法名
		类::静态方法名
		类::实例方法名

 */
public class MethodReferencesTest {
	
	/*
	 * 类 :: 实例方法名 (特殊的写法)
	 */
	@Test
	public void test3(){
		new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			
				//public int compareTo(String o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("-----------------lambda--------------------");
		
		 Comparator<String> c = (o1,o2) -> o1.compareTo(o2);
		 
		 System.out.println("----------------方法的引用------------------");
		 
		 Comparator<String> c2 =  String::compareTo;
	
	}
	
	
	/*
	 * 类::静态方法名
	 */
	@Test
	public void test2(){
		new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				
				/*
				 * public static int parseInt(String s) throws NumberFormatException {
        				return parseInt(s,10);
    				}
				 */
				return Integer.parseInt(t);
			}
		};
		
		System.out.println("------------------lambda------------------------");
		
		Function<String,Integer> fun = t -> Integer.parseInt(t);
		
		System.out.println("---------------方法的引用--------------------------");
		
		Function<String,Integer> fun2 = Integer::parseInt;
	}

	/*
	 * 对象::实例方法名
	 */
	@Test
	public void test(){
		
		new Consumer<String>() {

			@Override
			public void accept(String t) {
				
				//当方法体中只调用了方法时，且调用的方法（方法的引用）的形参列表和返回值类型,必须和接口的抽象方法保持一致。
				System.out.println(t);
//				  public void println(String x) {
//				  }
			}
		};
		
		System.out.println("--------------lambda------");
		
		Consumer<String> con = t -> System.out.println(t);
		
		System.out.println("-----------方法的引用---------");
		
		PrintStream ps = System.out;
		Consumer<String> con2 = ps :: println;
		
	}
}
