package com.atguigu.lgl;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	/*
	 * 
	 * 相同的内容的哈希值是一样的（Object中的hashCode方法，只要对象不一样哈希值就不一样）
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}




	/**
	 * 比较的是内容
	 */
	@Override
	public boolean equals(Object obj) {
		System.out.println("----------------------------equals-----------------");
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




	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
