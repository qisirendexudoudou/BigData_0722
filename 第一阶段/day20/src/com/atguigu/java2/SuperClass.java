package com.atguigu.java2;


/*
 * 需求 : 通过子类指明父类的泛型类型
 */
//方式一 : 子类在继承父类的时候就指明父类的泛型类型
//class SubClass extends SuperClass<String>{
//	
//}

//方式二 : 通过创建子类的对象时候指明父类的泛型类型
class SubClass<T> extends SuperClass<T>{
	
}

public class SuperClass<T> {

	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
