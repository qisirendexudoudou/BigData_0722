package com.atguigu.java2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 泛型在继承上的体现
 */
public class GenericTest4 {

	/*
	 *  Object <- Number <- Interger
	 *  
	 *  使用了泛型的类，接口，方法 在进行编译的时候会进行类型擦除。（字节码中没有泛型）
	 */
	@Test
	public void test(){
		
		//泛型声明和对象上的泛型类型必须保持一致 （下面的写法不对）
//		ArrayList<Number> list = new ArrayList<Integer>();
		
		
		ArrayList<Number> list2 = new ArrayList<Number>();
		//下面的代码不对 ： 实参的泛型类型是Number形参的泛型类型是Integer不匹配。
//		set(list2);
		
		
		//下面的写法在jdk1.7开始支持
		List<Number> list3 = new ArrayList<>();
		//下面的方式不推荐
		List<Number> list5 = new ArrayList();
		
		
		//泛型没有起作用。
		List list4 = new ArrayList<Number>();
		list4.add("ccc");
		list4.add(111);
	}
	
	
	public void set(ArrayList<Integer> list){
		
	}
}
