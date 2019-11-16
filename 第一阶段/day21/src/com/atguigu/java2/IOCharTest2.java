package com.atguigu.java2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 
 	字符缓冲流
 */
public class IOCharTest2 {
	
	
	/**
	 * BufferedWriter
	 */
	@SuppressWarnings("resource")
	@Test
	public void  test2() throws Exception{
		
		FileWriter fw = new FileWriter("666.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("小泽老师我爱你");
		bw.flush(); //刷新 - 将内存中的数据刷新到文件中
		
		bw.write("小泽老师我爱你");
		bw.flush(); //刷新 - 将内存中的数据刷新到文件中
		
		bw.write("小泽老师我爱你");
		bw.flush(); //刷新 - 将内存中的数据刷新到文件中
		
		bw.close();
		fw.close();
	}

	/**
	 * BufferedReader
	 */
	@Test
	public void test() throws Exception{
		
		FileReader fr = new FileReader("777.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		char[] c = new char[1024];
//		int len = 0;
//		while((len = br.read(c)) != -1){
//			System.out.println(new String(c,0,len));
//		}
		
		//第二种方式 ： readLine() ： 每次读取一整行如果没有更多的内容就返回null
		String str = null;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		
		br.close();
		fr.close();
	}
}
