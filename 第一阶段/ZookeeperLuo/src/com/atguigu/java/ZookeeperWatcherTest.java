package com.atguigu.java;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZookeeperWatcherTest {
	private String connectString="hadoop101:2181,hadoop102:2181,hadoop103:2181";
	private int sessionTimeout=30000;
	private ZooKeeper zooKeeper;
	
	@Before
	public void init() throws Exception {
		//创建zookeeper客户端，需要提供一个默认的观察者，
		//当执行设置默认观察者时，如果没有设置，就使用默认的观察者
			zooKeeper=new ZooKeeper(connectString, sessionTimeout, new Watcher() {
				
				//当监听的节点发生指定的事件时，自动通知watcher 调用其process()方法
				@Override
				public void process(WatchedEvent event) {
					System.out.println("调用了默认观察者的process（）方法"); 
					System.out.println(event.getPath()+"发生了事件："+ event.getType());
					
					//发生事件后重新读取数据
					try {
						//持续监听  在回调方法中继续设置观察者
						List<String> children = zooKeeper.getChildren("/hi", true);
						System.out.println(children);
					} catch (KeeperException | InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	
	@After
	public void closeZk() throws Exception {
		if (zooKeeper != null) {
			zooKeeper.close();
		}
	}
	
	@Test
	public void lsWatch() throws Exception {
		
		List<String> children = zooKeeper.getChildren("/hi", true);
		System.out.println(children);
		
		while (true) {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"运行中...");
		}
	}
	
	
	
	@Test
	public void getWatch() throws Exception {
		
	}
	
	
	

}
