package com.atguigu.zookeeper.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

public class TestZookeeper {

	// 可以使用逗号分割集群中多个服务实例的主机名和端口号
	private String connectString="hadoop101:2181,hadoop102:2181,hadoop103:2181";
	//sessionTimeout 必须在 最小和最大超时时间之内才有效，否则会自动根据就近原则选择合适的时间
	private int sessionTimeout=30000;
	
	private ZooKeeper zooKeeper;

	/*
	 * zkCli.sh -server 主机名:2181
	 */
	@Before
	public void testConnect() throws IOException, KeeperException, InterruptedException {
		
		// 创建一个Zookeeper客户端对象
		 zooKeeper = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
			
			// process()就是当 监听的节点发生了指定的事件时，自动通知watcher，调用其process方法！
			@Override
			public void process(WatchedEvent event) {
			}
		});
		
		//System.out.println(zooKeeper.getState());
		
		
	}
	
	// ls
	@Test
	public void ls() throws Exception {
		
		// 执行查看
		List<String> children = zooKeeper.getChildren("/", false);
				
		System.out.println(children);
	}
	
	// create [-s] [-e] path data acl
	@Test
	public void testCreate() throws Exception {
		
		// CreateMode: 节点类型
		String result = zooKeeper.create("/eclipse", "hello".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		
		System.out.println("created:"+result);
		
	}
	
	// 删除单个节点 delete
	@Test
	public void delete() throws Exception {
		
		zooKeeper.delete("/eclipse", -1);
		
	}
	
	// 删除整个节点及子节点 rmr
	@Test
	public void rmr() throws Exception {
		
		List<String> children = zooKeeper.getChildren("/hello", false);
		
		for (String child : children) {
			
			zooKeeper.delete("/hello/"+child, -1);
			
		}
		
		zooKeeper.delete("/hello", -1);
		
	}
	// get : 查询节点数据
	@Test
	public void getData() throws Exception {
		
		Stat stat = new Stat();
		
		byte[] data = zooKeeper.getData("/hi", false, stat);
		
		System.out.println(new String(data));
		
		System.out.println(stat);
		
	}
	
	// set : 设置节点数据
	@Test
	public void setData() throws Exception {
		
		zooKeeper.setData("/hi", "hello".getBytes(), -1);
		
	}
	
	// 查看节点是否存在: exists=stat path
	@Test
	public void exists() throws Exception {
		
		Stat stat = zooKeeper.exists("/hi", false);
		
		if (stat==null) {
			
			System.out.println("当前节点不存在！");
			
		}
		
		
	}
	
	@Test
	public void close() throws Exception {
		
		if (zooKeeper != null) {
			zooKeeper.close();
		}
		
	}
	
	

}
