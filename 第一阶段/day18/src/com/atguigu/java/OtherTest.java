package com.atguigu.java;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

public class OtherTest {

	/*
	 * java.lang.Math提供了一系列静态方法用于科学计算。其方法的参数和返回值类型一般为double型。
	 */
	@Test
	public void test(){
		
		System.out.println(Math.abs(-5));
		
		System.out.println(Math.max(10.3, 10.5));
	}
	
	/*
	 * java.math包的BigInteger可以表示不可变的任意精度的整数。BigInteger 
	 * 提供所有 Java 的基本整数操作符的对应物，并提供 java.lang.Math 的所有相关方法。
	 * 另外，BigInteger 还提供以下运算：模算术、GCD 计算、质数测试、素数生成、位操作以及一些其他操作。 
	 */
	@Test
	public void test3(){
		int maxValue = Integer.MAX_VALUE;//2147483647
		maxValue = maxValue + 1;
		System.out.println(maxValue);
		
		System.out.println("-----------------------------------------------");
		
		BigInteger a = new BigInteger(String.valueOf(2147483647));
		BigInteger b = new BigInteger(String.valueOf(1));
		BigInteger sum = a.add(b);
		System.out.println(sum);
	}
	
	/*
	 * 一般的Float类和Double类可以用来做科学计算或工程计算，但在商业计算中，要求数字精度比较高，
	 * 故用到java.math.BigDecimal类。

	 */
	@Test
	public void test4(){
		System.out.println(1 - 0.41);
		
		System.out.println("-----------------------------------");
		
		BigDecimal a = new BigDecimal(String.valueOf(1));
		BigDecimal b = new BigDecimal(String.valueOf(0.41));
		BigDecimal c = a.subtract(b);
		System.out.println(c);
	}
}














