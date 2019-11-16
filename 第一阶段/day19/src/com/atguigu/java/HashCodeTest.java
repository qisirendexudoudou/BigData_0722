package com.atguigu.java;

public class HashCodeTest {
	
	String name;
	int age;
	
	
	
	public HashCodeTest(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		HashCodeTest ht = new HashCodeTest("aa",18);
		System.out.println(ht.hashCode());
		System.out.println(ht.hashCode());
		System.out.println(ht.hashCode());
		
		
		HashCodeTest ht2 = new HashCodeTest("aa",18);
		System.out.println(ht2.hashCode());
		System.out.println(ht2.hashCode());
		System.out.println(ht2.hashCode());
	}
	/*
	 * 重写hashCode方法的规则：
	 *  1.在程序运行时，同一个对象多次调用 hashCode() 方法应该返回相同的值。
		2.当两个对象的 equals() 方法比较返回 true 时，这两个对象的 hashCode() 方法的返回值也应相等。
		3.对象中用作 equals() 方法比较的 Field，都应该用来计算 hashCode 值。
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//下面的方式是为了降低发生碰撞的概率
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
		HashCodeTest other = (HashCodeTest) obj;
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
