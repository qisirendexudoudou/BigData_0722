package com.atguigu.lgl2;

import org.junit.Test;

//自定义泛型方法
public class GenericTest3 {

	public static void main(String[] args) {
		
		Dog<String> dog = new Dog<String>();
		String string = dog.getE("aa", 1);
		System.out.println(string);
	}
}

class Dog<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	////泛型方法可以使用static修饰
	public static <E> E getE(E e,int i){
		return e;
		
	}
}