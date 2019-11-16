package com.atguigu.java4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void test() throws Exception{
		//1.创建FileUtils对象
		FileUtils fs = new FileUtils();
		//2.调用方法
		fs.write(new File("bbb.txt"), "abcdefg", "utf-8");
	}
	
	@Test
	public void test2() throws Exception{
		FileUtils fs = new FileUtils();
		
		@SuppressWarnings("static-access")
		String str = fs.readFileToString(new File("bbb.txt"), "utf-8");
		System.out.println(str);
	}
}
