package com.atguigu.zookeeper.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

public class TestZookeeperWatcher {

	// 可以使用逗号分割集群中多个服务实例的主机名和端口号
	private String connectString="hadoop101:2181,hadoop102:2181,hadoop103:2181";
	//sessionTimeout 必须在 最小和最大超时时间之内才有效，否则会自动根据就近原则选择合适的时间
	private int sessionTimeout=30000;
	
	private ZooKeeper zooKeeper;
	
	private CountDownLatch cdl=new CountDownLatch(1);

	/*
	 * zkCli.sh -server 主机名:2181
	 */
	@Before
	public void testConnect() throws IOException, KeeperException, InterruptedException {
		
		// 创建一个Zookeeper客户端对象，需要提供一个默认的观察者，当执行设置观察者时，不指定其他观察者，使用默认的
		 zooKeeper = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
			
			// process()就是当 监听的节点发生了指定的事件时，自动通知watcher，调用其process方法！
			@Override
			public void process(WatchedEvent event) {
				
				/*System.out.println("执行了默认观察者的回调方法！");
				
				System.out.println(event.getPath()+"发送了事件："+event.getType());
				
				// 重新读取节点的内容
				try {
					// 持续监听，在回调方法中继续设置观察者
					List<String> newData = zooKeeper.getChildren("/hi", true);
					
					System.out.println(newData);
				} catch (KeeperException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
			}
		});

	}
	
	//  |  ls path watch | stat path watch 
	@Test
	public void lsWatch() throws Exception {
		
		List<String> children = zooKeeper.getChildren("/hi", true);
		
		System.out.println(children);
		
		//阻塞进程
		while(true) {
			
			Thread.sleep(5000);
			
			System.out.println("我还没死....");
			
		}
		
	}
	
	// get path watch： 错误师范
	@Test
	public void testGetWatch() throws Exception {
		
		byte[] data = zooKeeper.getData("/hi", new Watcher() {
			
			// Listener线程负责，不能阻塞Linstener线程
			@Override
			public void process(WatchedEvent event) {
				
				System.out.println(event.getPath()+"发生了事件："+event.getType());
				
				//cdl.countDown();
				try {
					testGetWatch();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}, null);
		
		System.out.println("当前的数据是："+new String(data));
		
		// 阻塞线程,当前线程阻塞，直到cdl变为0
		//cdl.await();
		while(true) {
			
			Thread.sleep(5000);
			
			System.out.println(Thread.currentThread().getName()+"我还没死....");
			
		}
		
	}
	
	public String getDataSetWatcher(String path) throws KeeperException, InterruptedException{
		
		
		byte[] data = zooKeeper.getData(path, new Watcher() {
			
			@Override
			public void process(WatchedEvent event) {
				
				try {
					String newData = getDataSetWatcher(path);
					
					System.out.println("新的数据是："+newData);
					
				} catch (KeeperException | InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}, null);
		
		return new String(data);
		
	}
	
	// 调用目标方法的线程阻塞
	@Test
	public void testgetWatch2() throws Exception {
		
		String path="/hi";
		
		String data = getDataSetWatcher(path);
		
		System.out.println("当前节点的数据是"+data);
		
		
		while(true) {
			
			Thread.sleep(5000);
			
			System.out.println(Thread.currentThread().getName()+"我还没死....");
			
		}
		
		
	}
	
	
	
	
	@Test
	public void close() throws Exception {
		
		if (zooKeeper != null) {
			zooKeeper.close();
		}
		
	}
	
	

}
