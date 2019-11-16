package com.atguigu.lgl2;

import java.io.File;
import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LambdaTest {
	
	//创建集合 将人员的信息添加到集合中
	static List<Person> list = new ArrayList<>();
	static {
		list.add(new Person("a", 15, 70));
		list.add(new Person("b", 29, 20));
		list.add(new Person("c", 20, 90));
		list.add(new Person("d", 18, 50));
	}
	
	//lambda表达式加StreamAPI
	@Test
	public void test3(){
		list.stream().filter(p -> p.age >=20 ).forEach(System.out::println);
	}
	
	//lambda表达式
	@Test
	public void test2(){
		List<Person> filter = filter(list, p -> p.age >= 20);
		for (Person person : filter) {
			System.out.println(person);
		}
		System.out.println("---");
		
		List<Person> filter2 = filter(list, p -> p.score >= 60);
		for (Person person : filter2) {
			System.out.println(person);
		}
	}

//原始写法
	@Test
	public void test(){
		List<Person> filter = filter(list, new FilterInterface() {
			
			@Override
			public boolean filter(Person p) {
				if (p.score >= 60) {
					return true;
				}else{
				return false;
				}
			}
		});
		
		for (Person person : filter) {
			System.out.println(person);
		}
	}
	
	
	
	
	//过滤方法
	public List<Person> filter(List<Person> list,FilterInterface filterInterface){
		List<Person> persons = new ArrayList<>();
		for (Person person : list) {
			if (filterInterface.filter(person)) {
				persons.add(person);
			}
		}
		return persons ;
	}
	
}



