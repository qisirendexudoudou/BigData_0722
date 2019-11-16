package com.atguigu.java2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

/**

	字符流
	
	说明：字节流和字符流的使用场景：
	
	字节流：用来复制文件的内容。（任何文件都可以）
	字符流 ： 一般用来读取文本内容。
 */
public class IOCharTest {
	
	/**
	 * 使用字符流进行文件的复制
	 * @throws Exception 
	 */
	@Test
	public void copy() throws Exception{
		
		FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\aaa.avi");
		FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\ccc.avi");
		
		char[] c = new char[1024];
		int len = 0;
		while((len = fr.read(c)) != -1){
			fw.write(c, 0, len);
		}
		
		fw.close();
		fr.close();
	}
	
	
	@Test
	public void test2() throws Exception{
		FileWriter fw = new FileWriter("777.txt");
		
		fw.write("中国我爱你".toCharArray());
		
		fw.close();
	}

	@Test
	public void test() throws Exception{
		
		//1.创建流的对象
		FileReader fr = new FileReader("333.txt");
		
		char[] c = new char[1024];
		int len = 0;
		//2.读取内容
		while((len = fr.read(c)) != -1){
//			System.out.println(new String(c,0,len));
			System.out.println(Arrays.toString(c));
		}
		
		//3.关流
		fr.close();
	}
}
