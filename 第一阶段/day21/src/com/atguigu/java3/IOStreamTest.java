package com.atguigu.java3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

import org.junit.Test;
/**

	转换流：
	
	作用 ：   1.读取文件时可以将字节流转成字符流  ，写出内容时可以将字符流转成字节流
		  2.可以将读取内容的编码集（utf-8）在写入另一个文件时变成另一种编码集(gbk)
 */
public class IOStreamTest {
	
	
	/*
	 * 编码集的转换
	 * 
	 * 注意 ： InputStreamReader中设置的编码集必须和读取文件内容的编码集一致
	 */
	@Test
	public void test2() throws Exception{
		
		FileInputStream fis = new FileInputStream("char8.txt");
		InputStreamReader isr = new InputStreamReader(fis,"gbk");
		
		FileOutputStream fos = new FileOutputStream("999.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		
		
		//一边读一边写
		char[] c = new char[1024];
		int len = 0;
		while((len = isr.read(c)) != -1){
			//写内容
			osw.write(c, 0, len);
		}
		
		//关流
		isr.close();
		osw.close();
		fos.close();
		fis.close();
	}
	/*
	 * 字节流和字符流的转换
	 */
	@Test
	public void test() throws Exception{
		
		FileInputStream fis = new FileInputStream("333.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		
		FileOutputStream fos = new FileOutputStream("999.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		
		//一边读一边写
		char[] c = new char[1024];
		int len = 0;
		while((len = isr.read(c)) != -1){
			//写内容
			osw.write(c, 0, len);
		}
		
		//关流
		isr.close();
		osw.close();
		fos.close();
		fis.close();
	}
}

interface MyInterface{
	void show(InputStream is);
}
