package com.atguigu.test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisSentinelPool;

public class MyRedisTest {
	
	//使用Jedis
	@Test
	public void test1() throws Exception {
		
		Jedis jedis = new Jedis("192.168.1.210", 6379);
		
		String result = jedis.ping();
		
		System.out.println(result);
		
	}

	@Test
	public void testSentinel() throws Exception {
		Set<String> set = new HashSet<>();
		// set中放的是哨兵的Ip和端口
		set.add("192.168.1.210:26379");
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
		JedisSentinelPool jedisSentinelPool = new JedisSentinelPool("mymaster", set, poolConfig, 60000);
		Jedis jedis = jedisSentinelPool.getResource();
		String value = jedis.get("k7");
		jedis.set("Jedis", "Jedis");
		System.out.println(value);
	}
	
	
	
	@Test
	public void testConnect() {
		//连接指定的redis，需要ip地址和端口号
		Jedis jedis=new Jedis("192.168.1.210", 6379);
		String ping = jedis.ping();
		System.out.println(ping);
	}
	
	//使用jedis连接池
	@Test
	public void testPool(){
		//默认的连接池配置
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
		System.out.println(poolConfig);
		JedisPool jedisPool=new JedisPool(poolConfig, "192.168.1.210", 6379,60000);
		Jedis jedis = jedisPool.getResource();
		String ping = jedis.ping();
		System.out.println(ping);
		//如果是从连接池中获取的，那么执行close方法只是将连接放回到池中
		jedis.close();
		jedisPool.close();}
	
	//集群的jedis开发
	@Test
	public void testCluster(){
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		//Jedis Cluster will attempt to discover cluster nodes automatically
		jedisClusterNodes.add(new HostAndPort("192.168.1.210", 6379));
		JedisCluster jc = new JedisCluster(jedisClusterNodes);
		jc.set("foo", "bar");
		String value = jc.get("foo");
		System.out.println(value);
	}

}
