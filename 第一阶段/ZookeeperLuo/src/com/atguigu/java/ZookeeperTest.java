package com.atguigu.java;

import java.util.List;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Test;

public class ZookeeperTest {
	
	private String connectString="hadoop101:2181,hadoop102:2181,hadoop103:2181";
	private int sessionTimeout=30000;
	private ZooKeeper zooKeeper;
	
	@Test
	public void test1() throws Exception {
		zooKeeper=new ZooKeeper(connectString, sessionTimeout, new Watcher() {
			
			//当监听的节点发生指定的事件时，自动通知watcher 调用其process()方法
			@Override
			public void process(WatchedEvent event) {
				System.out.println("调用了process（）方法"); 
			}
		});
		System.out.println(zooKeeper.getState());
		
		List<String> children = zooKeeper.getChildren("/hi", false);
		
		System.out.println(children);
	}

}
