package com.atguigu.lgl3;

import java.io.File;

import org.junit.Test;

public class IOTest {
	
	
	

	//File类的使用
	@Test
	public void test1(){
		
		File f1 = new File("G:\\luogaolong\\1.txt");
		System.out.println(f1);
		
		File f2 = new File("G:\\luogaolong");
		System.out.println(f2);
		
		System.out.println(f2.length());
	}
}
