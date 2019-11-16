package com.atguigu.java3;

import java.io.File;

import org.junit.Test;

/**
	
	1.File用来表示一个文件（.txt , .mp3 , .mp4 , .avi）或者目录
 */
public class FileTest {

	@Test
	public void test(){
		//表示一个文件
		File f = new File("D:\\io\\1.txt");
		File f2 = new File("D:/io/1.txt");
		//表示一个目录
		File f3 = new File("D:\\io");
		
		/*
		 * 相对路径：相对于当前工程（目录）下
		 * 绝对路径：包含盘符在内的完整路径
		 */
		File f4 = new File("123.txt");//相对路径
		File f5 = new File("E:\\0722\\code\\day20\\123.txt");//绝对路径
		
		/*
		 * 构造器
		 */
		new File("D:\\io", "1.txt");//"D:\\io\\1.txt"
		
	}
}
