package com.atguigu.java;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayToCollection {

	/**
	 * 将数组转成集合
	 */
	@Test
	public void test(){
		
		String[] names = {"aa"};
		
//		List asList = Arrays.asList("aa","cc","dd");
		List asList = Arrays.asList(new String[]{"aa","bb","cc"});
		
		for (Object obj : asList) {
			System.out.println(obj);
		}
	}
}
