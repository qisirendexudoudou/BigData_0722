package com.atguigu.lgl;

import java.util.HashMap;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void test(){
		HashMap map = new HashMap();
		map.put("a", "A");
		map.put("b", "A");
		map.put("c", "A");
		System.out.println(map);
	}
}
