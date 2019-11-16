package com.atguigu.java;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZookeeperCURDTest {

	private String connectString="hadoop101:2181,hadoop102:2181,hadoop103:2181";
	private int sessionTimeout=30000;
	private ZooKeeper zooKeeper;
	
	@Before
	public void init() throws Exception {
			zooKeeper=new ZooKeeper(connectString, sessionTimeout, new Watcher() {
				
				//当监听的节点发生指定的事件时，自动通知watcher 调用其process()方法
				@Override
				public void process(WatchedEvent event) {
					System.out.println("调用了process（）方法"); 
				}
			});
		}
	
	@After
	public void closeZk() throws Exception {
		if (zooKeeper != null) {
			zooKeeper.close();
		}
	}

	
	//查看  ls
	@Test
	public void lsTest() throws Exception {
		
		List<String> children = zooKeeper.getChildren("/hi", false);
		System.out.println(children);
		
	}
	
	//增 create
	@Test
	public void createTest() throws Exception {
		String result = zooKeeper.create("/eclipse", "ecli".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		System.out.println("create: " + result);
		
	}
	
	//删 delete 删除单个节点
	@Test
	public void deleteTest() throws Exception {
		zooKeeper.delete("/eclipse", -1);
//		zooKeeper.delete("/hi", -1);
	}
	
	//删 delete 删除整个节点目录rmr
	@Test
	public void deleteAllTest() throws Exception {
		List<String> children = zooKeeper.getChildren("/hi", false);
		
		for (String child : children) {
			zooKeeper.delete("/hi/"+child, -1);
		}
			zooKeeper.delete("/hi", -1);
	}
	
	//set 设置节点数据
	@Test
	public void setDataTest() throws Exception {
		Stat setData = zooKeeper.setData("/hi", "hihi".getBytes(), -1);
		System.out.println(setData);
	}
	
	
	
	//get 查询节点数据
	@Test
	public void getDataTest() throws Exception {
		Stat stat = new Stat();
		byte[] data = zooKeeper.getData("/hi", false, stat);
		System.out.println(new String(data));
		System.out.println(stat);
	}
	
	//查看节点是否存在
	@Test
	public void existTest() throws Exception {
		Stat stat = zooKeeper.exists("/hi", false);
		if (stat != null) {
			System.out.println("当前节点存在！");
		}
		System.out.println("节点状态信息:\t\n"+stat);
	}
}
