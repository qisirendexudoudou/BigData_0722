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

public class ZookeeperWatcherTest2 {
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

				}
			});
		}
	
	@After
	public void closeZk() throws Exception {
		if (zooKeeper != null) {
			zooKeeper.close();
		}
	}

	
	
	
/*	@Test
	public void getWatch() throws Exception {
		
		byte[] data = zooKeeper.getData("/hi", new Watcher() {
			
			@Override
			public void process(WatchedEvent event) {
				System.out.println(event.getPath()+"发生了事件："+ event.getType());
				try {
					getWatch();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}, null);
		
		System.out.println("当前最新数据是：" + new String(data));
		
		
		while (true) {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"运行中...");
		}
	}*/
	
	public String setWatcher(String path) throws KeeperException, Exception {
		byte[] data = zooKeeper.getData(path, new Watcher() {
			
			@Override
			public void process(WatchedEvent event) {
				try {
					System.out.println(event.getPath()+"发生了事件："+ event.getType());
					String newData = setWatcher(path);
					System.out.println("新的数据是："+newData);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, null);
		
		return new String(data);
	} 
	
	@Test
	public void getWatch() throws Exception {
		
		String path="/hi";
		String data=setWatcher(path);	
		System.out.println("当前最新数据是：" + data);
		
		
		while (true) {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"运行中...");
		}
	}
}
