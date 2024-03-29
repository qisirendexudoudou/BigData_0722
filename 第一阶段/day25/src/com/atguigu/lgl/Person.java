package com.atguigu.lgl;

public class Person {

	String name;
	int age;
	int score;
	
	
	public Person(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}


	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + ", score=" + score + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
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
		if (score != other.score)
			return false;
		return true;
	}
	
	
	
	
}
