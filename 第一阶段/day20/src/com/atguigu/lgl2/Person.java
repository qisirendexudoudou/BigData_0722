package com.atguigu.lgl2;

public class Person<T,I>{

	T t;//属性
	I i;//属性
	public T getT(){
		return t;
	}
	
	public void setT(T t){
		this.t = t;
	}
	
	
	public I getI(){
		return i;
	}
	
	public void setI(I i){
		this.i = i;
	}
	
	
	
	
	
}
