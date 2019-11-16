package com.atguigu.lgl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 将数组转成集合
 * @author luogaolong
 *
 */
public class ArrayToCollection {
	
	@Test
	public void test2(){
		List asList = Arrays.asList(new String[]{"aa","bb"});
		for (Object o : asList) {
			System.out.println(o);
		}
	}

	
	@Test
	public void test(){
		
		String[] names = {"aa","cc","bb"};
		for (String name : names) {
			System.out.println(name);
		}
	}
}
