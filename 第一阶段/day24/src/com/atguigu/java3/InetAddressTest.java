package com.atguigu.java3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws Exception {
		
		//获取本地地址
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println(localHost.getHostName());
		System.out.println(localHost.getHostAddress());
		
		System.out.println("--------------------------------");
		
		
		InetAddress byName = InetAddress.getByName("www.baidu.com");
		System.out.println(byName.getHostName());
		System.out.println(byName.getHostAddress());
	}
}
