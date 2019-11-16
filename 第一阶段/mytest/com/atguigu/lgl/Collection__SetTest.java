package com.atguigu.lgl;

import java.util.HashSet;
import java.util.Set;

public class Collection__SetTest {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("aa");
		set.add("bb");
		set.add("cc");
		set.add("bb");//无序的不可重复的
		System.out.println(set);
		
		System.out.println("---------------------");
		
		HashSet set2 = new HashSet();
		
		set2.add("aa");
		set2.add("bb");
		set2.add("cc");
		set2.add("bb");
		System.out.println(set);
		System.out.println("---------------------");
		
		HashSet set3 = new HashSet();
		
		Person p1 = new Person("aa", 18);
		set3.add(p1);
		Person p2 = new Person("aa", 18);
		set3.add(p2);
		
		System.out.println(set3);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	
	}
}

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "(" + name+ " " + age+ ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

	
	
	
}
