package com.atguigu.java;

import java.io.BufferedInputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

public class IOTest3 {
	
	@Test
	public void test3() throws Exception {
		long start = System.currentTimeMillis();
		copy("C:\\Users\\Administrator\\Desktop\\ccc.avi", "C:\\Users\\Administrator\\Desktop\\aaa.avi");
		long end = System.currentTimeMillis();
		System.out.println("time=" + (end - start));
	}

	
	@SuppressWarnings("resource")
	public void copy(String desc, String src) throws Exception {
		// 1.创建File对象
		File descFile = new File(desc);// 写
		File srcFile = new File(src);// 读

		// 2.创建流的对象
		// 创建输入流
		FileInputStream fis = new FileInputStream(srcFile);
		// 创建输出流
		FileOutputStream fos = new FileOutputStream(descFile);
		
		//创建缓冲流
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		// 3.一边读一边写
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = bis.read(b)) != -1) {
			// 写内容
			bos.write(b, 0, len);
		}

		// 4.关流
		bos.close();
		bis.close();
		fos.close();
		fis.close();
		
	}
	
	@SuppressWarnings("resource")
	@Test
	public void test2() throws Exception{
		//创建的节点流的对象
		FileOutputStream fos = new FileOutputStream("444.txt");
		//创建缓冲流的对象
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//写数据
		bos.write("abc".getBytes());
		
		//关流 ： 先关外面的再关里面的
		bos.close();
		fos.close();
		
		
	}

	//BufferedInputStream : 可以提高读取数据的速度
	@Test
	public void test() throws Exception{
		
		//创建的节点流的对象
		FileInputStream fis = new FileInputStream("333.txt");
		//创建缓冲流的对象
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//读取内容
		byte[] b = new byte[1024];
		int len = 0;
		while((len = bis.read(b)) != -1){
			System.out.println(new String(b,0,len));
		}
		
		//关流 ： 先关外面的再关里面的
		bis.close();
		fis.close();
	}
}
