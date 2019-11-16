package com.atguigu.java2;

public class Person<T> {

	T t; //属性

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

/**
 * 
	1.泛型类型的属性不能使用static修饰，因为泛型的类型是在创建对象的时候指明的
	2.静态方法中不能调用泛型类型的属性。
 */
class Student<K,T,V> {

	T t;
	K k;
	V v;

	public static void show(){
//		System.out.println(t + " " + k + " " + v);
	}
	
}
