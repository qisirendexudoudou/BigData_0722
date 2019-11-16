package com.atguigu.java3;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/*
 URL(Uniform Resource Locator)：统一资源定位符，它表示 Internet 上某一资源的地址。

 */
public class URLTest {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://192.168.10.160:8080/123.txt");
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		
		//打开一个连接
		URLConnection openConnection = url.openConnection();
		HttpURLConnection conn =  (HttpURLConnection) openConnection;
		conn.connect();//连接服务器
		
	}
}
