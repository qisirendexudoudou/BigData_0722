package com.atguigu.java3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

/**
 * 
 * 标准输入输出流
 * 
 * System.in : 读取键盘的数据
 * 
 * System.out ：将内容输出到控制台
 */
public class IOTest {

	/*
	 * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。
	 * 然后继续进行输入操作，直至当输入“e”或者“exit”时，退出程序。
	 */
	@Test
	public void test() throws Exception{
		
		//1.将字节流转成字符流
		InputStreamReader isr = new InputStreamReader(System.in);
		//2.使用缓冲流 - 可以一行一行的读取数据
		BufferedReader br = new BufferedReader(isr);
		//3.一行一行的读取数据
		while(true){
			String str = br.readLine();
			//判断
			if("e".equals(str) || "exit".equals(str)){
				//结束
				//关流
				br.close();
				isr.close();
				return;
			}else{
				System.out.println(str.toUpperCase());
			}
		}
	}
}
