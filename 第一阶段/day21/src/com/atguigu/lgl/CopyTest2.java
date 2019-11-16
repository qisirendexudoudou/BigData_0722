package com.atguigu.lgl;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

public class CopyTest2 {

	@Test
	public void test() throws Exception{
		copy("333.txt", "7766.txt");
	}
	
	public void copy(String src,String desc) throws Exception{
		File srcfile = new File(src);
		File descfile = new File(desc);
		
		FileInputStream fis = new FileInputStream(srcfile);
		FileOutputStream fos = new FileOutputStream(descfile);
		
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = fis.read(b)) != -1) {
			fos.write(b, 0, len);
		}
		
		fis.close();
		fos.close();
	}

}

