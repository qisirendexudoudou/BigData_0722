package com.atguigu.test;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class APITest {

	
	@SuppressWarnings("resource")
	@Test
	public void testKeys() throws Exception {
		
		Jedis jedis = new Jedis("192.168.1.210", 6379);
		
		Set<String> keys = jedis.keys("*");
		
		System.out.println(keys);
		
		for (String key : keys) {
			System.out.println(key);
		}
		
		System.out.println(jedis.exists("k2"));
		
		System.out.println(jedis.type("k1"));
		
		System.out.println(jedis.del("k2"));

	}
	
	@Test
	public void testString() throws Exception {
		Jedis jedis = new Jedis("192.168.1.210", 6379);
		System.out.println(jedis.get("k1"));
		
		System.out.println(jedis.msetnx("k11","v11","k12","v12"));
		
		
		
	}
}
