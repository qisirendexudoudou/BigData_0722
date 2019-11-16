package com.atguigu.java;

import org.junit.Test;

public class WrapperTest2 {
	
	@Test
	public void test2(){
		demo(10);//自动装箱了 - 装箱成Integer，然后将Integer的对象赋值给obj
	}

	@Test
	public void test(){	
		Integer integer = new Integer(1);
		//Integer中的toString方法是重写Object类中的
		System.out.println(integer.toString());
		demo(integer);
	}
	
	public void demo(Object obj){
		System.out.println(obj instanceof Integer);
		//传的对象是谁，就调用谁的toString方法
		System.out.println(obj.toString());
	}
}
