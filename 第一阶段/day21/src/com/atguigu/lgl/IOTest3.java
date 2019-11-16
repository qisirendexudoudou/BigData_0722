package com.atguigu.lgl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

public class IOTest3 {

	@Test
	public void test() throws Exception{
		copy("333.txt", "76.txt");
	}
	
	@SuppressWarnings("resource")
	public void copy(String src,String desc) throws Exception{
		
		File srcfile = new File(src);
		File descfile = new File(desc);
		
		FileInputStream fis = new FileInputStream(srcfile);
		FileOutputStream fos = new FileOutputStream(descfile);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = bis.read(b)) != -1) {
			bos.write(b, 0, len);
		}
		
		bos.close();
		bis.close();
		fos.close();
		fis.close();
		
	}
}
