package com.atguigu.java3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import org.junit.Test;

/*
 UDP协议：
	1.将数据、源、目的封装成数据包，不需要建立连接
	2.每个数据报的大小限制在64K内
	3.发送不管对方是否准备好，接收方收到也不确认，故是不可靠的
	4.可以广播发送
	5.发送数据结束时无需释放资源，开销小，速度快

 */
public class UDPTest {

	/*
	 * 发送
	 */
	@Test
	public void test() throws Exception{
		//创建DatagramSocket对象
		DatagramSocket ds = new DatagramSocket();
		//需发送的内容
		String str = "qianggeyuema";
		
		/*
		 * DatagramPacket(byte buf[], int offset, int length,
                          InetAddress address, int port)
           	第一个参数 ： 发送的内容的字节数组
           	第二个参数 ：从数组的哪个位置开始发送
           	第三个参数 ：发送的内容的长度
           	第四个参数 ：接收方的地址
           	第五个参数 ：接收方的端口号
		 */
		//创建数据包、数据报
		DatagramPacket p = new DatagramPacket(str.getBytes(), 0, str.length(), 
					InetAddress.getLocalHost(), 9989);
		//发送数据
		ds.send(p);
		//关闭资源
		ds.close();
	}
	
	/*
	 * 接收
	 */
	@Test
	public void test2() throws Exception{
		//创建DatagramSocket对象
		DatagramSocket ds = new DatagramSocket(9989);
		
		//创建数组 - 数组中用于存放接收的内容
		byte[] b = new byte[1024];
		
		/*
		 * DatagramPacket(byte buf[], int length)
		 * 第一个参数：用于接收数据的数组
		 * 第二个参数：数组用于接收内容的长度。
		 */
		//创建数据包用于接收数据
		DatagramPacket p = new DatagramPacket(b, b.length);
		//接收数据
		ds.receive(p);
		
		//展示数据 - p.getLength()接收到的数据的长度
		System.out.println("强哥:" + new String(b,0,p.getLength()));
		//关闭资源
		ds.close();
	}
}
















