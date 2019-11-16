package com.atguigu.exer;

import org.junit.Test;

public class Demo {
	
	@Test
	public void test3(){
		Integer i = new Integer(1);
	    Integer j = new Integer(1);
	    System.out.println(i == j);//false
	    
	    /*
	     * 在底层 如果是 -128 ~　127 那么就会从数组中取出对应的Integer对象。
	     * 取同一个位置上的对象取多少次都是一样的。
	     */
	    Integer m = 1;
	    Integer n = 1;
	    System.out.println(m == n);//true

	    Integer x = 128;
	    Integer y = 128;
	    System.out.println(x == y);//false


	}
	
	@Test
	public void test2(){
		Object o2;
		if (true)
		    o2 = new Integer(1);
		else
		    o2 = new Double(2.0);
		System.out.println(o2);//

	}

	@Test
	public void test(){
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);//1.0
	}
}
