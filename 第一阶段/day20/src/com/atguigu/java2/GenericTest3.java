package com.atguigu.java2;

/*
 	自定义泛型方法
 */
public class GenericTest3 {

	public static void main(String[] args) {
		Dog<String> dog = new Dog<String>();
		
		String s = dog.getE("aaa","aaa",10);
		Integer number = dog.getE(111,"ccc",10);
	}
}

class Dog<T>{
	
	T t;
	
	public void setT(T t){
		this.t = t;
	}
	
	/**
	 * 自定义泛型方法
	 * 
	 * <E> : 泛型的声明
	 * 
	 * (E e) : 传入的实参是什么类型泛型就是什么类型
	 */
	public <E> E getE(E e,String name,int age){
		return e;
	}
	
	
	//泛型方法可以使用static修饰
	public static <E> E getE2(E e,String name,int age){
		return e;
	}
}











