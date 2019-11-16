package com.atguigu.java4;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LambdaTest {

	static List<Person> list = new ArrayList<>();
	static{
		list.add(new Person("aa", 18, 100));
		list.add(new Person("adc", 20, 50));
		list.add(new Person("ddcc", 30, 90));
		list.add(new Person("eeff", 16, 59));
	}
	
	/*
	 * lambda表达式加StreamAPI
	 */
	@Test
	public void test3(){
		list.stream().filter(p -> p.age >= 20).forEach(System.out::println);
	}
	
	/*
	 * 演示lambda表达式
	 */
	@Test
	public void test2(){
		System.out.println("------------使用lambda表达式简化匿名内部类--------------");
		
		List<Person> filter = filter(list, p ->  p.score >= 60);
	}
	
	
	/*
	 * 最原始的写法
	 */
	@Test
	public void test(){
		
		
		List<Person> filter = filter(list, new FilterInterface() {
			
			@Override
			public boolean filter(Person p) {
				System.out.println("--------filter-----");
				if(p.score >= 60){
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
	
	
	/*
	 * 方法就是用来过滤对象的（具体过滤的条件由接口实现类重写的方法决定）
	 */
	//获取年纪大于20岁的人
	public List<Person> filter(List<Person> list,FilterInterface filterInterface){
		List<Person> persons = new ArrayList<>();
		for (Person person : list) {
			//调用接口的方法来确定是否添加 - 根据实现类重写的方法的条件决定是否添加
			//多态 - 传的实现类的对象是谁就调用谁的filter方法
			if(filterInterface.filter(person)){
				persons.add(person);
			}
		}
		return persons;
	}
}















