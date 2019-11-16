package com.atguigu.java3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

/*
 TCP协议：
	1.使用TCP协议前，须先建立TCP连接，形成传输数据通道
	2.传输前，采用“三次握手”方式，点对点通信，是可靠的
	3.TCP协议进行通信的两个应用进程：客户端、服务端。
	4.在连接中可进行大数据量的传输
	5.传输完毕，需释放已建立的连接，效率低

 */
public class TCPTest {

	@Test
	public void client() throws Exception, Exception{
		/*
		 * Socket(String host, int port)
		 * 第一个参数 ：服务器的地址
		 * 第二个参数：服务器的端口号
		 */
		Socket socket = new Socket(InetAddress.getLocalHost(), 6636);
		//获取输出流（向服务器端发数据）
		OutputStream os = socket.getOutputStream();
		os.write("abcdefg".getBytes());
		//通知服务器数据发送完毕
		socket.shutdownOutput();
		
		//接收客户端发送的数据
		InputStream is = socket.getInputStream();
		byte[] b = new byte[1024];
		int len = 0;
		while((len = is.read(b)) != -1){
			System.out.println("客户端：" + new String(b,0,len));
		}
		
		//关闭资源
		os.close();
		is.close();
		socket.close();
	}
	
	@Test
	public void Server() throws Exception{
		/*
		 *  ServerSocket(int port) ： 参数是端口号
		 */
		ServerSocket ss = new ServerSocket(6636);
		//接收客户端的请求
		Socket socket = ss.accept();
		//获取输入流（读取客户端发过来的数据）
		InputStream is = socket.getInputStream();
		byte[] b = new byte[1024];
		int len = 0;
		while((len = is.read(b)) != -1){
			System.out.println("服务器：" + new String(b,0,len));
		}
		
		
		//给客户端发送数据
		OutputStream os = socket.getOutputStream();
		os.write("AAAAAAAAAAAA".getBytes());
		socket.shutdownOutput();//通知客户端数据发送完毕
		
		//关闭资源
		is.close();
		os.close();
		socket.close();
		ss.close();
	}
}





















