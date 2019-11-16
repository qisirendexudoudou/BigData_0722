package com.atguigu.lgl2;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;
import org.junit.runner.notification.RunNotifier;

//lambda表达式的语法
public class LambdaTest3 {
	
	//语法格式六：当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
	@Test
	public void test6(){
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("aa");
				return 0;
			}
		};
		System.out.println("--------");
		Comparator<Integer> comparator2 = (o1,o2)->0;
	}
	
	//语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
	@Test
	public void test5(){
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("aa");
				return 0;
			}
		};
		System.out.println("-------");
		Comparator<Integer> comparator2 = (o1,o2)->{System.out.println("aa");
			return 0;
		};
		
	}
	
	//语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
	@Test
	public void test4(){
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("aa");
			}
		};
		System.out.println("--------");
		Consumer<String> consumer2 = t->System.out.println("aa");
	}
	
	
	
	//数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
	@Test
	public void test3(){
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("aa");
			}
		};
		System.out.println("--------");
		Consumer<String> consumer2 = (t) -> System.out.println("aa");
	}
	
	//语法格式二：Lambda 需要一个参数，但是没有返回值
	@Test
	public void test2(){
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("aa");
			}
		};
		System.out.println("-------");
		Consumer<String> consumer2 = (String t) -> System.out.println("aa");
	}

	//语法格式一：无参，无返回值
	@Test
	public void test1(){
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
			System.out.println("aa");
			}
		};
		System.out.println("-------");
		Runnable runnable2 = (()->System.out.println("aa"));
	}
}
