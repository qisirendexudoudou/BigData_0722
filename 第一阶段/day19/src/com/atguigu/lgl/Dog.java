package com.atguigu.lgl;

public class Dog implements Comparable{
	String name;
	int age;
	
	public Dog(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "("+ name + " " + age + ")";
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Dog ) {
			Dog d = (Dog) o;
//			return this.age - d.age;
//			return this.name.compareTo(d.name);
			
			int c = this.name.compareTo(d.name);
			if (c == 0) {
				return this.age-d.age;
			}else{
				return c;
			}
		}
		return 0;
	}
	
	
}
