package com.atguigu.lgl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class IOCharTest {
	
	@Test
	public void test() throws Exception{
		copy("Filetest\\1.txt", "Filetest\\3.txt");
	}

	public void copy(String src,String desc) throws Exception{
		
		File srcfile = new File(src);
		File descfile = new File(desc);
		
		FileReader fr = new FileReader(srcfile);
		FileWriter fw = new FileWriter(descfile);
		
		char[] b = new char[1024];
		int len = 0 ;
		while ((len = fr.read(b)) != -1) {
			fw.write(b, 0, len);
		}
		
		fw.close();
		fr.close();
	
	}
}
