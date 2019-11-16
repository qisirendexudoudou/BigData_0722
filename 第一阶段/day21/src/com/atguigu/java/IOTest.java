package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

/*
 	一 流的分类：
	 	按操作数据单位不同分为：字节流(8 bit)，字符流(16 bit)  
		按数据流的流向不同分为：输入流，输出流
		按流的角色的不同分为：节点流，处理流

	二 四个抽象基类 ：InputStream  OutputStream  Reader  Writer
 */
public class IOTest {
	
	/**
	 * FileOutputStream
	 * @throws Exception 
	 * 
	 * 注意 ： 读取的文件必须存在，写入的文件可以不存在会自动创建
	 */
	@Test
	public void test3() throws Exception{
		//1.创建File对象
		File file = new File("222.txt");
		
		/*
		 * FileOutputStream(File file, boolean append)
		 * apppend : 如果为true表示内容进行追加，如果为false表示内容覆盖，
		 *  new FileOutputStream(file)构造器默认为false
		 */
		//2.创建流的对象
		FileOutputStream fos = new FileOutputStream(file,false);
		//3.写数据 : 注意 ： 下面是一次操作（只要close就认为是一次操作）
		fos.write("aaa".getBytes());
		fos.write("ccc".getBytes());
		fos.write("ddd".getBytes());
		//4.关流
		fos.close();
	}
	
	/**
	 * 完整版
	 */
	public void test2(){
		FileInputStream fis = null;
		try {
			//1.创建File对象
			File file = new File("123.txt");
			//2.创建流的对象
			fis = new FileInputStream(file);
			//3.读取内容
			byte[] b = new byte[5];
			int length;
			while((length = fis.read(b)) != -1){
				System.out.println("length=" + length);
				System.out.println(new String(b,0,length));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fis != null){
				//4.关流
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	/**
	 	FileInputStream
	 * @throws FileNotFoundException 
	 */
	@Test
	public void test() throws Exception{
		
		//1.创建File对象
		File file = new File("333.txt");
		//2.创建流的对象
		FileInputStream fis = new FileInputStream(file);
		//3.读取内容
		int n = 0; //接收读取的内容 
		/*
		 * read() : 返回读取的内容，如果没有更多内容返回-1
		 */
//		while((n = fis.read()) != -1){
//			System.out.println((char)n);
//		}
		
		
		//第二种方式
		/*
		 * read(byte[] b) : 将读取的内容存到b数组中。返回读取的内容的长度，如果没有更多的内容返回-1
		 * 
		 * 注意 ： 影响读取速度的关键是数组的大小
		 */
		byte[] b = new byte[5];
		int length;
		while((length = fis.read(b)) != -1){
//			System.out.println("length=" + length);
//			System.out.println(new String(b,0,length));
			
			for (byte c : b) {
				System.out.println((char)c);
			}
		}
		
		//4.关流
		fis.close();
	}
}









