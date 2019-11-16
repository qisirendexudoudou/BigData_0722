package com.atguigu.lgl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


/*
 * lambda表达式
 */
public class LambdaTest {

		
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
		
		System.out.println("----------------");
		
		list.stream()
			.filter(p->p.score >=60)
			.forEach(System.out::println);
	}
	

	
}
